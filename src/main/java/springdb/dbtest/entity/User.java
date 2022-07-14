package springdb.dbtest.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false, unique = true)
    private String username;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String password;

    @Column(length = 20, nullable = false, unique = true)
    private String nickname;

    @Column(columnDefinition = "varchar(10) default 'USER'")
    private String isadmin;

    @Column(length = 50)
    private String introduction;

    @Column(length = 200)
    private String picture;


}