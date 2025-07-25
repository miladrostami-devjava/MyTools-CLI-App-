package org.example.p1_InputsPrint;


/**Inputs Print example*/
public class InputsPrint {

    public static void main(String[] args) {

        args = new String[]{"arg1", "arg2", "arg3","arg4","arg5"};

        for (String arg : args){
            System.out.println("input is :" + " " + arg);
        }

    }
}
