package com.kmr.java.annotations;

import java.lang.annotation.Annotation;

public class TravelRequestTest {
    @TravelRequest(id       = 112233,
            synopsis = "Teleport me",
            engineer = "Mr. John Carter",
            date     = "04/01/3007")
public static void sendBglr(){
    
}
public static void main(String[] args) {
    TravelRequest tr = new TravelRequest() {
        
        @Override
        public Class<? extends Annotation> annotationType() {
            // TODO Auto-generated method stub
            return null;
        }
        
        @Override
        public String synopsis() {
            // TODO Auto-generated method stub
            return null;
        }
        
        @Override
        public int id() {
            // TODO Auto-generated method stub
            return 0;
        }
        
        @Override
        public String engineer() {
            // TODO Auto-generated method stub
            return null;
        }
        
        @Override
        public String date() {
            // TODO Auto-generated method stub
            return null;
        }
    };
}
}
