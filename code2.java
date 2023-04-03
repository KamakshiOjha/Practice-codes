package file1;

import java.io.*;
class MyException extends Exception{
    private String message;

    MyException(String message){
        message = this.message;

    }
    public void message(){
        System.out.println(message);
    }
}


public class code2 {
    public static void main(String[] args) {
        //program on FILE HANDLING

        try {
            File objFile = new File("/Users/kamakshiojha/Documents/DSA in java/file1/code3.txt");
          throw new MyException("this file is not created");
            // objFile .createNewFile();
         // System.out.println(objFile .exists());
        } catch (MyException e) {
            e.message();
        }
        

        
    }
}
