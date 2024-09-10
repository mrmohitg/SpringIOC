package com.mySpring.main;

import com.mySpring.beans.Vehicle;
import com.mySpring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample4 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Primary Vehicle name from Spring Context is: " + veh.getName());

    }
}
