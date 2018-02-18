package in.benchresources.cdm.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customerType"
})
@XmlRootElement(name = "CustomerListType")
public class CustomerListType {
 
    @XmlElement(name = "CustomerType")
    protected List<CustomerType> customerType;
 
    public List<CustomerType> getCustomerType() {
        if (customerType == null) {
            customerType = new ArrayList<CustomerType>();
        }
        return this.customerType;
    }
}