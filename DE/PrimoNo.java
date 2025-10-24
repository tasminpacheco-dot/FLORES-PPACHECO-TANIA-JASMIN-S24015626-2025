import java.util.Scanner;
public class PrimoNo{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n;
	boolean esprimo;

	System.out.print("Ingrese un número: ");
        n = sc.nextInt();

        System.out.println("El número ingresado es: " + n);

	if (n <= 1) {
            System.out.println("El número no es primo");
        } else {
            esPrimo = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println("El número es primo");
            } else {
                System.out.println("El número no es primo");
            }
        }

        sc.close();
    }
}