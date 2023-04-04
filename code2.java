// package file1;

// import java.io.*;
// class MyException extends Exception{
//     private String message;

//     MyException(String message){
//         message = this.message;

//     }
//     public void message(){
//         System.out.println(message);
//     }
// }


// public class code2 {
//     public static void main(String[] args) {
//         //program on FILE HANDLING

//         try {
//             File objFile = new File("/Users/kamakshiojha/Documents/DSA in java/file1/code3.txt");
//           throw new MyException("this file is not created");
//             // objFile .createNewFile();
//          // System.out.println(objFile .exists());
//         } catch (MyException e) {
//             e.message();
//         }
        

        
//     }
// }

package file1;

import java.io.IOException;
import java.io.File;

class MyException extends Exception {
    private String message;

    MyException(String message) {
        // Fix: Assign the parameter value to the instance variable
        this.message = message;
    }

    public void message() {
        System.out.println(message);
    }
}

public class code2 {
    public static void main(String[] args) {
        // program on FILE HANDLING

        try {
           File objFile = new File("/Users/kamakshiojha/Documents/DSA_in_java/file2/code10.java");
            // Fix: Throw the custom exception with a message
            throw new MyException("This file is not created.");
            //objFile.createNewFile();
            //System.out.println(objFile.exists());
        } catch (MyException e) {
            e.message();
        }
    }
}

