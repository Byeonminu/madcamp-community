package springdb.dbtest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private Long user_id;

    @Column()
    private Long type;

    @Column(length = 30, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String description;

    @Column(columnDefinition = "int(11) default 0")
    private int comment_cnt;

    @Column(columnDefinition = "int(11) default 0")
    private int like_cnt;

    @Column(columnDefinition = "int(11) default 0")
    private int report_cnt;

    @Column
    @CreatedDate
    private LocalDateTime created_date;

    @Column
    private LocalDateTime update_date;


}