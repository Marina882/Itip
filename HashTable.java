import java.util.LinkedList;

public class HashTable<K, V> {
    private LinkedList<Entry<K, V>>[] table;
    private int size;
    private int elements;

    public HashTable(int size){
        this.size = size;
        this.table = new LinkedList[this.size];
        this.elements = 0;
    }

    public HashTable(){
        this(10);
    }

    private int hash(K key){
        return key.hashCode() % this.size;
    }

   
    public void put(K key, V value){
        int index = hash(key);
        if(table[index]== null){
            table[index] = new LinkedList<Entry<K, V>>();
            
        }
        for(Entry<K,V> elem: table[index]){
            if (elem.getKey().equals(key)){
                elem.setValue(value);
            }
        }
        table[index].add(new Entry<K, V>(key, value));
        this.elements++;

    }

    public V get(K key){
        int index = hash(key);
        if (table[index] != null){
            for (Entry<K, V> elem: table[index]){
                if (elem.getKey().equals(key)){
                    return elem.getValue();
                }
            }
        }
        
        return null;
    }

    public void remove(K key){
        int index = hash(key);
        if (table[index] != null){
            for (Entry<K, V> elem: table[index]){
                if (elem.getKey().equals(key)){
                    table[index].remove(elem);
                    this.elements--;
                }
            }
        }

    }
    public int size(){
        return this.elements;
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }

    public static void main(String[] args) {
        HashTable<Integer, Product> products = new HashTable<>(3);
        products.put(1234, new Product("Помидор", 120, 74));
        products.put(6434, new Product("Огурец", 80, 53));
        products.put(5486, new Product("Капуста", 100, 95));
        products.put(8563, new Product("Редис", 35, 68));
        System.out.println(products.get(1234).getName());
        System.out.println(products.get(6434).getName());
        System.out.println(products.get(5486).getName());
        System.out.println(products.get(8563).getName());
        System.out.println(products.hash(8563));
        System.out.println(products.hash(5486));
        System.out.println(products.hash(6434));
        System.out.println(products.hash(1234));
        

        System.out.println(products.size());
        

        

    }

}

class Entry<K, V> {
    private final K key;
    private V value;

    public Entry(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    public void setValue(V value){
        this.value = value;
    }
}

class Product{
    int prise;
    String name;
    int cnt;

    public Product(String name, int prise, int cnt){
        this.name = name;
        this.prise = prise;
        this.cnt = cnt;
    }

    public int getPrise(){
        return this.prise;
    }

    public String getName(){
        return this.name;
    }

    public int getCnt(){
        return this.cnt;
    }
        

    
}