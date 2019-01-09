package com.kmr.java8;

import java.math.BigDecimal;

public class Developer {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    private BigDecimal salary;
    private int age;

    public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

    public Developer(String name, BigDecimal i, int age) {
        this.name = name;
        this.salary = i;
        this.age = age;
    }
@Override
    public String toString() {
        return "name = "+name+" Salary = "+salary+" age ="+age;
    }
}
