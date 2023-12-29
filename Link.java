import java.util.regex.*;

public class Link {
    public static void main(String[] args){
        String text = "Такая ссылка: https://www.sit.com и вторая https://www.notsit.com";
        try{
        Pattern pattern = Pattern.compile("https://\\S+");
        Matcher matcher = pattern.matcher(text);
        StringBuffer str = new StringBuffer();
        while (matcher.find()) {
            String url = matcher.group(); 
            matcher.appendReplacement(str, "<a href=\"" + url +"\">" + url + "/a>");
            
        }
        System.out.println(str);

        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
        
        
    }
}