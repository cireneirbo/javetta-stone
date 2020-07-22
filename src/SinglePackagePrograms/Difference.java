package SinglePackagePrograms;

import java.util.Scanner;

public class Difference {

    public static void main(String[] args) {

        String stringQuestion = "What is the difference between\n" +
                "a ' and a \"?  Or between a \" and a \\\"?";
        String stringAnswer = "One is what we see when we're typing our program.\n" +
                "The other is what appears on the \"console.\"";

        Scanner input;
        input = new Scanner(System.in);
        System.out.println(stringQuestion);
        String userAnswer = input.next();
        input.close();
        System.out.println("You said: " + userAnswer);
        System.out.println("The answer: " + stringAnswer);
    }
}


//    Write a complete Java program in a class named Difference that prints the following output:
//
//        What is the difference between
//        a ' and a "?  Or between a " and a \"?
//
//        One is what we see when we're typing our program.
//        The other is what appears on the "console."

//  https://practiceit.cs.washington.edu/problem/view/bjp5/chapter1/e4-Difference