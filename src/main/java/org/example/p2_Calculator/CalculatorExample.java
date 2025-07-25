package org.example.p2_Calculator;

public class CalculatorExample {

    public static void main(String[] args) throws Exception {

        args = new String[]{"10","2","3"};

        if (args.length == 0){
            throw new Exception("args is Invalid");
        }else {

int a,b;
int add,subtraction,divide,multiply;

a = Integer.parseInt(args[0]);
b = Integer.parseInt(args[1]);

add = a + b;
subtraction = a - b;
divide =  a/b;
multiply  = a * b;


        System.out.println("added :" + add);
        System.out.println("subtraction :" + subtraction);
        System.out.println("divide :" + divide);
        System.out.println("multiply :" + multiply);
        }


    }

}
