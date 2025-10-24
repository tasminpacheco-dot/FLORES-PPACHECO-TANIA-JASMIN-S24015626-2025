import java.util.Scanner;
public class UniversidadC{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	double cal;

	System.out.println("Ingrese la calificacion: ");
	cal=sc.nextDouble();

	if(cal>=0 && cal<=1){
	System.out.println("P (Pesimo)");
	}else if(cal>1 && cal <=2){
	System.out.println("M (Mal)");
	}else if(cal>2 && cal<=2.9){
	System.out.println("R (Regular)");
	}else if(cal>2.9 && cal<=4){
	System.out.println("B (Bien)");
	}else if(cal>4.1 && cal<=5){
	System.out.println("E (Excelente)");
	}else {
	System.out.println("Calificacion invalidad");
	}

	sc.close();
	}
}