package springdb.dbtest.entity;

import com.mysql.cj.protocol.ColumnDefinition;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "recomment")
public class Recomment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userid;

    @Column(nullable = false)
    private Long commentid;

    @Column(columnDefinition = "TEXT")
    private String recomment;

    @Column(columnDefinition = "int(11) default 0")
    private Long recomlikecnt;


}
