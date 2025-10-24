import java.util.Scanner;
public class Llamada{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	double cuenta;
	int tiempo;


	System.out.println("Ingrese el tiempo de duracion de su llamada(en minutos): ");
	tiempo=sc.nextInt();

	if (tiempo<3){
	cuenta=10;
	}else {
	cuenta=10+ (tiempo-3)*1;
	}

	System.out.println("El total a pagar es: " +cuenta + "N$");
	sc.close();
	}
}