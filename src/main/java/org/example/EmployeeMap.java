package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement (name="employees")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeMap {
   
  private Map<Integer, Employee> employeeMap = new HashMap<>();
 
  public Map<Integer, Employee> getEmployeeMap() {
    return employeeMap;
  }
 
  public void setEmployeeMap(Map<Integer, Employee> employeeMap) {
    this.employeeMap = employeeMap;
  }
}