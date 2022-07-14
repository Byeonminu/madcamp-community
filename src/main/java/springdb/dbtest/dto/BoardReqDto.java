package springdb.dbtest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import springdb.dbtest.entity.Board;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardReqDto {

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

    public Board toEntity(){
        return Board.builder()
                .id(id)
                .userid(userid)
                .type(type)
                .title(title)
                .description(description)
                .commentcnt(commentcnt)
                .likecnt(likecnt)
                .reportcnt(reportcnt)
                .createdate(createdate)
                .updatedate(updatedate)
                .build();

    }

}
