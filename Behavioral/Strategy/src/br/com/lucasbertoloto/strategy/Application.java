package br.com.lucasbertoloto.strategy;

public class Application {
    public static void main(String[] args) {
        //this pattern is used when you need to build a class that can do a thing in many ways
        int[] vector = initializeVector();
        System.out.println("Vector before sorted: ");
        printVector(vector);
        long startTimeBubble = System.nanoTime();
        orderByStrategy(new BubbleSortStategy(), vector);
        long endTimeBubble = System.nanoTime();
        long durationBubble = (endTimeBubble - startTimeBubble)/1000;
        System.out.println("Vector after sorted by Bubble Sort: ");
        printVector(vector);

        vector = initializeVector();
        long startTimeQuick = System.nanoTime();
        orderByStrategy(new QuickSortStategy(), vector);
        long endTimeQuick = System.nanoTime();
        long durationQuick = (endTimeQuick - startTimeQuick)/1000;
        System.out.println("Vector after sorted by Bubble Sort: ");
        printVector(vector);

        System.out.println("Duration of the sorting by Bubble Sort: "+ durationBubble + " milliseconds");
        System.out.println("Duration of the sorting by Quick Sort: "+ durationQuick + " milliseconds");
    }

    private static int[] initializeVector() {
        return new int[]{99, 10, 5, 7, 8, 4, 2, 7, 1, 5, 7 ,5 ,6 ,9, 87, 7, 1, 3, 8, 7, 6, 3, 5, 1, 7, 3, 8, 7, 10, 50,
        20, 15, 54, 7, 50, 40, 75, 85, 52, 77, 74, 10, 14, 57, 75};
    }

    private static void orderByStrategy(Strategy strategy, int[] vector) {
        strategy.order(vector);
    }

    private static void printVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector["+ i +"] = "+ vector[i]);
        }
    }
}
