package io;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("/Users/jrout/Development/Github/batch32/Computer/pom.xml");
        boolean exists = file.exists();
        System.out.println("Is director : "+ file.isDirectory());

        if(exists){
            System.out.println("File is present...");
            System.out.println(file.getAbsolutePath());
        }


    }
}
