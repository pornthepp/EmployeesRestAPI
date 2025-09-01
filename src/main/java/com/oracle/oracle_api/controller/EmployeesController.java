package com.oracle.oracle_api.controller;

import com.oracle.oracle_api.dto.EmployeesDto;
import com.oracle.oracle_api.service.EmployeesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor

public class EmployeesController {
    //ฉีด service
    private final EmployeesService service;
    //getAll
    @GetMapping()
    public ResponseEntity<List<EmployeesDto>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }
    @GetMapping("/{empId}")
    public ResponseEntity<EmployeesDto> getOne (@PathVariable Long empId){
        return ResponseEntity.ok(service.getById(empId));
    }
    @GetMapping("/byDeptId{deptId}")
    public ResponseEntity<List<EmployeesDto>> getById(@RequestParam("deptId") Long deptId){
        return ResponseEntity.ok(service.getByDeptId(deptId));
    }
    @GetMapping("/byMgrId{mgrId}")
    public ResponseEntity<List<EmployeesDto>> getByMgr(@RequestParam("mgrId") Long mgrId ){
        return ResponseEntity.ok(service.getByMgrId(mgrId));
    }
}
