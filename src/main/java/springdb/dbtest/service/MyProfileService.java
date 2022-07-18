package springdb.dbtest.service;

import org.springframework.stereotype.Service;
import springdb.dbtest.dto.BoardLIstRespDto;
import springdb.dbtest.dto.MyProfileCommentRespDto;


public interface MyProfileService {
    public MyProfileCommentRespDto getMyComments(Long userid, int pagenum);
    public BoardLIstRespDto getMyBoard(Long userid, int pagenum);

}
