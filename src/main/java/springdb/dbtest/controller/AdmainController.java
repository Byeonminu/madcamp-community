package springdb.dbtest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import springdb.dbtest.dto.AdminRespDto;
import springdb.dbtest.dto.AdminRespListDto;
import springdb.dbtest.service.AdminService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin") // version1의 API
public class AdmainController {
    private final AdminService adminService;

    @GetMapping("/report")
    public AdminRespListDto getReport() {
        return adminService.getReportList();
    }
    @DeleteMapping("delete")
    public void AdminDeleteReq(@RequestParam("id") Long id, @RequestParam("category") int category){
        adminService.deleteReq(id,category);
    }
}
