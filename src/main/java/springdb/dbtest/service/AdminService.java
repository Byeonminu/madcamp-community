package springdb.dbtest.service;

import springdb.dbtest.dto.AdminRespListDto;

import java.util.List;

public interface AdminService {
    public AdminRespListDto getReportList();
    public void deleteReq(Long id, int category);
}
