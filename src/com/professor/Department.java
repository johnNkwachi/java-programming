package com.professor;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;

   List<Professor> staff;

   public Department (String name){
       this. name = name;
   }

   public void setStaff(List<Professor> staff) {
        this.staff = staff;
    }

    public List<String> getStaff() {
        List<String> professor_names = new ArrayList<String>();
        for (Professor prof : this.staff) {
            professor_names.add(prof.getName());
        }
        return professor_names;
    }

}


