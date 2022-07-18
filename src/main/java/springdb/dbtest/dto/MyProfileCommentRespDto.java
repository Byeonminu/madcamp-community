package springdb.dbtest.dto;

import lombok.Data;
import springdb.dbtest.entity.Comment;

import java.util.List;

@Data
public class MyProfileCommentRespDto {
    List<Comment> commentList;
    int cnt;
}
