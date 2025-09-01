package com.oracle.oracle_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="Employees_copy",schema = "hr")
@Data @NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeesEntity {
    //สร้าง id
    @Id
    @Column(name="EMPLOYEE_ID")
    private Long empId;
    @Column(name="FIRST_NAME")
    private String firstname;
    @Column(name="LAST_NAME")
    private String lastname;
    @Column(name="EMAIL")
    private String email;
    @Column(name="PHONE_NUMBER")
    private String phoneNumber;
    @Column(name="HIRE_DATE")
    private LocalDate hireDate;
    @Column(name="JOB_ID")
    private String jobId;
    @Column(name="SALARY")
    private Long salary;
    @Column(name="COMMISSION_PCT")
    private Double commissionPct;
    @Column(name="MANAGER_ID")
    private Long managerId;
    @Column(name="DEPARTMENT_ID")
    private Long departmentId;
    //จบการสร้างตาราง
}
