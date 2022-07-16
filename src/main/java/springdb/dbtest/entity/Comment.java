package springdb.dbtest.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


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

    @Builder.Default
    @JsonManagedReference
    @OneToMany(mappedBy = "comment") // 연관관계의 주인은 'comment'를 가지고 있는 Recomment 클래스임
    List<Recomment> recomments = new ArrayList<>();




}