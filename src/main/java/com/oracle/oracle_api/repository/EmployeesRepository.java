package com.oracle.oracle_api.repository;
import com.oracle.oracle_api.dto.EmployeesDto;
import com.oracle.oracle_api.entity.EmployeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeesRepository extends JpaRepository<EmployeesEntity,Long> {
    //--------------------ชื่อต้องตรงกับ Entity
    List<EmployeesEntity> findByDepartmentId (Long departmentId);
    List<EmployeesEntity> findBySalary (Long salary);
    List<EmployeesEntity> findByManagerId (Long mgrId);
}
