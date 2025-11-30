import java.util.Scanner;
class CajeroRetiro{
	public static void main (String args[]) {
	Scanner sc=new Scanner(System.in);
	int retiro;
	int saldodis=5000;
	char continuar;

	System.out.println("Bienvenido a su cajero automatico!.");

	do {
	System.out.println("Saldo disponible: " +saldodis);
	System.out.println("Cuanto dinero desea retirar?: ");
	retiro=sc.nextInt();
	
		if(retiro <=saldodis) {
			saldodis -=retiro;
			System.out.println("Monto valido. Su saldo actualizado es: " + saldodis);
		}else {
			System.out.println("Saldo insuficiente.");
	}
	System.out.println("Desea realizar otro retiro?(s/n).");
	continuar=sc.next().charAt(0);

	}while (continuar== 's' || continuar== 'S');
		System.out.println("Sesion finalizada.");
		sc.close();
	}
}