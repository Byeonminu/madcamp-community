package springdb.dbtest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {

    Long id;
    Long user_id;
    int type;
    String title;
    String description;
    int comment_cnt;
    int like_cnt;
    int report_cnt;
    String create_date;
    String update_date;

}