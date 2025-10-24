import java.util.Scanner;
class Determinacion {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double v1,v2,v3,mayor, menor, promedio;
	
	System.out.println("Ingrese el 1er valor: ");
	v1=sc.nextDouble();
	System.out.println("Ingrese el 2do valor: ");
	v2=sc.nextDouble();
	System.out.println("Ingrese el 3er valor: ");
	v3=sc.nextDouble();

	if (v1==v2 && v2==v3){
		System.out.println("Los 3 números son iguales");
	}else {
		if(v1>v2 && v1>v3) {
		mayor= v1;
	}else if (v2>v1 && v2>v3) {
		mayor= v2;
	}else {
		mayor=v3;
	}
	if (v1<v2 && v1<v3) {
		menor=v1;
	}else if (v2<v1 && v2<v3) {
		menor=v2;
	}else {
	menor= v3;
	}
	promedio=(v1+v2+v3)/3;
	System.out.println("El número mayor es: " + mayor);
	System.out.println("El número menor es: " + menor);
	System.out.printf("El promedio es: %.2f%n ", promedio);
	}
	sc.close();
	}
}