package com.howtodoinjava.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.howtodoinjava.app.config.Config_AnnotationBased;
import com.howtodoinjava.app.model.EmployeeDTO;
import com.howtodoinjava.app.service.EmployeeManager;
 
public class TestMain
{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
  
/*    	//XML Based
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeManager manager = (EmployeeManager) context.getBean("employeeManager"); 
        manager.getEmployeeById(1);
        manager.createEmployee(new EmployeeDTO());*/
        
        
    	//Annotation Based
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Config_AnnotationBased.class);
		ctx.refresh();
        EmployeeManager manager = (EmployeeManager) ctx.getBean("employeeManager");
        manager.getEmployeeById(1);
        manager.createEmployee(new EmployeeDTO());
    }
}