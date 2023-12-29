import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
   


public class Sklad {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        items.add(new Item("Товар1", 70));
        items.add(new Item("Товар2", 80));
        items.add(new Item("Товар3", 100));
        items.add(new Item("Товар4", 20));
        items.add(new Item("Товар5", 25));
        items.add(new Item("Товар6", 75));
        items.add(new Item("Товар7", 120));
        items.add(new Item("Товар8", 56));
        items.add(new Item("Товар9", 96));
        items.add(new Item("Товар10", 73));
        items.add(new Item("Товар11", 40));
        items.add(new Item("Товар12", 120));

        CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                while (!items.isEmpty()) {
                    List<Item> currentBatch = new ArrayList<>();
                    List<String> cnt = new ArrayList<>();
                    int currentWeight = 0;
                
                    for (Item item : items) {
                        if (currentWeight + item.getWeight() <= 150) {
                            currentBatch.add(item);
                            cnt.add(item.getName());
                            currentWeight += item.getWeight();
                        }
                    }
                
                    for (Item item : currentBatch) {
                        items.remove(item);
                    }
                    System.out.println("Грузчики переносят товары: " + cnt);

                    try {
                        Thread.sleep(2000); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Грузчики перенесли товары: " + cnt);
                
            }
        }
    });
    try {
        future.get();
    } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
    }
        

        
    }
}

class Item {
    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
