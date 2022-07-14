package springdb.dbtest.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import springdb.dbtest.dto.BoardRespDto;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
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

    public BoardRespDto toDto(){
        return BoardRespDto.builder()
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