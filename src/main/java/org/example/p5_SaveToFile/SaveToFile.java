package org.example.p5_SaveToFile;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile {

    public static void main(String[] args) throws IOException {
        args = new String[]{"arg1", "arg2", "arg3","arg4","arg5","java","c#","html"};

        if (args.length == 0 ){
            System.out.println("not found args");
            return;
        }


        FileWriter writer = new FileWriter("output2.doc");


        for (String arg:args){
            writer.write(arg+"\n");
        }

        writer.close();

        System.out.println("the end of writing");


    }


}
