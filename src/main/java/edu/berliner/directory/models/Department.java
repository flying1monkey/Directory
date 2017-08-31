package edu.berliner.directory.models;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long deptId;

    @NotEmpty
    private String deptName;
    private long deptHeadId;

    @OneToMany
    private Set<Employee> employeeSet;

    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public long getDeptHeadId() {
        return deptHeadId;
    }

    public void setDeptHeadId(long deptHeadId) {
        this.deptHeadId = deptHeadId;
    }


}
