public class Casting {
    public static void main(String[] args) {
        //In 1 year I pined 30 dogs
        //How many dogs did I pinned in a month?

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //approximate value

        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Exact Value

        int a = 30;
        int b = 12;

        System.out.println((double)a/b);

        double c = (double) a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;

        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);



    }
}
