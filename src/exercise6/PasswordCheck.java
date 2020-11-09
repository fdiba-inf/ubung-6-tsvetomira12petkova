package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geben Sie einen Passwort ein: ");
       String password = input.nextLine();

       int count = 0;
       boolean check = true;
      for (int i = 0; i < password.length(); i++) {
        if (Character.isDigit(password.charAt(i))) {
          count++;

      

    }
    }
    for (int i = 0; i < password.length(); i++) {
        if (!Character.isLetterOrDigit(password.charAt(i))) {
          check = false;
    }
}
    if (password.length() <= 8 && count <= 2 ) {
         System.out.println("Password invalid!");
      } else {
         System.out.println("Password valid!");
    }
}
}
