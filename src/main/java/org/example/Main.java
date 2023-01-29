package org.example;

import javax.xml.bind.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(EmployeeMap.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        EmployeeMap empMap = (EmployeeMap) jaxbUnmarshaller.unmarshal( new File("c:/tmp/employees.xml") );

        for (Employee employee: empMap.getEmployeeMap().values()) {
            employee.setFirstName("Murat abi");
        }

        System.out.println("");

        // -marschalling
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(empMap, System.out);
        jaxbMarshaller.marshal(empMap, new File("c:/tmp/employeesNeu.xml"));
    }
}