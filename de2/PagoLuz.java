import java.util.Scanner;
class PagoLuz {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	char continuar;
	int adeudo, actual,pago,pagoMes,pagoAdeudo;

	adeudo=1000;
	actual=580;

	do {

		System.out.println("=========MENÚ=========");
		System.out.println("1.Consulta");
		System.out.println("2.Pago del mes");
		System.out.println("3.Pago de adeudo");
		System.out.println("4.Salir");
		System.out.println("Seleccione una opción (1-4): ");
		int opc=sc.nextInt();


		switch (opc) {
		case 1:
			System.out.println("Adeudo: " +adeudo);
			System.out.println("Pago actual: " +actual);
			break;
		case 2:
			System.out.println("Cobro actual: " +actual);
			System.out.println("Ingrese efectivo lo mas acercado al total: " );
			pagoMes=sc.nextInt();

			if(pagoMes>= actual) {
				System.out.println("Pago realizado.Su cambio es: " + (pagoMes-actual));
				actual=0;
			}else {
				System.out.println("Pago insuficiente.Se abona a la cuenta. ");
				adeudo+= (actual-pagoMes);
				actual=0;
			}
			break;	
		case 3:
			System.out.println("Adeudo Total: " +adeudo);
			System.out.println("Ingrese efectivo lo mas acercado al total: ");
			pagoAdeudo=sc.nextInt();
 
			if(pagoAdeudo >= adeudo) {
				System.out.println("Pago realizado.Su cambio es: " + (pagoAdeudo-adeudo));
				adeudo=0;
			}else {
				System.out.println("Pago insuficiente. Se ha abonado a la cuenta: " +adeudo);
			}
			break;
		case 4:
			System.out.println("Sesión finalizada.");
			sc.close();
			return;

		default:
		System.out.println("Opcion invalida.");
		}

	System.out.println("Desea continuar con otro servicio? (s/n) ");
	continuar= sc.next().charAt(0);

	}while (continuar == 's' || continuar == 'S');
		System.out.println("Sus sesion ha sido finalizada. Gracias por su preferencia!.");
		
	sc.close();
	}
}

	