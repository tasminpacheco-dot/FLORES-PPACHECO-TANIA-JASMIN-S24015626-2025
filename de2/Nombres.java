import java.util.Scanner;
class Nombres {
	public static void main (String args[]) {
	Scanner sc=new Scanner (System.in);
	String nombre;
	String [] nombres=new String [10];
	
	for (int i=0; i<10; i++) {
	System.out.println("Introduce el nombre de la persona: ");
	nombres[i]=sc.nextLine();
	}

	for (int i=0; i<10; i++){
	System.out.println((i+1) + "." + nombres [i]);
	}
	sc.close();
	}
}
	