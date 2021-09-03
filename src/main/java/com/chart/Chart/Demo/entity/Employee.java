package com.chart.Chart.Demo.entity;

public class Employee {

    private Long empId;
    private String empName;
    private String empSalary;
    private Long dpId;
    private String dpName;

    public Employee(Long empId, String empName, String empSalary, Long dpId) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.dpId = dpId;
    }

    public Employee(Long empId, String empName, String empSalary, Long dpId, String dpName) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.dpId = dpId;
        this.dpName = dpName;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
    }

    public Long getDpId() {
        return dpId;
    }

    public void setDpId(Long dpId) {
        this.dpId = dpId;
    }

    public String getDpName() {
        return dpName;
    }

    public void setDpName(String dpName) {
        this.dpName = dpName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary='" + empSalary + '\'' +
                ", dpId=" + dpId +
                ", dpName=" + dpName +
                '}';
    }
}
