import java.util.HashMap;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class Shop {
    HashMap<Product, Integer> sales;

    public Shop() {
        this.sales = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (sales.containsKey(product)){
            sales.replace(product, sales.get(product) + 1);

        }
        else {
            sales.put(product, 1);
        }
        
    }

    public void listProduct() {
        System.out.println("Список проданных товаров:");
        for (HashMap.Entry<Product, Integer> entry : sales.entrySet()) {
            System.out.println(entry.getKey().getName() +" (" + entry.getKey().getPrice() + "руб." + ") - " + entry.getValue() +"шт.");
        }
    }

    public double cntPrise() {
        double cnt = 0;
        for (HashMap.Entry<Product, Integer> entry : sales.entrySet()) {
            cnt += entry.getKey().getPrice() * entry.getValue();
        }
        return cnt;
    }

    public String findMostPopularProduct() {
        String p = null;
        int maxValue = 0;

        for (HashMap.Entry<Product, Integer> entry : sales.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                p = entry.getKey().getName();
            }
        }
        return p;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();

        Product p11 = new Product("Сок яблочный", 50.0);
        Product p22 = new Product("Кетчуп", 65.99);
        Product p33 = new Product("Чупа-чупс", 15.5);
        
        shop.addProduct(p11);
        shop.addProduct(p11);
        shop.addProduct(p22);
        shop.addProduct(p33);
        shop.addProduct(p33);
        shop.addProduct(p33);
        
        shop.listProduct();;

        System.out.println("Общая сумма продаж: " + shop.cntPrise() + " руб.");

        System.out.println("Самый популярный товар: " + shop.findMostPopularProduct());
    }
}