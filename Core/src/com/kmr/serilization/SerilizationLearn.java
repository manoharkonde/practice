package com.kmr.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Bike  implements Serializable {
    int noOfGears = 4;
    int milage = 50;
    String name = "ducatee";
}


class Car implements Serializable {
    String name = "BMW";
    int wheels = 4;
}
public class SerilizationLearn {
public static void main(String[] args) throws IOException, ClassNotFoundException {
    Bike ducatee = new Bike();
    Car bmw = new Car();
    FileOutputStream fos = new FileOutputStream("C:/Manohar/Learning/javaser.ser");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(ducatee);
    oos.writeObject(bmw);
    oos.close();
    System.out.println("==serilization done==");
    
    System.out.println("==deserilization started==");
    FileInputStream fis = new FileInputStream("C:/Manohar/Learning/javaser.ser");
    ObjectInputStream ois = new ObjectInputStream(fis);
    //Car c = (Car)ois.readObject();
    Object o = ois.readObject();
    if (o instanceof Car) {
        Car c = (Car)o;
        System.out.println("Car Name: "+c.name+" CarWheels: "+c.wheels);
    }
    if (o instanceof Bike) {
        Bike b = (Bike)o;  
        System.out.println("Bike Name: "+b.name+" NoofGears: "+b.noOfGears);
    }
    //Bike b = (Bike)ois.readObject();
    ois.close();
    System.out.println("==desirilization done==");
    System.out.println();
    
}
}
