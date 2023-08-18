 /*Scanner vv = new Scanner(System.in);

        System.out.print("Enter the employee alphabet: ");
        char name = vv.next().charAt(0);
        if(name>='a' && name<= 'z'){
        System.out.println("the given alphabet is lower case");
        }
        else if (name>'A' && name<= 'Z'){
          System.out.println("the given alphabet is uppercase");
        } 
        else {
          System.out.println("the given input is special Character ");
        }*/
         
        java

import java.util.Scanner;



        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase character.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase character.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is a special character.");
        }
    }
