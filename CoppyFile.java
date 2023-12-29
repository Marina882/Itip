import java.io.*;

public class CoppyFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\ИТП\\лаб1\\4\\obaba.txt");
        try {
            FileInputStream doo = new FileInputStream(file);
            FileOutputStream posle = new FileOutputStream("D:\\ИТП\\лаб1\\4\\posle.txt");

            while (doo.available() > 0) {
                int elem = doo.read();
                posle.write(elem);
            }
            doo.close();
            posle.close();
            
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
        catch (IOException e){
            System.out.println("Файл не может быть закрыть, так как с ним проводится опирация!");
        }
    }
}