package com.api;

import lombok.Data;

@Data
public class Jeep {
    private String id;
    private String make;
    private String model;
    private String trim;
    private String color;
    private String transmission;
    private int miles;
    private int year;
    private String label;
}
