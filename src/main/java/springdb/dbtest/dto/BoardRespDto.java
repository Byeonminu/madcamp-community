package springdb.dbtest.dto;

        import lombok.AllArgsConstructor;
        import lombok.Builder;
        import lombok.Data;
        import lombok.NoArgsConstructor;
        import springdb.dbtest.entity.Board;

        import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardRespDto {

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


}
