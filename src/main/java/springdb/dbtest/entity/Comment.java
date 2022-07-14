package springdb.dbtest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private Long user_id;

    @Column()
    private Long board_id;

    @Column(columnDefinition = "TEXT")
    private String comment;

    @Column(columnDefinition = "int(11) default 0")
    private int com_like_cnt;




}