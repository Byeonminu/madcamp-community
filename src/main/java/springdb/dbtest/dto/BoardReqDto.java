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
    private Long user_id;
    private Long type;
    private String title;
    private String description;
    private int comment_cnt;
    private int like_cnt;
    private int report_cnt;
    private LocalDateTime create_date;
    private LocalDateTime update_date;

    public Board toEntity(){
        return Board.builder()
                .id(id)
                .user_id(user_id)
                .type(type)
                .title(title)
                .description(description)
                .comment_cnt(comment_cnt)
                .like_cnt(like_cnt)
                .report_cnt(report_cnt)
                .create_date(create_date)
                .update_date(update_date)
                .build();

    }

}
