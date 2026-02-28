public class Task_2 {

    public static void main(String[] args) {

        double[] myGrades = {4.5, 5.0, 3.5, 4.0, 5.0};

        Student myStudent = new Student("Alex", myGrades);

        double average = myStudent.calculateAverage();

        System.out.println("Student: " + myStudent.name);
        System.out.println("Average: " + average);
    }
}

class Student {
    String name;
    double[] grades;

    Student(String n, double[] g) {
        name = n;
        grades = g;
    }

    double calculateAverage() {
        double sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }

        return sum / grades.length;
    }
}