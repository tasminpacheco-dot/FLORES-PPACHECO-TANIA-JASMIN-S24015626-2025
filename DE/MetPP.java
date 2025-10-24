import java.util.Scanner;

public class MetPP {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	double pulgada,pies,dato;
	
	System.out.println("Ingrese cantidad en metros");
	dato=sc.nextDouble();
	
 	pies=dato*3.28084;
	pulgada=dato*39.37;

	System.out.println("La conversion a pies es: " +pies);
	System.out.println("La conversion a pulgadas es: "+pulgada);
	sc.close();
	}
}
	
	  

