package springdb.dbtest.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import springdb.dbtest.entity.User;
import springdb.dbtest.service.UserService;

@RequiredArgsConstructor
@EnableWebSecurity // 1
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter { // 2

    private final UserService userService; // 3

    @Override
    public void configure(WebSecurity web) { // 4 인증을 무시할 경로들을 설정해놓을 수 있습니다. static 하위 폴더 (css, js, img)는 무조건 접근이 가능해야하기 때문에 인증을 무시해야합니다.

        web.ignoring().antMatchers("/resources/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception { // 5 http 관련 인증 설정이 가능합니다
        http.csrf().disable();
        http
                .authorizeRequests() // 6
                .antMatchers("/**","/index","/board-main", "/resources/**", "/signup", "/board/**", "/auth/**").permitAll() // 누구나 접근 허용
                .antMatchers().hasRole("USER") // USER, ADMIN만 접근 가능
                .antMatchers("/admin").hasRole("ADMIN") // ADMIN만 접근 가능
                .anyRequest().authenticated() // 나머지 요청들은 권한의 종류에 상관 없이 권한이 있어야 접근 가능
                .and()
                .formLogin() // 7
                .loginPage("/signup") // 로그인 페이지 링크
                .loginProcessingUrl("/auth/login")
                .defaultSuccessUrl("/") // 로그인 성공 후 리다이렉트 주소
                .and()
                .logout() // 8
                .logoutSuccessUrl("/login") // 로그아웃 성공시 리다이렉트 주소
                .invalidateHttpSession(true) // 세션 날리기
        ;
    }


    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception { // 9
              auth.userDetailsService(userService)
                .passwordEncoder(new BCryptPasswordEncoder());
//        auth.userDetailsService(userService)
//                // 해당 서비스(userService)에서는 UserDetailsService를 implements해서
//                // loadUserByUsername() 구현해야함 (서비스 참고)
//                .passwordEncoder(new BCryptPasswordEncoder());
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }




}