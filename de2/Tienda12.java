import java.util.*;
class Tienda12 {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String dias []={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
	double []ventas=new double[7];

	System.out.println("\n=== Ingrese las ventas de cada dia de la semana ===");
	
		for (int u=0; u<ventas.length; u++) {
			System.out.println("Venta del dia " + dias[u] + ":" + "$");
			ventas[u]=sc.nextDouble();
		}
		System.out.println("\n=== Ventas ===");
		for(int i=0; i<dias.length; i++) {
			System.out.println(dias[i] + ": $" + ventas[i]);
		}
	
	double total=0;
	for(double v: ventas) {
		total +=v;
	}

	double mayor=ventas[0];
	int diaMayor=0;

	for (int i=1; i< ventas.length; i++){
		if(ventas[i]> mayor) {
			mayor=ventas[i];
			diaMayor=i;
		}
	}
	System.out.println("\n=== Resultados ===");
	System.out.println("Venta total de la semana: $"+ total);
	System.out.println("Dia con mayor venta: " + dias[diaMayor]+ "con $" +mayor);
	
	sc.close();
	}
}