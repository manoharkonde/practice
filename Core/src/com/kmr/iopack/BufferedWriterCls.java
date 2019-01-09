package com.kmr.iopack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Writer;

public class BufferedWriterCls {
public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Manohar/Learning/java.txt"));
    char ch[] = {'a','b','c'};
    bw.write(ch);
    bw.newLine();
    bw.write("baby boy");
    bw.newLine();
    //bw.write(1);
   // bw.newLine();
    bw.write("Prince");
    bw.flush();
    bw.close();
    
    System.out.println("==Successfully written in to file==");
    
    System.out.println("==BufferedReading==");
    
    BufferedReader br = new BufferedReader(new FileReader("C:/Manohar/Learning/javavideo.mp4"));
    String line = br.readLine();
    while(line!=null) {
        System.out.println(line);
        line = br.readLine();
    }
    br.close();
}
}
