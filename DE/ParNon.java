import java.util.Scanner;
public class ParNon{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n;

	System.out.println("Ingrese un número: ");
	n=sc.nextInt();
		System.out.println("El número ingresado es: " +n);

	if(n % 2==0){
	System.out.println("El número es par");
	}else{
	System.out.println("El número es non");
	}
	sc.close();
	}
}
