public class ArraysHarmonicAverage {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6,7,8,9};
        double harmonicSeries = 0, average;
        for (int i = 0; i < numbers.length; i++) {
            harmonicSeries += 1.0 / numbers[i];
        }
        average = numbers.length / harmonicSeries;

        System.out.println("Harmonic Average: " + average);

    }
}