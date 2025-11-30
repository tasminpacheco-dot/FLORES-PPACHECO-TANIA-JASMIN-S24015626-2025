import java.util.Scanner;
class Existe11 {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double [] num=new double[8];
	
	for (int i=0; i<num.length; i++) {
		System.out.println("Ingrese número " + (i+1) + ":");
		num[i]=sc.nextDouble();
	}

	System.out.println("¿Qué número desea buscar?: ");
	double buscar=sc.nextDouble();
	
	Boolean esta=false;
  
	for(int i=0; i<num.length; i++){
		if(num[i]==buscar){
			esta=true;
			break;
		}
	}
	
	if(esta) {
		System.out.println("\nEl número existe dentro del arreglo.");
	}else {
		System.out.println("El número no existe dentro del arreglo.");
	} sc.close();
	}
}