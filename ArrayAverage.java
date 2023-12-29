
public class ArrayAverage{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        try{
            for (int i = 0; i < arr.length; i++) {
                arr[i]= new Integer("One");
                sum += arr[i];
            }
            System.out.println(sum/arr.length);
        }
        catch (ArithmeticException e) {
            System.out.println("Делеить на ноль нельзя!");
        }
        catch(NullPointerException e){
            System.out.println("Массив пустой.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива.");
        }
        catch (NumberFormatException e){ 
            System.err.println("Введены неверные данные!");
        }
        
       
    }

}