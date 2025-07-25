package org.example.p6_SimpleLogin;

public class SimpleLogin {


    public static void main(String[] args) {
    args = new String[]{"mohammad", "www2334", "15.6","152454","tehran"};

        if (args.length < 4){
            System.out.println("warning please enter username and passwrod .....");
            return;
        }


        String username = args[0];
        String password = args[1];
        String city = args[4];


        if (username.equals("mohammad") && password.equals("www2334") && city.equals("tehran") ){
            System.out.println("the login is successfully");
        }else {
            System.out.println("the login is not successfully");
        }




    }

}
