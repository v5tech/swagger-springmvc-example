package net.aimeizi.model;

/**
 * Created by fengjing on 2015/12/30.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.NONE)
@ApiModel(value = "雇员信息", description = "雇员信息")
public class Employee implements Serializable {

    @XmlAttribute
    @ApiModelProperty(value = "雇员编号", dataType = "int", required = true)
    private Integer id;

    @XmlElement
    @ApiModelProperty(value = "名", dataType = "String", required = false)
    private String firstName;

    @XmlElement
    @ApiModelProperty(value = "姓", dataType = "String", required = false)
    private String lastName;

    @XmlElement
    @ApiModelProperty(value = "电子邮件", dataType = "String", required = false)
    private String email;

    public Employee() {
    }

    public Employee(Integer id, String firstName, String lastName, String email) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}