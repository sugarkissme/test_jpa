
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test00 {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    private String addTest0;

    public String getAddTest0() {
        return addTest0;
    }

    public void setAddTest0(String addTest0) {
        this.addTest0 = addTest0;
    }
}
