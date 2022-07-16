package springdb.dbtest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import springdb.dbtest.dto.BoardReqDto;
import springdb.dbtest.dto.BoardRespDto;
import springdb.dbtest.dto.UserDto;
import springdb.dbtest.entity.Board;
import springdb.dbtest.entity.User;
import springdb.dbtest.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;


    public Long save(UserDto infoDto){

        System.out.println(String.valueOf(infoDto));
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        infoDto.setPassword(encoder.encode(infoDto.getPassword()));

        return userRepository.save(User.builder()
                        .username(infoDto.getUsername())
                        .password(infoDto.getPassword())
                        .nickname(infoDto.getNickname()).build()).getId();
    }

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        // 시큐리티에서 지정한 서비스이기 때문에 이 메소드를 필수로 구현
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException((username)));
    }
}
