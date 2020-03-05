package io;

import java.io.*;

public class CharacterStreamExample2 {
    public static void main(String[] args){
        File file = new File("/Users/jrout/Development/Github/batch32/CoreJava/src/HelloWorld.java");

        FileReader reader = null;
        try {
            reader = new FileReader(file);
            int c;
            while((c = reader.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // try with resource....
        try(FileReader reader1 = new FileReader(file)){
            int c;
            while((c = reader1.read()) != -1) {
                System.out.print((char)c);
            }
        }catch (IOException ex){
           ex.printStackTrace();
        }





        try {
            reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            int c;
            while((c = bufferedReader.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }


}
