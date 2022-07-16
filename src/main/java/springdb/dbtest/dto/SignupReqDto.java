package springdb.dbtest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignupReqDto {


    private String username;
    private String password;
    private String nickname;
    private String isadmin;
    private String introduction;
    private String picture;
    private String inputCode;

}