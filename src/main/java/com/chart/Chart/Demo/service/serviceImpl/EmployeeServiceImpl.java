package com.chart.Chart.Demo.service.serviceImpl;

import com.chart.Chart.Demo.entity.Employee;
import com.chart.Chart.Demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> empList = Arrays.asList(
            new Employee(201L,"Deendayal","50000",301L,"Accounts"),
            new Employee(202L,"Manish","50000",302L,"IT"),
            new Employee(203L,"Sunil","50000",302L,"IT"),
            new Employee(204L,"Prshant","50000",304L,"HR"),
            new Employee(205L,"DD","50000",304L,"HR")
    );


    @Override
    public List<Employee> getEmployees() {

//        Map<String, List<Employee>> e1 = empList.stream().collect(Collectors.groupingBy(Employee::getDpName, Collectors.toList()));
//        e1.entrySet().forEach(entry->{
//            System.out.println(entry.getKey() + "----" + entry.getValue());
//        });
//
//        //counting employee working with department
//        Map<String, Long> e2 = empList.stream().collect(Collectors.groupingBy(Employee::getDpName, Collectors.counting()));
//        e2.entrySet().forEach(entry -> {
//            System.out.println("dept = " + entry.getKey() + "-----" + entry.getValue());
//        });
        System.out.println(
        empList.toString());
       return empList;
    }

    @Override
    public List<Employee> getEEmployees() {
        Map<String, Long> c1 = empList.stream().collect(Collectors.groupingBy(Employee::getDpName, Collectors.counting()));
        c1.entrySet().forEach(entry -> {
           System.out.println("dept = " + entry.getKey() + "-----" + entry.getValue());
        });

        List<Employee> l1 = new ArrayList(c1.entrySet());
        List<Employee> collect = l1.stream().collect(Collectors.toList());
        return  collect;
    }
}
