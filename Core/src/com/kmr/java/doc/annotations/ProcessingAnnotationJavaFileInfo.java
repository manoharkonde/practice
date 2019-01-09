package com.kmr.java.doc.annotations;

import java.lang.annotation.Annotation;


public class ProcessingAnnotationJavaFileInfo {
public static void main(String[] args) {
    new JavaFileInfoDemo();
    Class<JavaFileInfoDemo> javaFileDemo = JavaFileInfoDemo.class;
    Annotation[] annotations= javaFileDemo.getAnnotations();
 for (Annotation annotation : annotations) {
    JavaFileInfo javaFileInfo = (JavaFileInfo)annotation;
    System.out.println("author :"+javaFileInfo.author()+ " Version :"+javaFileInfo.version());
}   
}
}
