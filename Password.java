import java.util.Scanner;
import java.util.regex.*;

public class Password {
    public static void main(String[] args){
       System.out.println("Введите пароль: ");
       Scanner scanner = new Scanner(System.in);
       String pass = scanner.nextLine();
       try {
        if (isVaid(pass)) {
            System.out.println("Пароль корректен");
           }
           else {
            System.out.println("Пароль не корректен");
           }
           
       } catch (Exception e) {
        System.out.println("Произошла ошибка: " + e.getMessage());

       }
       
    }

    public static boolean isVaid(String pass){
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$");
        Matcher matcher = pattern.matcher(pass);
        return matcher.matches();
    }
}