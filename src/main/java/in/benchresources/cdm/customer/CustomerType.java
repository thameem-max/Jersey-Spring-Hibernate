package in.benchresources.cdm.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customerId",
    "name",
    "age"
})
@XmlRootElement(name = "CustomerType")
public class CustomerType {
 
    protected int customerId;
    @XmlElement(required = true)
    protected String name;
    protected int age;
 
    public int getCustomerId() {
        return customerId;
    }
 
    public void setCustomerId(int value) {
        this.customerId = value;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String value) {
        this.name = value;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int value) {
        this.age = value;
    }
}
