import java.util.Scanner;
public class Descuentos{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	double totc,desc;
	int num=0;

	System.out.println("Ingrese el total de la compra: ");
	totc=sc.nextDouble();
	System.out.println("Ingrese el numero que saco: ");
	num=sc.nextInt();
	
	if(num<74){
	desc=totc*.15;
	System.out.println("El descuento es de: " +desc);
	}else if (num>=74){
	desc=totc*.20;
	System.out.println("El descuento es de: " +desc);	
	}
	sc.close();
	}
}