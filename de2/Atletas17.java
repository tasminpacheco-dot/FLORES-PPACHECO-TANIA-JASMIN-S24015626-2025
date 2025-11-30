class Atletas17 {
	public static void main(String args[]){

	String [][] atletas={
		{"Ana", "Lopez", "100m"},
		{"Luis", "Perez", "200m"},
		{"Carla", "Diaz", "400m"},
		{"Jorge", "Ruiz", "100m"},
		{"Maria", "Solis", "800m"},
	};
	
	double[] tiempos= {12.5,23.4, 53.2, 11.8,125};
	
	int mejor=0;
	double mejort=tiempos[0];
		for(int i=1; i<tiempos.length; i++) {
			if(tiempos[i]<mejort){
			mejort=tiempos[i];
			mejor=i;
		}
	}
	
	System.out.printf("%-10s %-10s %-15s %-10s\n", "Nombre", "Apellido", "Especialidad", "Tiempo (s)");

	for(int i=0; i<atletas.length; i++) {
		if(i==mejor) {
			System.out.printf("*%-9s %-10s %-15s %-10.1f*\n", atletas[i][0], atletas[i][1], atletas[i][2], tiempos[i]);
		}else {
			System.out.printf(" %-9s %-10s %-15s %-10.1f \n", atletas[i][0], atletas[i][1], atletas[i][2], tiempos[i]);
		}
	}
}
}
			