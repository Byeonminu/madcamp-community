package springdb.dbtest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import springdb.dbtest.dto.UserDto;
import springdb.dbtest.entity.User;
import springdb.dbtest.repository.UserRepository;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;



    public Long save(UserDto infoDto){

        System.out.println(String.valueOf(infoDto));
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        infoDto.setPassword(encoder.encode(infoDto.getPassword()));

        boolean check = userRepository.existsByUsername(infoDto.getUsername());
        if(check) return null; // 이미 존재할 경우
        else{
            return userRepository.save(User.builder()
                    .username(infoDto.getUsername())
                    .password(infoDto.getPassword())
                    .nickname(infoDto.getNickname()).build()).getId();
        }



    }

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        // 시큐리티에서 지정한 서비스이기 때문에 이 메소드를 필수로 구현
        System.out.println("로그인 로드유저바이유저네임");
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("등록되지 않은 사용자 입니다."));
    }

//    public String login(UserDto userDto) throws Exception {
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(userDto.getUsername(), userDto.getPassword())
//        );
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//
//        User principal = (User) authentication.getPrincipal();
//
//        return principal.getUsername();
//    }
}
