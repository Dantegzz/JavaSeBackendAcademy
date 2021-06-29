public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if(isBluetoothEnabled){
            //sendfile
            fileSended++;
            System.out.println("Archivo Enviado");

        }
        else {
            fileSended--;
            System.out.println("Please turn on Bluetooth");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
    }
}
