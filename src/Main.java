public class Main {
    public static void main(String[] args) {
        double[] array = {2.3, 1.3, 2.4, -4.5, 3.6, -1.1, 2.1, 7.3, -8.9, 2.7, 9.2, 0.4, 7.3, 20.3, -4.7};

        double sum = 0;
        int count = 0;
        boolean foundNegative = false;

        for (double num : array) {
            if (num < 0) {
                foundNegative = true;
                continue;
            }

            if (foundNegative) {
                sum += num;
                count++;
            }
        }

        double average = sum / count;
        System.out.println(average);
    }
}


