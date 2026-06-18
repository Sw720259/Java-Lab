public class StudentMarks {
    public static void main(String[] args) {
        int[][] marks = {{70,80,90},{60,75,85},{88,92,76}};
        for (int i=0;i<marks.length;i++) {
            int sum=0;
            for (int j=0;j<marks[i].length;j++) sum+=marks[i][j];
            double avg = sum/3.0;
            System.out.println("Student " + (i+1) + " Total: " + sum + ", Average: " + avg);
        }
    }
}

