package com.dlx.charater06;

public interface Person {
    default String getName(){return "Name=Jason";};
    String getAge();
}
