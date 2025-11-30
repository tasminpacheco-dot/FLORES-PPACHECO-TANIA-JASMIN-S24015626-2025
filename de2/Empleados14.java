class Empleados14 {
	public static void main(String args[]) {
	String nombres []={"Marcos","Matilde","Paty","Javier"};
	int sueldoM []={540,540,760};
	int sueldoMa []={200,220,250};
	int sueldoP []={760,760,760};
	int sueldoJ[]={605,799,810};

	int acumulado[] =new int[4];
	acumulado[0]=sueldoM[0]+sueldoM[1] + sueldoM[2];
	acumulado[1]=sueldoMa[0]+sueldoMa [1] + sueldoMa[2];
	acumulado[2]=sueldoP[0]+sueldoP[1]+ sueldoP[2];
	acumulado[3]=sueldoJ[0]+sueldoJ[1]+ sueldoJ[2];

	int totalgen=0;
	for (int i=0; i<acumulado.length; i++) {
		totalgen+=acumulado[i];
	}
	
	int mayor=acumulado[0];
	int posmayor=0;

	for(int i=1; i<acumulado.length; i++) {
		if(acumulado[i]>mayor) {
			mayor=acumulado[i];
			posmayor=i;
		}
	}
	System.out.println("===Cantidad Acumulada ===");
	for (int i=0; i<nombres.length; i++) {
		System.out.println(nombres[i]+ ": $" + acumulado [i]);
	}
	System.out.println("\nTotal pagado en sueldos: $" +totalgen);
	System.out.println("Empleado con mayor ingreso acumulado: " +nombres[posmayor] + " con $" + mayor);
	}
}
