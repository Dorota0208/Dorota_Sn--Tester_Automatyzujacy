package grades;

public class DisplayGrades {
    public static void main(String[] args) {

        Grades grades = new Grades();

        grades.add(5);
        grades.add(6);
        grades.add(4);
        grades.add(2);
        grades.add(3);

        System.out.println("Last grade: "  + grades.lastGrade());

        double average = grades.averageOfGrades();
        System.out.println("Average: " + average);
    }
}