class Ahorro {
	public static void main(String args[]){
	double ahorro=0;
	double ahorroMensual=500;
	double interes; 

	for(int mes=1; mes<=12; mes++){
	ahorro+=ahorroMensual;
	interes= ahorro*.09;
	ahorro+=interes;

		System.out.printf("El ahorro del mes %d es: %.2f%n", mes,ahorro);
		
	}
	System.out.printf("\n El total ahorrado es: %.2f%n",ahorro);
	}
}
	