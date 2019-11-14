package com.dlx.chapter06;

public interface Student {
    default String getName() {
        return "Jack";
    }
}
