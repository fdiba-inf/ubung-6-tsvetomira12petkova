package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");


        int Palindrom = input.nextInt();
        assert Palindrom > 0: "true";
        boolean Palindromche = false;

       

        int P1 = Palindrom%10;

        if(Palindrom == P1){
          P1 = Palindrom;
          
          Palindromche = true;
  
        

        } 
        else {
          Palindromche = false;
          
        }

      
        System.out.println("Palindrome: " +Palindromche);
    }

    
}
