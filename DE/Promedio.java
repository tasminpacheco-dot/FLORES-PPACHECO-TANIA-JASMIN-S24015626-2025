import java.util.Scanner;
class Promedio{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double c1,c2,c3,promedio;
	
	System.out.println("Ingresa la 1ra calificacion: ");
	c1=sc.nextDouble();
	System.out.println("Ingrese la 2da calificacion: ");
	c2=sc.nextDouble();
	System.out.println("Ingrese la 3ra calificacion: ");
	c3=sc.nextDouble();

	promedio=(c1+c2+c3)/3;

	System.out.println("El promedio general es de: " + promedio);
	sc.close();
	}
}

	