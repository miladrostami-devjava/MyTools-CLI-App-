package org.example.p9_MyTool;

import java.io.*;


/**
 * Guide for run program:
 * java src/main/java/org/example/p9_MyTool/MyTools.java
 * <p>
 * java src/main/java/org/example/p9_MyTool/MyTools.java --login mohammad 123456
 * <p>
 * Review;
 * PS C:\Users\Parse\Desktop\7765\course-javaweb-zero to hiro\saneimohamad\session7-14040502\session7-040502-argsmain> java src/main/java/org/example/p9_MyTool/M
 * yTools.java --login a 1
 */


public class MyTools {

    private static final String SESSION_FILE = "session.txt";
    private static final String OUTPUT_FILE = "out.txt";


    public static void main(String[] args) throws IOException {


        if (args.length == 0) {
            printHelp();
            return;
        }

        switch (args[0]) {
            case "--login":
                if (args.length < 3) {
                    System.out.println("Please Enter username and password");
                    return;
                }
                login(args[1], args[2]);
                break;

            case "--logout":
                logout();
                break;
            case "--show":
                showFile();
                break;
            case "--clear":
                clearShow();
                break;

            case "--save":
                if (!isLoggedIn()){
                    System.out.println("Please first entered");
                    return;
                }
                if (args.length < 2) {
                    System.out.println("the text is not for any saving!!!");
                    return;
                }
                // Join all parts from index 1 to end
                StringBuilder stringBuilder = new StringBuilder();
                for (int i =1;i < args.length ;i++){
                    stringBuilder.append(args[i]).append(" ");
                }
                saveToFile(stringBuilder.toString().trim());
                break;
            case "--version":
                System.out.println("MyTools v1.2.2");
                System.out.println("Author: Milad Rostami");

                break;
            case "--help":
            default:
                printHelp();

                break;
        }


    }

    private static boolean isLoggedIn() {
        return new File(SESSION_FILE).exists();
    }

    private static void clearShow() throws IOException {
new FileWriter(OUTPUT_FILE).close();
        System.out.println("the Output file clear");
    }

    private static void showFile() {
File file = new File(OUTPUT_FILE);
if (!file.exists() || file.length() == 0){
    System.out.println("the file is not existed!!!");
    return;
}
        System.out.println("The Content Empty:");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
           while ((line = bufferedReader.readLine()) !=null){
               System.out.println("the content :" + " " + line);
           }
           bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static void logout() {
        File session = new File(SESSION_FILE);
        if (session.exists()){
            session.delete();
            System.out.println("you existed!!!");
        }else {
            System.out.println("yod do not entered!!");
        }
    }

    private static void saveToFile(String text) {

        try {
            FileWriter fileWriter = new FileWriter(OUTPUT_FILE, true);
            fileWriter.write(text + "\n");
            System.out.println("the text save to out.txt");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void login(String username, String password) {
        if (username.equals("a") && password.equals("1")) {
            try {
                FileWriter sessionWriter = new FileWriter(SESSION_FILE);
                sessionWriter.write("loggedIn=true\n");
                sessionWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("login is successfully!!!");
        } else {
            System.out.println("login is not successfully!!!");
        }
    }


    private static void printHelp() {
        System.out.println("********Help  MyTools*********");
        System.out.println("The Login :----> --login  [username][password]");
        System.out.println("The Logout :-------> --logout ");
        System.out.println("The Show :-------> --show ");
        System.out.println("The clear :-------> --clear ");
        System.out.println("The save To File :-----> --save [text] ");
        System.out.println("The version :---->  --version");
        System.out.println("The help :---->  --help");
    }

}
