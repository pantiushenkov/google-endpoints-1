package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass() {
    }

    public HelloClass(String name) {
        this.message = "Hello " + name + "!";
    }

    public HelloClass(String name, String period) {
        this.message = "Good " + period + " " + name;
    }

    public HelloClass(String name, String period, String feeling) {
        this.message = "Good " + period + " " + name + ", I am also feeling " + feeling + " today";
    }

    public String getMessage() {
        return message;
    }
}
