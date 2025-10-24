import java.util.Scanner;
public class Numeros{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	double a,b,c, disc, x1,x2;	
	
	System.out.println("Ingrese el valor de A: ");
	a=sc.nextDouble();
	System.out.println("Ingrese el valor de B: ");
	b=sc.nextDouble();
	System.out.println("Ingrese el valor de C: ");
	c=sc.nextDouble();

	if (a==0){
	System.out.println ("Error, ecuacion no cuadratica.");
	sc.close();
	return;
	}

	disc=(b*b)-(4*a*c);

	if (disc<0){
	System.out.println ("Error, raices imaginarias.");
	}else if (disc==0) {
	x1=-b/(2*a);
	System.out.printf ("La ecuacion tiene raiz doble: %.4f%n", x1);
	}else {
	x1= (-b + Math.sqrt (disc))/(2*a);
	x2= (-b - Math.sqrt (disc))/(2*a);
	System.out.printf("Raiz 1: %.4f%n", x1);
	System.out.printf("Raiz 2: %.4f%n", x2);
	}
	sc.close();
	}
}