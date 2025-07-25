package org.example.p7_AppSettings;

import java.util.HashMap;
import java.util.Map;

public class AppSettings {
    public static void main(String[] args) {

        Map<String,String> list = new HashMap<>();

        //javac AppSettings.java

        for (String arg : args){
            String[] parts = arg.split("=");

            if (parts.length == 2){
                String key = parts[0];
                String value = parts[1];
                System.out.println("کلید: " + key + " -> مقدار: " + value);
            } else {
                System.out.println("the formatting is wrong");
            }
        }
    }
}
