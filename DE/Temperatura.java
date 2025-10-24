import java.util.Scanner;

class Temperatura{
	public static void main(String args[]){
	Scanner sc=new Scanner (System.in);
	double temp,fahr,tempab;

	System.out.println("Ingrese la temperatura en centigrados: ");
	temp=sc.nextDouble();

	fahr=temp*32;
	tempab=temp+273.15;

	System.out.println("La conversion a Fahrenheit es: "+ fahr + "°F");
	System.out.println("La conversion a temperatura absoluta es: "+ tempab + "K");

	sc.close();
	}
}