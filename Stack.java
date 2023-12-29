public class Stack<T> {
    private T[] data;
    private int size;

    public Stack(int capacity) {
    data = (T[]) new Object[capacity];
    size = 0;
    }
    public void push(T element) {
        data[size++] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стэк пустой");
        }

        T element = peek();
        size--;
        return element;
    }
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стэк пустой");
        }

        return (T) data[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public static void main(String[] args) {

        Stack<String> intStack = new Stack<>(10);
        intStack.push("cat");
        intStack.push("dog");
        intStack.push("bird");
        

        System.out.println(intStack.peek());

        System.out.println(intStack.pop());

        System.out.println(intStack.peek());



    }

    }