import java.util.Scanner;
import java.util.regex.*;

public class AdressIP {
    public static void main(String[] args){
       System.out.println("Введите IP-адресс: ");
       Scanner scanner = new Scanner(System.in);
       String ad = scanner.nextLine();
       try {
        if (isVaid(ad)) {
            System.out.println("IP-адресс корректен");
           }
           else {
            System.out.println("IP-адресс не корректен");
           }
           
       } catch (Exception e) {
        System.out.println("Произошла ошибка: " + e.getMessage());

       }
       
    }

    public static boolean isVaid(String ad){
        Pattern pattern = Pattern.compile("^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$");
        Matcher matcher = pattern.matcher(ad);
        return matcher.matches();
    }
}