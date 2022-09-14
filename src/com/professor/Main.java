package com.professor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Professor John = new Professor("Johnny");
        Professor Kenny = new Professor("Kehinde");

        Department Pol = new Department("Political Sci");

        List<Professor> staff_POl = new ArrayList<>();
        staff_POl.add(John);
        staff_POl.add(Kenny);

        Pol.setStaff(staff_POl);

        System.out.println("The staff of department is: " + Pol.getStaff() + Pol.getStaff());
    }
}
