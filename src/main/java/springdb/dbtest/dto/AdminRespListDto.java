package springdb.dbtest.dto;


import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class AdminRespListDto {
    List<AdminRespDto> adminList;
    int cnt;
}
