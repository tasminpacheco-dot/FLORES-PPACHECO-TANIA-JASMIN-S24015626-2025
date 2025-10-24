import java.util.Scanner;
class Banco {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double capital, interes, montot;
	
	System.out.println("Ingrese la cantidad que desea invertir: ");
	capital=sc.nextDouble();
	
	interes=capital*.02*1;
	montot=capital+interes;

	System.out.println("El interés generado es de: " + interes);
	System.out.println("El monto total es de: " + montot);
	
	sc.close();
	}
}