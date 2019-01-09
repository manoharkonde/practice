package com.kmr.serilization.customserilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable
{
String userName="Bhaskar";
transient String pwd="java#1.8";

private void writeObject(ObjectOutputStream os) throws IOException {
    os.defaultWriteObject();
    String encryptedPwd = "123"+pwd;
    os.writeObject(encryptedPwd);
}

private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException {
    is.defaultReadObject();
    String encryptedPwd = (String) is.readObject();
    pwd = encryptedPwd.substring(3);
}
}
class CustomizedSerializeDemo
{
public static void main(String[] args)throws Exception{
Account a1=new Account();
System.out.println(a1.userName+"........."+a1.pwd);

FileOutputStream fos=new FileOutputStream("abc.ser");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(a1);

FileInputStream fis=new FileInputStream("abc.ser");
ObjectInputStream ois=new ObjectInputStream(fis);
Account a2=(Account)ois.readObject();
System.out.println(a2.userName+"........."+a2.pwd);
}
}