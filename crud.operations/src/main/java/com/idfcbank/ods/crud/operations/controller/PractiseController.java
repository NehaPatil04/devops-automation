package com.idfcbank.ods.crud.operations.controller;

import com.idfcbank.ods.crud.operations.dto.Employee;
import com.idfcbank.ods.crud.operations.service.PractiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/api")
//public class PractiseController {
//    @Autowired
//    PractiseService practiseService;
//    @GetMapping("/welcome")
//    public String message(@RequestParam String name){
//        return practiseService.welcome(name);
//    }
//    @GetMapping("/bye")
//    public String byeMessage(@RequestParam String name){
//        return practiseService.Bye(name);
//    }
//
//    @GetMapping("/emp")
//    public Employee getEmp(@RequestParam int empId, @RequestParam String name, @RequestParam int salary){
//        return practiseService.getEmployee(empId,name,salary);
//    }
//
//    @PostMapping("/empCreate")
//    public Employee createEmp(@RequestBody Employee e){
//        return practiseService.createEmp(e);
//    }
//    @GetMapping("/filterList")
//    public List<Employee> getEmpList(@RequestParam int salary1){
//        return practiseService.salaryBasedList(salary1);
//    }
//    @PostMapping("/addList")
//    public void addToList(){
//        practiseService.addList();
//    }
//}
@RestController
@RequestMapping("/api")
public class PractiseController {

    @Autowired
    PractiseService practiseService;

    @GetMapping("/msg")
    public String message(@RequestParam String name){
        return practiseService.message(name);
    }

    @GetMapping("/bye")
    public String bye(@RequestParam String name){
        return practiseService.bye(name);
    }

    @GetMapping("/getEmp")
    public Employee getEmployee(@RequestParam int empId, @RequestParam String name, @RequestParam int salary){
        return practiseService.getEmployee(empId, name, salary);
    }

    @PostMapping("/createEmp")
    public Employee createEmployee(@RequestBody Employee e){
        return practiseService.createEmployee(e);
    }

    @GetMapping("/filter")
    public List<Employee> salaryBasedList(int salary){
        return practiseService.salaryBasedList(salary);
    }
}