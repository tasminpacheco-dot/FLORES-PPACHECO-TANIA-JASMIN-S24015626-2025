import java.util.Scanner;
public class Presupuesto{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	double montop,pg,pt,pp;
	
	System.out.println("Ingrese el monto presupuestal: ");
	montop=sc.nextDouble();

	pg=montop*.40;
	pt=montop*.30;
	pp=montop*30;

	System.out.println("Dinero destinado a Ginecología: " + pg + " N$");
        System.out.println("Dinero destinado a Traumatología: " + pt + " N$");
        System.out.println("Dinero destinado a Pediatría: " + pp + " N$");
	
	sc.close();
	}
}