import java.util.Scanner;
class OrrganizacionE{
	public static void main(String args[]){
	Scanner sc=new Scanner (System.in);
	int categoria;
	double subsidio=0,sn,pago=0,hrs,ds;
	
	System.out.println("========CATEGORIAS========");
	System.out.println("1. 20000");
	System.out.println("2. 15000");
	System.out.println("3. 10000");
	System.out.println("4. 7500");
	System.out.println("A que categoria pertenece?(1-4)");
	categoria=sc.nextInt();
	System.out.println("Ingrese las horas trabajadas: ");
	hrs=sc.nextDouble();
	
	switch (categoria) {
	case 1:
	pago=20000*hrs;
	break;

	case 2:
	pago=15000*hrs;
	break;

	case 3:
	pago=10000*hrs;
	break;

	case 4:
	pago=7500*hrs;
	break;
	
	default:
	System.out.println("Categoria no valida");
	return;
	}

	ds=pago*.072;

	if (pago<1000000) {
		subsidio=pago*.15;
	}
	sn=pago-ds+subsidio;

	System.out.printf("Salario bruto: $%.4f%n", pago);
	System.out.printf ("Descuento por salud: $%.4f%n" ,ds);
	System.out.printf ("Subsidio aplicado: $%.4f%n" ,subsidio);
	System.out.printf("Salario a pagar: $%.4f%n",sn);
	sc.close();
	}
}

