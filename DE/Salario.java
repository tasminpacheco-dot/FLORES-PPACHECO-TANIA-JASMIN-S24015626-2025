import java.util.Scanner;
class Salario {	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double nsalario, s;

	System.out.println("Ingrese el salario actual del trabajador: ");
	s=sc.nextDouble();
	
	nsalario=s*1.25;
	
	System.out.println("El nuevo salario es de: " + nsalario);

	sc.close();
	}
}