package loops;

import java.util.Random;
public class RandomNumbers {
    private int max = Integer.MIN_VALUE;
    private int min = Integer.MAX_VALUE;
    public void generateNumbers() {
        Random random = new Random();
        int sum = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum += temp;
            updateMax(temp);
            updateMin(temp);
        }
    }
    private void updateMax(int number) {
        if (number > max) {
            max = number;
        }
    }
    private void updateMin(int number) {
        if (number < min) {
            min = number;
        }
    }
    public int getMax() {
        return max;
    }
    public int getMin() {
        return min;
    }
    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.generateNumbers();
        System.out.println("Maximum randomly generated value: " + randomNumbers.getMax());
        System.out.println("Minimum randomly generated value: " + randomNumbers.getMin());
    }
}