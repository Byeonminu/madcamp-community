package springdb.dbtest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private Long userid;

    @Column()
    private Long type;

    @Column(length = 30, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String description;

    @Column(columnDefinition = "int(11) default 0")
    private int commentcnt;

    @Column(columnDefinition = "int(11) default 0")
    private int likecnt;

    @Column(columnDefinition = "int(11) default 0")
    private int reportcnt;

    @Column
    @CreatedDate
    private LocalDateTime createdate;

    @Column
    private LocalDateTime updatedate;


}