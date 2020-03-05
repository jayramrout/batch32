package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        File file = new File("/Users/jrout/Development/Github/batch32/CoreJava/src/misc/StringExample.java");
        new Scanner(System.in);

        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
