package springdb.dbtest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BoardRecommentRespDto {

    Long id;
    Long userId;
    String nickname;
    String picture;
    String recomment;
    Long recomlikecnt;
    String createdate;
}
