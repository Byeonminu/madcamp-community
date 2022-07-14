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
    private Long user_id;

    @Column(nullable = false)
    private Long comment_id;

    @Column(columnDefinition = "TEXT")
    private String recomment;

    @Column(columnDefinition = "int(11) default 0")
    private Long recom_like_cnt;


}
