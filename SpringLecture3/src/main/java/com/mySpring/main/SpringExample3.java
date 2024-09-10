package com.mySpring.main;

import com.mySpring.beans.Vehicle;
import com.mySpring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample3 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

        Vehicle veh2 = context.getBean("hondaVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh2.getName());

        Vehicle veh3 = context.getBean("ferrariVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh3.getName());
    }
}
