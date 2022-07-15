package springdb.dbtest.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springdb.dbtest.dto.BoardReqDto;
import springdb.dbtest.dto.BoardRespDto;
import springdb.dbtest.entity.Board;
import springdb.dbtest.entity.Comment;
import springdb.dbtest.repository.BoardRepository;
import springdb.dbtest.repository.CommentRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service("commentService")
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

//    @Override
//    public List<Comment> getcomment(Long boardid) {
//        return commentRepository.findAllComments();
//    }
}
