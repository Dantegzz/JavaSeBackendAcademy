import com.sun.org.apache.xerces.internal.impl.xs.util.XSInputSource;

public class MathematicOperation {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //Returns value rounded up
        System.out.println(Math.ceil(x));

        //Returns value rounded down

        System.out.println(Math.floor(x));

        //Returns a number elevated to de power of other

        System.out.println(Math.pow(x,y));

        //Returns bigger number

        System.out.println(Math.max(x,y));

        //returns square root

        System.out.println(Math.sqrt(y));

        //Circle area

        System.out.println(Math.PI*Math.pow(y,2));

        //Sphere area
        // 4*PI*r2

        System.out.println(4 * Math.PI * Math.pow(y,2));

    }
}
