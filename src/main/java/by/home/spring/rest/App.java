package by.home.spring.rest;

import by.home.spring.rest.configuration.MyConfig;
import by.home.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

public class App{
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empByID = communication.getEmployee(26);
//        System.out.println(empByID);

//        Employee emp = new Employee("Sveta", "Gavrilchik", "HR", 2900);
//        communication.saveEmployee(emp);
//        emp.setId(16);

//        communication.deleteEmployee(15);
    }
}
