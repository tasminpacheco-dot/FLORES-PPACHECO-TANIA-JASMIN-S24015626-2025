import java.util.Scanner;
class Circulo {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double radio, longitud, area;

	System.out.println("Ingrese el radio de su circunferencia: ");
	radio=sc.nextDouble();

	longitud=2* Math.PI* radio;
	area=Math.PI*radio*radio;
	System.out.printf("La longitud del círculo es de: %.5f%n", longitud);
        System.out.printf("El área del círculo es de: %.5f%n", area);
	sc.close();
	}
}

	