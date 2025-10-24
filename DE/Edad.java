import java.util.Scanner;
import java.time.LocalDate;

class Edad{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int fecha, fechaac, edad;

	System.out.println("Ingrese su año de nacimiento: ");
	fecha=sc.nextInt();

	fechaac=LocalDate.now().getYear();
	edad=fechaac-fecha;

	System.out.println("Su edad es: " +edad + " años");

	sc.close();
	}
}
