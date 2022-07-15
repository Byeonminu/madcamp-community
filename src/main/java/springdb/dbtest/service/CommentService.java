package springdb.dbtest.service;

import springdb.dbtest.dto.BoardReqDto;
import springdb.dbtest.dto.BoardRespDto;
import springdb.dbtest.entity.Board;
import springdb.dbtest.entity.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentService {


    public List<Comment> findAllWithRecommentUsingFetchJoin(Long commentid);

}
