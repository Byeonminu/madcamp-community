package springdb.dbtest.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private Long userid;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY) //LAZY - 지연 로딩, EAGER - 즉시 로딩
    @JoinColumn(name = "boardid")
    private Board board;

    @Column(columnDefinition = "TEXT")
    private String comment;

    @Column(columnDefinition = "int(11) default 0")
    private int comlikecnt;




}