package java��11��;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class �ļ����� {
	public static void main(String[] args) throws FileNotFoundException {
        java.io.File txt = new java.io.File("src/java��11��/input.txt");
        java.io.File te = new java.io.File("src/java��11��/output.txt");

        try(java.io.PrintWriter output = new java.io.PrintWriter(txt)){
            output.println("Nick Young");
            output.println("Swaggy P");
            output.print("Welcome to CBA !");
        }
        Scanner input = new Scanner(txt);
        try (java.io.PrintWriter output1 = new java.io.PrintWriter(te);){
            while(input.hasNext()){
                String a = input.nextLine();
                output1.println(a);
                System.out.println(a);
            }
        }
        input.close();
    }
}
