package springdb.dbtest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {


    private String username;
    private String password;
    private String nickname;
    private String isadmin;
    private String introduction;
    private String picture;

}