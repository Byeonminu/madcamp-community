package springdb.dbtest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private Long id;
    private String username;
    private String password;
    private String nickname;
    private String isadmin;
    private String introduction;
    private String picture;

    public UserDto(String username, String password, String nickname, String isadmin, String introduction, String picture) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.isadmin = isadmin;
        this.introduction = introduction;
        this.picture = picture;
    }
}