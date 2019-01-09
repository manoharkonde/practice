package com.kmr.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicate {
    public static Predicate<Employee> isAdultMale() {
        return p -> p.getAge() > 20 && p.getGender().equals("M");
    }
    
    public static Predicate<Employee> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }
    
    public static List<Employee> sortEmployees(List<Employee> employees, Predicate<Employee> predicate){
        return employees.stream().filter(predicate).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        
        Employee e1 = new Employee(1,23,"M","Rick","Beethovan");
        Employee e2 = new Employee(2,13,"F","Martina","Hengis");
        Employee e3 = new Employee(3,43,"M","Ricky","Martin");
        Employee e4 = new Employee(4,26,"M","Jon","Lowman");
        Employee e5 = new Employee(5,19,"F","Cristine","Maria");
        Employee e6 = new Employee(6,15,"M","David","Feezor");
        Employee e7 = new Employee(7,68,"F","Melissa","Roy");
        Employee e8 = new Employee(8,79,"M","Alex","Gussin");
        Employee e9 = new Employee(9,15,"F","Neetu","Singh");
        Employee e10 = new Employee(10,45,"M","Naveen","Jain");
        List<Employee> empList = new ArrayList<Employee>();
        empList.addAll(Arrays.asList(new Employee[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10}));
        
        System.out.println(sortEmployees(empList, isAdultMale()));
        System.out.println(sortEmployees(empList, isAgeMoreThan(68).negate()));
        System.out.println(sortEmployees(empList, isAgeMoreThan(68).and(isAdultMale())));
        
    }
}
