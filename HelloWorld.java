// Name of programmer: Augustin Sanchez
// Name of program: Java - Hello World
// Date started: 1/28/23
//
// Description of program: Ask user for their first name and echo back in a greeting.
// Input/Processing/Output: user input in console, output is System.out in console
// Purpose of program: CIT-63 assignment Spring 2023
//
// References:
// https://www.w3schools.com/java/java_user_input.asp

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Program asking for name.
        System.out.print("My name is java, what is your name? ");
//User inputs name
        String name = scanner.nextLine();
        //Program greets you once name is given
        System.out.println("Hello " + name + ", I am glad to meet you and excited to welcome you to the world of java");
    }
}
