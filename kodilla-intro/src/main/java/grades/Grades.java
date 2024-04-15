package grades;

public class Grades {
    private int[] grades;
    private int size;
    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public int lastGrade() {
        if (this.size == 0) {
            System.out.println("There are no grades to display");
        }
        return this.grades[this.size-1];
    }
    public double averageOfGrades() {
        if (this.size == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int i =0; i<=this.size; i++){
            sum += this.grades[i];
        }
        return (double) sum/this.size;
    }
}
