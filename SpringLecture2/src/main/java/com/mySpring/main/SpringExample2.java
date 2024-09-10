package com.mySpring.main;

import com.mySpring.beans.Vehicle;
import com.mySpring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample2 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean("vehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

    }
}
