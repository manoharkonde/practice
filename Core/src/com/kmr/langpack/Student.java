package com.kmr.langpack;

public class Student {

    String name;
    int rollNumber;

    Student(String stuName, int StuRollNumber) {
        this.name = stuName;
        this.rollNumber = StuRollNumber;
    }

    /*
     * @Override public boolean equals(Object paramObject) { try { String name1
     * = this.name; int rollNumber1 = this.rollNumber; Student s2 =
     * (Student)paramObject;
     * 
     * String name2 = s2.name; int rollNumber2 = s2.rollNumber;
     * if(name1.equals(name2) && rollNumber1==rollNumber2) { return true; } else
     * return false; } catch (ClassCastException e) { return false; }
     * catch(NullPointerException ne) { return false; }
     * 
     * }
     */

    // simplified equals method..
    @Override
    public boolean equals(Object paramObject) {
        try {
            Student student = (Student) paramObject;
            if (name.equals(student.name) && student.rollNumber == rollNumber) {
                return true;
            }
            return false;
        } catch (ClassCastException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Student stu = new Student("manohar", 102);
        Student stu2 = new Student("manohar", 102);
        int num1 = 100;
        int num2 = 101;
        //stu = stu2;
        // ObjectCls obj = new ObjectCls();
        System.out.println("Object comparision :" + stu.equals(stu2)
                + " hascode of Stu: " + stu.hashCode() + " and stu2: "
                + stu2.hashCode());
        System.out.println(stu==stu2);
        System.out.println(stu.hashCode()==stu2.hashCode());
         //System.out.println(stu==stu2);
         System.out.println(num1==num2);
        // which gives class cast exception
        // System.out.println("Object comparision :"+stu.equals(obj));

        // which gives nullpointerexception
        //System.out.println("Object comparision :" + stu.equals(null));

    }
}
