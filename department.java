class Department {
    private String hodName;
    private int totalStudents;
    private double resultPercentage;

    public Department(String hodName, int totalStudents, double resultPercentage) {
        this.hodName = hodName;
        this.totalStudents = totalStudents;
        this.resultPercentage = resultPercentage;
    }

    public void displayValues() {
        System.out.println("HOD Name: " + hodName);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Result Percentage: " + resultPercentage + "%");
    }

    public double getResultPerStudent() {
        return resultPercentage / totalStudents;
    }
    
}

class test {
    public static void main(String[] args) {
        Department dept1 = new Department("John Doe", 100, 80.0);
        Department dept2 = new Department("Jane Smith", 200, 75.0);

        dept1.displayValues();
        System.out.println("Result per Student: " + dept1.getResultPerStudent() + "%");

        dept2.displayValues();
        System.out.println("Result per Student: " + dept2.getResultPerStudent() + "%");

        double averageResultPerStudent = (dept1.getResultPerStudent() + dept2.getResultPerStudent()) / 2;
        if (averageResultPerStudent < 0.5) {
            System.out.println("The average result per student is worse.");
        } else {
            System.out.println("The average result per student is not worse.");
        }
    }
}
