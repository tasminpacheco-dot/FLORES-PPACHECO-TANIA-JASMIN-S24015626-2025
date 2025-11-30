import java.util.Scanner;
class Numeros10 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	double[]num=new double[10];
	
	for(int i=0; i<num.length; i++) {
		System.out.println("Ingrese numero" + (i+1) + ":"); 
		num[i]=sc.nextDouble();
	}
	
	for(int i=0; i<num.length/2; i++) {
		double volt=num[i];
		num[i]=	num[num.length -1-i];
		num[num.length-1-i]= volt;
	}
	System.out.println ("\n===Numeros invertidos===");
	for (int i=0; i<num.length; i++) {
		System.out.println(num[i]);
	}
	sc.close();
	}
}