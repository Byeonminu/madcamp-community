package springdb.dbtest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardDetailRespDto {
    private Long id;
    private Long userid;
    private Long type;
    private String title;
    private String description;
    private int commentcnt;
    private int likecnt;
    private int reportcnt;
    private LocalDateTime createdate;
    private LocalDateTime updatedate;
}
