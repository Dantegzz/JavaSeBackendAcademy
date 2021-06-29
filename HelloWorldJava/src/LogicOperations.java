public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        //comparative operators
        System.out.println("is a equal to b? -> " + (a == b));
        System.out.println("is a different to b? -> " + (a != b));

        //Relations operators
        System.out.println("is a smaller than b? -> " + (a < b));
        System.out.println("is a bigger than b? -> " + (a > b));

        if (a==b){
            System.out.println("a is equal to b");
        }else if (a!=b){
            System.out.println("a is different to b");
        }else if (a<b){
            System.out.println("a is smaller than b");
        }

    }
}
