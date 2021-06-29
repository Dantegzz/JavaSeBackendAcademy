public class UpdatingVariables {

    public static void main(String[] args) {
        int salary = 1000;

        //bonus $200

        salary = salary + 200;
        System.out.println(salary);

        //Pension -$50

        salary = salary - 50;
        System.out.println(salary);

        //2 extra hours ($30 each one)
        //food expenses $45

        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Updating Strings

        String employeename = " Andres Gonzalez";

        employeename = employeename + " Garza";
        System.out.println(employeename);

        employeename = "Dante" + employeename;

        System.out.println("Your name is: " + employeename);




    }
}
