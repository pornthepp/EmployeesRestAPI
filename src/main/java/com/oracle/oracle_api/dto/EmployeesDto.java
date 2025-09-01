package com.oracle.oracle_api.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data //สร้าง get-set
@AllArgsConstructor // Generate Constructor
@NoArgsConstructor
@Builder
public class EmployeesDto {
    private Long empId;
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;
    private Long salary;
    private LocalDate hireDate;
    private String jobId;
    private Double commissionPct;
    private Long managerId;
    private Long departmentId;
}

