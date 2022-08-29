package org.launchcode.exercises;

import org.launchcode.Temperature.TemperatureException;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");


    }

    public static int Divide(int x, int y) {


        if (y == 0) {
            try {
                Divide(10, 0);
            } catch (ArithmeticException e) {

                System.out.println("y should be greater than 0");
            }


        }
        return x/y;
    }



    public static int CheckFileExtension(String fileName) {
        int submissionPoints = 0;

        if (fileName == "" || fileName == null) {
            try {
                throw new Exception("Invalid file name!");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (!fileName.contains(".java")) {
            return submissionPoints -= 1;
        } else {
            submissionPoints += 1;
        }


        return submissionPoints;
    }
}
