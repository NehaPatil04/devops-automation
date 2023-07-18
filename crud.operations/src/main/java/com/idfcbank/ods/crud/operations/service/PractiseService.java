package com.idfcbank.ods.crud.operations.service;

import com.idfcbank.ods.crud.operations.dto.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//@Service
//public class PractiseService {
//    public String welcome(String name){
//        return "Hello " + name;
//    }
//
//    public String Bye(String name){
//        return "Bye " + name;
//    }
//
//    public Employee getEmployee(int empId,String name,int salary){
//        Employee e = new Employee();
//        e.setEmpId(empId);
//        e.setName(name);
//        e.setSalary(salary);
//        return e;
//    }
//
//    public Employee createEmp(Employee e){
//        return  e;
//    }
//
//    List<Employee> lEmp = new ArrayList<>();
//
//    public void addList(){
//        Employee e1 = new Employee(25,"Neha",2000);
//        lEmp.add(e1);
//        Employee e2 = new Employee(26,"Omi",25000000);
//        lEmp.add(e2);
//        Employee e3 = new Employee(27,"Nikita",5000000);
//        lEmp.add(e3);
//        Employee e4 = new Employee(28,"Chinu",1);
//        lEmp.add(e4);
//    }
//
//    public List<Employee> salaryBasedList(int salary1){
//        List<Employee> le = lEmp.stream().filter(x->x.getSalary()>salary1).collect(Collectors.toList());
//        return le;
//    }
//}

@Service
public class PractiseService
{
    public String message(String name){
        return "Hiiiii " + name;
    }

    public  String bye(String name){
        return "Bye " +name;
    }

    public Employee getEmployee(int empId, String name, int salary){
        Employee e = new Employee();
        e.setEmpId(empId);
        e.setName(name);
        e.setSalary(salary);
        return e;
    }

    public Employee createEmployee(Employee e){
        return e;
    }
    List<Employee> myList = new ArrayList<>();

    public List<Employee> salaryBasedList(int salary){
        Employee e1 = new Employee(20,"neha",1000);
        Employee e2 = new Employee(21,"omi",50000);
        Employee e3 = new Employee(22,"nikita",300);
        Employee e4 = new Employee(23,"babu",1);
        myList.add(e1);
        myList.add(e2);
        myList.add(e3);
        myList.add(e4);

        List<Employee> filteredList = myList.stream().filter(x->x.getSalary()>salary).collect(Collectors.toList());
        return filteredList;

    }

    @PostConstruct
    public void testingDocker(){
        System.out.println("Hiii it is running");
    }
}