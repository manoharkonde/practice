package com.kmr.java.annotations;

public @interface TravelRequest {
    int id();
    String synopsis();
    String engineer();
    String date() default "07/12/2018";

}
