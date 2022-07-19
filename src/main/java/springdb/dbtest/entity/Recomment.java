package springdb.dbtest.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.mysql.cj.protocol.ColumnDefinition;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "recomment")
public class Recomment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userid;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY) //LAZY - 지연 로딩, EAGER - 즉시 로딩
    @JoinColumn(name = "commentid")
    private Comment comment;

    @Column(columnDefinition = "TEXT")
    private String recomment;


    @Column(columnDefinition = "int(11) default 0")
    private Long recomlikecnt;

    @Column(columnDefinition = "int(11) default 0")
    private int reportcnt;

    @Column()
    private String createdate;
}
