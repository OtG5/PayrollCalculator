package com.pluralsight;
import java.io.*;
public class PayrollCalculator {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");

            BufferedReader bufReader = new BufferedReader(fileReader);
            bufReader.readLine();
            String input;

            while(runValue) {


        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
