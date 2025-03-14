package Chap9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoCloseSample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("hi.txt"))) {
            System.out.println(reader.readLine());

            throw new IOException("IOException");
        } catch (IOException e) {
            System.out.println("error message: " + e.getMessage());
        }
    }
}
