public class DataTypes {
    public static void main(String[] args) {
        int n = 01234567;
        long nL = 12345678910L;

        double nD = 123.45678910112;
        float nF = 123.456F;

        var salary = 1000; //int

        //pension 3%
        var pension = salary*0.3;
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Dante Gonzalez";

        System.out.println("Employee: " + employeeName + "Salary: " + totalSalary);

    }
}
