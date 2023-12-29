import java.util.regex.*;

public class SeachLetter {
    public static void main(String[] args){
        String text = "He’ll call a cab in half an hour.";
        String letter = "H";
        try{
        Pattern pattern = Pattern.compile("(\\b" + letter + "[a-z]*\\b)|(\\b" + letter.toLowerCase() + "[a-z]*\\b)");
        Matcher matcher = pattern.matcher(text);
        
        System.out.println("Слова на " + letter + ":");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
        
        
    }
}