package com.shubham.begin.controllers;

//Operations
// GET /employees
// POST /employees
// DELETE /employees/{id}

import com.shubham.begin.dto.EmployeeDTO;
import com.shubham.begin.services.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping(path = "/{id}")
    public EmployeeDTO getEmployeesById(@PathVariable("id") Long employeeId){
//        return new EmployeeDTO(employeeId, "Shubham", LocalDate.of(2025, 5, 22), true);
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.createNewEmployee(employeeDTO);
    }

    @DeleteMapping(path = "/{id}")
    public boolean deleteEmployeeById(@PathVariable Long id){
        return employeeService.deleteEmployeeById(id);
    }


//    @GetMapping(path = "/employees") //http://localhost:8080/employees?sortBy=shubham&limit=3
//    public String getData(@PathParam("sortBy") String sortBy,
//                          @PathParam("limit") Integer limit){
//        return "Hello " + sortBy + " " + limit;
//    }
}
