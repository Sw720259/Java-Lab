public class ArrayExample2 {
    public static void main(String[] args) {
        int[] marks = {70, 85, 60, 90, 75};
        int sum = 0, highest = marks[0];

        for (int m : marks) {
            sum += m;
            if (m > highest) highest = m;
        }
        double avg = sum / 5.0;
        int aboveAvg = 0;
        for (int m : marks) if (m > avg) aboveAvg++;

        System.out.println("Average: " + avg);
        System.out.println("Highest: " + highest);
        System.out.println("Students above average: " + aboveAvg);
    }
}

