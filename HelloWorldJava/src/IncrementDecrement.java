public class IncrementDecrement {

    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); //4

        lives--; //decrement
        System.out.println(lives);//3

        lives++; //increment
        System.out.println(lives); //4

        //prefix
        // wins a gift by getting a life
        int gift = 100 + ++lives; //prefix
        System.out.println(gift);



    }
}
