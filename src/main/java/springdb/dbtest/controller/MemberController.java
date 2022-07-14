package springdb.dbtest.controller;

//import lombok.RequiredArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdb.dbtest.entity.Jongmin;
import springdb.dbtest.repository.MemberRepository;
import springdb.dbtest.entity.User;
import springdb.dbtest.repository.TestRepository;

import java.util.List;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@RequestMapping("/v1") // version1의 API
public class MemberController {

    @Autowired
    private final MemberRepository memberRepository;
    @Autowired
    private final TestRepository testRepository;
    /**
     * 멤버 조회
     * @return
     */
    @GetMapping("member")
    public List<User> findAllMember() {
        List<User> z =  memberRepository.findAll();
        for(int i =0;i<memberRepository.findAll().size();i++){
            System.out.println("esgasegseg :" +z.get(i));
        }
        return memberRepository.findAll();
    }

    /**
     * 회원가입
     * @return
     */
    @GetMapping("test")
    public Jongmin insertUser(){
        final Jongmin jongmin = Jongmin.builder()
                .id(0L)
                .name("jongmin")
                .build();
        return testRepository.save(jongmin);
    }
    @GetMapping("test2")
    public List<Jongmin> User(){
        return testRepository.findAll();
    }
//    @PostMapping("member")
//    public Memo signUp() {
////        final Memo member = Memo.builder()
////                .id(123L)
////                .memoTextselet("포스트 성공22!")
////                .build();
////        return memberRepository.save(member);
//    }
}