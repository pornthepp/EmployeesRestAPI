package com.oracle.oracle_api.service;

import com.oracle.oracle_api.dto.EmployeesDto;
import com.oracle.oracle_api.entity.EmployeesEntity;
import com.oracle.oracle_api.repository.EmployeesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service //ระบุว่า class นี้เป็น service file
public class EmployeesService {
    private final   EmployeesRepository empRepo ;

    public EmployeesService(EmployeesRepository empRepo) {
        this.empRepo = empRepo;
    }

    public List<EmployeesDto> getAll(){
        return empRepo.findAll().stream()
                      .map(this::toDto)
                      .toList();
    }
    public EmployeesDto getById(Long empId){
        EmployeesEntity emp =empRepo.findById(empId)
                .orElseThrow(() -> new RuntimeException("No Data Found id: "+empId));
        return toDto(emp);
    }

    public List<EmployeesDto> getByDeptId (Long deptId){
        return empRepo.findByDepartmentId(deptId).stream()
                .map(this::toDto)
                .toList();
    }
    public List<EmployeesDto> getByMgrId (Long mgrId){
        return empRepo.findByManagerId(mgrId).stream()
                .map(this::toDto)
                .toList();
    }
    public List<EmployeesDto> getBySalary (Long salary){
        return empRepo.findBySalary(salary).stream()
                .map(this::toDto)
                .toList();
    }
    private EmployeesEntity toEntity(EmployeesDto empDto){
        return EmployeesEntity.builder()
                .empId(empDto.getEmpId())
                .firstname(empDto.getFirstname())
                .lastname(empDto.getLastname())
                .email(empDto.getEmail())
                .phoneNumber(empDto.getPhoneNumber())
                .salary(empDto.getSalary())
                .hireDate(empDto.getHireDate())
                .jobId(empDto.getJobId())
                .commissionPct(empDto.getCommissionPct())
                .managerId(empDto.getManagerId())
                .departmentId(empDto.getDepartmentId())
                .build();
    }
    private EmployeesDto toDto(EmployeesEntity emp){
        return EmployeesDto.builder()
                .empId(emp.getEmpId())
                .firstname(emp.getFirstname())
                .lastname(emp.getLastname())
                .email(emp.getEmail())
                .phoneNumber(emp.getPhoneNumber())
                .salary(emp.getSalary())
                .hireDate(emp.getHireDate())
                .jobId(emp.getJobId())
                .commissionPct(emp.getCommissionPct())
                .managerId(emp.getManagerId())
                .departmentId(emp.getDepartmentId())
                .build();
    }

}
