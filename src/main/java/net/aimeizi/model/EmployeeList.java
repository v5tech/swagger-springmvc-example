package net.aimeizi.model;

import io.swagger.annotations.ApiModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengjing on 2015/12/30.
 */
@XmlRootElement(name = "employees")
@XmlAccessorType(XmlAccessType.NONE)
@ApiModel(value = "雇员列表", description = "雇员列表")
public class EmployeeList implements Serializable {

    @XmlElement(name = "employee")
    private List<Employee> employees = new ArrayList<Employee>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
