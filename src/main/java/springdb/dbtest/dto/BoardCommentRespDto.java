package springdb.dbtest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BoardCommentRespDto {

    Long id;
    String nickname;
    String picture;
    String comment;
    int comlikecnt;
    int recommentcnt;

}
