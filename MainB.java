public class MainB{
    public static void main (String[] arg) {
        BabyBicycle x = new BabyBicycle();
        x.Names();
        x.Chehol(15.7f, 5.8f);
        
        
    }
}
abstract class Bicycle {

    private static int countBicycle;
    private String color;
    private float wheelDiameter;
    private float weight;

    public Bicycle(){
        this.countBicycle++;
    }

    public Bicycle(String color, float wheelDiameter, float weight) {
        this.countBicycle++;
        this.color = color;
        this.wheelDiameter = wheelDiameter;
        this.weight = weight;
    }

    public int getCountBicycle() {
        return this.countBicycle;
    }


    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setWheel(int wheelDiameter){
        this.wheelDiameter = wheelDiameter;
    }

    public float getWheel(){
        return this.wheelDiameter;
    }


    public void setWeight(int weight){
        this.weight = weight;
    }

    public float getWeight(){
        return this.weight;
    }


    abstract void Names();
  
}
class BabyBicycle extends Bicycle{

    private static int countBabyBicycle;
    private String step;
    private String call;
    private int quantityWheels;

    public BabyBicycle() {
        super("green", 15.6f, 15.6f);
        this.countBabyBicycle++;
        this.call = "There is a call.";
        this.step = "There is a step.";
    }

    public BabyBicycle(String color, float wheelDiameter,float weight, String call, String step, int quantityWheels) {
        super(color, wheelDiameter, weight);
        this.countBabyBicycle++;
        this.call = call;
        this.step = step;
        this.quantityWheels = quantityWheels;
        
    }

    public void callStep() {
        System.out.println(call + "\n" + step);
    }

    public void Chehol(int a, int b){
        int s;
        s = a * b;
        System.out.println(s);
    }

    public void Chehol(float a, float b){
        float s;
        s = a * b;
        System.out.println(s);
    }

    @Override
    public void Names() {
        System.out.println("Детский велосипед");

    }

    public int getCountBabyBicycle() {
        return this.countBabyBicycle;
    }


}

class MountainBicycle extends Bicycle{

    private static int countMountainBicycle;
    private int speedQuantity;
    private float tires;
    private int sits;

    public MountainBicycle(){
        super("green", 15.6f, 15.6f);
        this.countMountainBicycle++;
    }

    public MountainBicycle(String color, float wheelDiameter, float weight, int speedQuantity, float tires, int sits) {
        super(color, wheelDiameter, weight);
        this.countMountainBicycle++;
        this.speedQuantity = speedQuantity;
        this.tires = tires;
        this.sits = sits;
    }


    public int getCountMountinBicycle() {
        return this.countMountainBicycle;
    }


   public void Options() {
    System.out.println("Количество скоростей: " + speedQuantity);
    System.out.println("Количество сидений: " + sits);
    System.out.println("Диаметр покрышек: " + tires);
   }

   @Override
   public void Names() {
    System.out.println("Горный велосипед");
   }
}
class BMX extends Bicycle{

    private static int countBMXBicycle;
    private float handlebarHeight;
    private float tires;
    

    public BMX(){
        super("green", 15.6f, 15.6f);
        this.countBMXBicycle++;
    }
    
    public BMX(String color, float wheelDiameter, float weight, float handlebarHeight, float tires) {
        super(color, wheelDiameter,  weight);
        this.countBMXBicycle++;
        this.handlebarHeight = handlebarHeight;
        this.tires = tires;
    }

    public void setHeandlebar(float handlebarHeight){
        this.handlebarHeight = handlebarHeight;
    }

    public float getHeandlebar(){
        return this.handlebarHeight;
    }

    public void setTires(float tires){
        this.tires = tires;
    }

    public float getTires(){
        return this.tires;
    }
    
    public int getCountBMXBicycle() {
        return this.countBMXBicycle;
    }

    public void countTires() {
        System.out.println("Диаметр покрышек: " + tires);
    }

   @Override
   public void Names() {
    System.out.println("BMX велосипед");
   }
}

class RaceBMX extends BMX {
    private int countRaceBicycle;

    public RaceBMX(){
        super("green", 15.6f, 15.6f, 10.0f, 5.0f);
        this.countRaceBicycle++;
    }
    
    public RaceBMX(String color, float wheelDiameter, float weight, float handlebarHeight, float tires) {
        super(color, wheelDiameter,  weight, handlebarHeight, tires);
        this.countRaceBicycle++;
    }

    public int getCountRaceBicycle() {
        return this.countRaceBicycle;
    }

}
