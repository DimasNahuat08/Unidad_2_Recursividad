package cambio;

import java.util.Scanner;

public class Cambio {

    public static void main(String[] args) {
        // TODO code application logic here
        Billetes bil = new Billetes();
        Scanner x = new Scanner(System.in);
        int efectivo;
        int precio;
        int cam;

        System.out.print("Ingrese el el monto a cobrar: $");
        efectivo = x.nextInt();
        System.out.print("Ingrese el total del producto: $");
        precio = x.nextInt();

        cam = efectivo - precio;

        bil.bille(cam);

    }

}
