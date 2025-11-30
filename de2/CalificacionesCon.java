import java.util.Scanner;
class CalificacionesCon {
	public static void main (String args[]){
	Scanner sc=new Scanner(System.in);
	int cal;
	int conta=0;
	int contr=0;

	for (int i=0; i<5; i++) {
	System.out.println("Ingrese calificacion " + (i+1) +": " );
	cal=sc.nextInt();
	
		if(cal>=6 && cal<=10) {
			conta++;
		}else if (cal>0 && cal<6) {
			contr++;
		}else {
		System.out.println("Valor no valido.Vuelva a intentar.");
		i--;
		}
	}
	System.out.println("La cantidad de alumnos aprobados es: " + conta);
	System.out.println("La cantidad de alumnos reprobados es: " + contr);

	sc.close();
	}
}