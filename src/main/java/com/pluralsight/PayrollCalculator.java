package com.pluralsight;
import java.io.*;
public class PayrollCalculator {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");

            BufferedReader bufReader = new BufferedReader(fileReader);
            bufReader.readLine();
            String input;
            boolean runValue =true;

            while(runValue) {
                if (bufReader.ready()){
                    while((input = bufReader.readLine()) != null){
                        System.out.println(input);
                    }
                        runValue = false;
                    } else {
                     //sleep for 5s
                    }
                }

                //close stream
                bufReader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
