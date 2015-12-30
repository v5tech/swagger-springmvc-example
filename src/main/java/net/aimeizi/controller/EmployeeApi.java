package net.aimeizi.controller;

/**
 * spring mvc rest服务
 * Created by fengjing on 2015/12/30.
 */

import net.aimeizi.model.Employee;
import net.aimeizi.model.EmployeeList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "雇员API", description = "雇员API")
@RestController
@RequestMapping(value = "/v2/api", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public class EmployeeApi {

    @ApiOperation(value = "查询所有的雇员信息", notes = "查询所有的雇员信息", response = EmployeeList.class)
    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public EmployeeList getAllEmployees() {
        EmployeeList employees = new EmployeeList();
        Employee employee1 = new Employee(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
        Employee employee2 = new Employee(2, "Amit", "Singhal", "asinghal@yahoo.com");
        Employee employee3 = new Employee(3, "Kirti", "Mishra", "kmishra@gmail.com");
        employees.getEmployees().add(employee1);
        employees.getEmployees().add(employee2);
        employees.getEmployees().add(employee3);
        return employees;
    }

    @ApiOperation(value = "根据雇员Id查询雇员信息", notes = "根据雇员Id查询雇员信息",response = Employee.class)
    @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
    public ResponseEntity<Employee> getEmployeeById(@ApiParam(name = "id", value = "雇员编号", required = true) @PathVariable("id") int id) {
        if (id <= 3) {
            Employee employee = new Employee(1,"Lokesh","Gupta","howtodoinjava@gmail.com");
            return new ResponseEntity<Employee>(employee, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

}
