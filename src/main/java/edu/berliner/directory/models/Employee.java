package edu.berliner.directory.models;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long empId;

    @NotEmpty
    private String empFirstName;
    @NotEmpty
    private String empLastName;

    private String empCellNum;
    private String empWorkNum;

    private long empDeptId;

    @ManyToOne
    private Department dept;

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public String getEmpCellNum() {
        return empCellNum;
    }

    public void setEmpCellNum(String empCellNum) {
        this.empCellNum = empCellNum;
    }

    public String getEmpWorkNum() {
        return empWorkNum;
    }

    public void setEmpWorkNum(String empWorkNum) {
        this.empWorkNum = empWorkNum;
    }

    public long getEmpDeptId() {
        return empDeptId;
    }

    public void setEmpDeptId(long empDeptId) {
        this.empDeptId = empDeptId;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }
}
