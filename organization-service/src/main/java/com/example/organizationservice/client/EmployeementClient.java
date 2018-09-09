package com.example.organizationservice.client;

import com.example.organizationservice.model.Employee;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="employeement-service")
public interface EmployeementClient {

    @GetMapping("/organization/{organizationId}")
    List<Employee> findByOrganization(@PathVariable("organizationId") Long organizationId);
}
