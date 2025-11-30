import java.util.Scanner;
class TablaMultiplicar {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Ingrese un numero entero: ");
	int num=sc.nextInt();
	System.out.println("\n======Tabla de multiplicar======");

	for(int i=1; i<=10; i++) {
		System.out.println(num + "x" + i + "=" + (num*i));
		}
	sc.close();
	}
}