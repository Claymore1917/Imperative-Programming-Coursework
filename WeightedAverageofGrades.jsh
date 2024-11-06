private static final int assessments = 3;
private static final int[] w = {30, 40, 30};

public static int[] average_grades(int[][] grades) {
    int students = grades.length;
    int[] averages = new int[students];
    for (int i = 0; i < students; i++) {
        int sum = 0;
        for (int j = 0; j < assessments; j++) {
            sum += grades[i][j] * w[j];
        }
        averages[i] = sum / 100;
    }
    return averages;
}

int students = 2; 
int[][] grades = {
    {51, 83, 28}, {0, 38, 95}
	};

int[] result = average_grades(grades);
System.out.println("Averaged Grades are:");
for (int grade : result) {
    System.out.print(grade + " ");
}