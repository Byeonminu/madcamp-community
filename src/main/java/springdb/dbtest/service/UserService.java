package springdb.dbtest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import springdb.dbtest.dto.UserDto;
import springdb.dbtest.entity.User;
import springdb.dbtest.repository.UserRepository;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;
import java.util.Random;

@RequiredArgsConstructor
@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final JavaMailSender javaMailSender;



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
                    .nickname(infoDto.getNickname())
                    .isadmin("USER").build()).getId();
        }



    }

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        // 시큐리티에서 지정한 서비스이기 때문에 이 메소드를 필수로 구현
        System.out.println("로그인 로드유저바이유저네임: " + username);
        User user =  userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("등록되지 않은 사용자 입니다."));
        System.out.println("로그인한 유저 : " + user);
        return user;
    }


    public boolean authEmail(HttpSession session, String email){
        Random random = new Random();
        String authKey = String.valueOf(random.nextInt(88888) + 11111); // 범위 11111~ 99999



        return sendAuthEmail(session, email, authKey);
    }

    private boolean sendAuthEmail(HttpSession session, String email, String authKey){
        String subject = "몰입캠프 커뮤니티 이메일 인증입니다.";
        String text = "회원 가입을 위한 인증번호는 " + authKey + "입니다. <br/>";

        System.out.println("사용자 이메일 : " + email + "키 : " + authKey);

        try{
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
            helper.setFrom("ufo3764@naver.com");
            helper.setTo(email);
            helper.setSubject(subject);
            helper.setText(text, true);
            javaMailSender.send(mimeMessage);

            session.setAttribute("" + email, authKey);
            return true;

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }


    public boolean emailCertification(HttpSession session, String email, String inputCode){
        try{
            String generationCode = String.valueOf(session.getAttribute(email));

            if(generationCode == inputCode){
                return true;
            }
            else{
                return false;
            }

        }catch (Exception e){
            throw e;
        }
    }


}
