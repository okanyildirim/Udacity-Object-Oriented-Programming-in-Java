package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public  static void main (String[] args){

//        Scanner scanner=new Scanner(System.in);
//        int x=0;
//        try{
//             x= scanner.nextInt();
//        }
//        catch (InputMismatchException e){
//            //System.out.println("Input must be a integer");
//           // throw e;
//            throw new InputMismatchException();
//        }
//
//        try{
//            System.out.println("Result: "+ x/0);
//        }
//        catch (ArithmeticException e){
//
//            System.out.println("0 a bolunmez");
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
//            //throw e;
//        }

        Takefile("../okan.txt");

    }

    public static void Takefile(String filename){

        try{
            FileInputStream file= new FileInputStream(filename);
        }
       catch (FileNotFoundException e){

            System.out.println("File is not found");

       }
    }


}
