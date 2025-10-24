import java.util.Scanner;

public class Concesionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double v1, v2, v3, v4;
        double com1, com2, com3, com4, comTotal;

        System.out.print("Ingrese el 1er valor de venta: ");
        v1 = sc.nextDouble();
        System.out.print("Ingrese el 2do valor de venta: ");
        v2 = sc.nextDouble();
        System.out.print("Ingrese el 3er valor de venta: ");
        v3 = sc.nextDouble();
        System.out.print("Ingrese el 4to valor de venta: ");
        v4 = sc.nextDouble();

        com1 = calcularComision(v1);
        com2 = calcularComision(v2);
        com3 = calcularComision(v3);
        com4 = calcularComision(v4);

        comTotal = com1 + com2 + com3 + com4;

        System.out.printf("El total de comisiones del vendedor es: $%.2f%n", comTotal);

        sc.close();
    }

    public static double calcularComision(double venta) {
        if (venta <= 10000000) {
            return venta * 0.02;
        } else if (venta > 10000000 && venta < 15000000) {
            return venta * 0.04;
        } else {
            return venta * 0.10;
        }
    }
}