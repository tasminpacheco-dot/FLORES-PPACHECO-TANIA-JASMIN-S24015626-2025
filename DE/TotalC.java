import java.util.Scanner;
class TotalC {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double total,totalc,desc;

	System.out.println("Ingrese el total de su compra: ");
	total=sc.nextDouble();
	
	desc=total*.15;
	totalc=total-desc;
	
	System.out.printf("El descuento es de: %.2f%n ",desc);
	System.out.printf("El total  pagar seria de:%.2f%n  ",totalc);

	sc.close();
	}
}	

