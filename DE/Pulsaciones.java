import java.util.Scanner;

class Pulsaciones {
	public static void main(String args[]){	
	Scanner sc=new Scanner(System.in);
	int edad;
	double puls;
	
	System.out.println("Ingrese su edad: ");
	edad=sc.nextInt();

	puls=(220-edad)/10.00;
	
	System.out.println("El numero de pulsaciones cada 10 segundos es de: "+puls);
	
	sc.close();
	}
}