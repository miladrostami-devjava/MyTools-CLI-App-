package org.example.p4_Command;

public class CommandExample {

    public static void main(String[] args) {

        args = new String[]{"start","stop","help","continue","error","crash"};

        if (args.length == 0 ){
            System.out.println("do not enter Input");
            return;
        }


        switch (args[3]){
            case "start":
                System.out.println("the Program is starting");
                break;
            case "stop":
                System.out.println("the Program is stop");
                break;
            case "help":
                System.out.println("the Program is helping");
                break;
            case "continue":
                System.out.println("the Program is continue");
                break;
            case "error":
                System.out.println("the Program is error");
                break;
            case "crash":
                System.out.println("the Program is crashing");
                break;
            default:
                System.out.println("the Program is unknown");
                break;
        }


    }

}
