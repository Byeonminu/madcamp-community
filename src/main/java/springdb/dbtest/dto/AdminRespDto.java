package springdb.dbtest.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminRespDto {
    Long categoryid;
    Long userid;
    int category;
    String  title;
    String nickname;
    int reportcnt;
    String createdate;

}
