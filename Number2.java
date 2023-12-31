public class Number2 {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 7, 3},
            {8, 56, 43},
            {1, 46, 99}
        };
        int num = matrix.length;
        MaxFinderThread[] threads = new MaxFinderThread[num];
        for (int i = 0; i < num; i++) {
            threads[i] = new MaxFinderThread(matrix[i]);
            threads[i].start();
        }
        try {
            for (int i = 0; i < num; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int maxResult = 0;
        for (int i = 0; i < num; i++) {
            if (threads[i].getResult() > maxResult) {
                maxResult = threads[i].getResult();
            }
        }
        System.out.println(maxResult);
    }
}

class MaxFinderThread extends Thread {
    private int[] arr;
    private int maxResult;
    
    public MaxFinderThread(int[] arr) {
        this.arr = arr;
        this.maxResult = 0;
    }
    
    public void run() {
        for (int num : arr) {
            if (num > maxResult) {
                maxResult = num;
            }
        }
    }
    
    public int getResult() {
        return maxResult;
    }
}
