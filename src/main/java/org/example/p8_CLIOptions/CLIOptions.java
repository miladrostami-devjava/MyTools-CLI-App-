package org.example.p8_CLIOptions;

public class CLIOptions {


    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("show help :" + " " + "--help");
            return;
        }


        switch (args[0]) {

            case "--help":
                System.out.println("guide : --help \n" +
                        "version : --version \n" +
                        "update : --update \n" +
                        "build : --build \n" +
                        "history : --history \n" +
                        "list : --list \n");
                break;
            case "--version":
                System.out.println("version = 2.3.2 snapshot");
                break;
            case "--update":
                System.out.println("update = already updated");
                break;
            case "--build":
                System.out.println("build = rebuild");
                break;
            case "--history":
                System.out.println("history = 2014-14-34 created");
                break;
            case "--list":
                System.out.println("List = list of {a,b,c,d,e}");
                break;
            default:
                System.out.println("unknown ....." + " " + args[0]);
                break;


        }

    }

}
