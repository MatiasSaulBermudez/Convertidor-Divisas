import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad a convertir: ");
        double cantidad = sc.nextDouble();
        System.out.println("Selecciona la moneda a la que quieres convertir: ");
        System.out.println("1. Dólares");
        System.out.println("2. Reales Brasileros");
        System.out.println("3. Euros");
        int seleccion = sc.nextInt();

        double tasaCambio = 0;
        String monedaDestino = "";

        switch (seleccion) {
            case 1:
                tasaCambio = 96.49; // Cambiar por la tasa de cambio actual
                monedaDestino = "dólares";
                break;
            case 2:
                tasaCambio = 18.09; // Cambiar por la tasa de cambio actual
                monedaDestino = "reales brasileros";
                break;
            case 3:
                tasaCambio = 114.04; // Cambiar por la tasa de cambio actual
                monedaDestino = "euros";
                break;
            default:
                System.out.println("La opción seleccionada no es válida.");
                break;
        }

        double resultado = cantidad * tasaCambio;
        System.out.println(cantidad + " pesos argentinos son " + resultado + " " + monedaDestino);
    }
}
