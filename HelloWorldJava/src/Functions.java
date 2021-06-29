public class Functions {


    public static void main(String[] args) {
        System.out.println(circleArea(2));
        System.out.println(sphereVolume(3));
        System.out.println(convertToDollar(20,"MXN"));
    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereVolume(double r){

        return 4 * Math.PI * Math.pow(r,2);
    }

    /**
     * Description: This functions converts specific currencies
     * @param quantity the amount of money
     * @param currency Type of currency: only accepts MXN and COP
     * @return quantity It returns the converted amount
     * */

    public static double convertToDollar(double quantity, String currency){

        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.0031;
                break;}

     return quantity;

        }
    }

