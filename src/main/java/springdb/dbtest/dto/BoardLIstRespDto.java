package springdb.dbtest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import springdb.dbtest.entity.Board;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardLIstRespDto {

    List<Board> boardList;
    int cnt;

}