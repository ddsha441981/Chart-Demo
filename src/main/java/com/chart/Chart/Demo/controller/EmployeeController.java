package com.chart.Chart.Demo.controller;

import com.chart.Chart.Demo.entity.Employee;
import com.chart.Chart.Demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/charts")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String getEmployeeData(ModelMap map) {

        List<Employee> employees = employeeService.getEmployees();
        Map<String, Long> e2 = employees.stream().collect(Collectors.groupingBy(Employee::getDpName, Collectors.counting()));

        List<Employee> l1 = new ArrayList(e2.entrySet());
        List<Employee> collect = l1.stream().collect(Collectors.toList());
        System.out.println("*****************" + collect);

        e2.entrySet().forEach(entry -> {
            System.out.println("Department Name :  " + entry.getKey());
            System.out.println("Employees :  " + entry.getValue());
        });
        map.addAttribute("chartData",collect);

        return "home";
    }

    @GetMapping("/u")
    public String gett(Model model){
        List<Employee> emp = employeeService.getEEmployees();
        model.addAttribute("f",emp);
        System.out.println("Main Data" + emp);
        return "home";
    }
}
