package Udacity2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your address: ");
//        String address = scanner.nextLine();
//        System.out.println("You live at: " + address);
//
//        System.out.println("Enter your grade: ");
//        int grade = scanner.nextInt();
//        if(grade > 90){
//            System.out.println("Wow! you did well!");
//        }else{
//            System.out.println("Not bad, but you can do better next time!");
//


//

        File file =new File("C:\\Users\\okkaa\\Desktop\\Phase-1.txt");
        Scanner readfile= new Scanner(file);
        int counter=0;
        int result=0;
        while(readfile.hasNextLine()){

            String line = readfile.nextLine();
            counter=line.split(" ").length;
            String fi[]=line.split("=");


        }
        System.out.println(result);
    }
}
