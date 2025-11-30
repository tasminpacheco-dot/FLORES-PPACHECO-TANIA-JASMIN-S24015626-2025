import java.util.Scanner;
class Calificaciones9 {
	public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	double[] cal=new double[6];
	double suma=0;

	for(int i=0; i<cal.length; i++){
		while(true) {
			System.out.print("Ingrese la calificacion del estudiante " +(i+1)+ ":");
			if(sc.hasNextDouble()) {
				double nota=sc.nextDouble();
				if(nota>= 0 && nota<=10) {
					cal[i]=nota;
					suma+=nota;
					break;
				}else {
					System.out.println("Valor no valido. Intente con valores entre 0 y 10");
				}
			} else {
				System.out.println("Entrada invalida. Ingrese un numero. ");
				sc.next();
			}
		}
	}
	
	double promedio=suma/cal.length;

	System.out.println("===Calificaciones===");
		for(int i=0; i< cal.length; i++) {
			System.out.println("Estudiante " + (i+1) + ": " + cal [i]);
		}
	System.out.printf("\nEl promedio general del grupo es: %.2f\n", promedio);
	sc.close();
	}
}
	