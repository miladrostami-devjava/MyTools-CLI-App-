package org.example.p3_UserInfo;

public class UserInfoDemo {


    public static void main(String[] args) {

        args = new String[5];

        args[0] = "mohammad";
        args[1] = "20";
        args[2] = "18.4";
        args[3] = "2235465";
        args[4] = "true";

        String name = args[0];
        Integer age = Integer.parseInt(args[1]);
        Double score = Double.parseDouble(args[2]);
        Long studentNumber  = Long.parseLong(args[3]);
        Boolean isMarried = Boolean.parseBoolean(args[4]);


        System.out.println(
                "the name is :" + " " + name + " " +
                "the age is :" + " " + age + " "  +
                "the score is :" + " " + score + " "  +
                "the studentNumber is :" + " " + studentNumber + " " +
                "the isMarried is :" + " " + isMarried
        );


    }

}
