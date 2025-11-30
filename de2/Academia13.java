import java.util.Scanner;
class Academia13 {
	public static void main (String args[]){
	Scanner sc=new Scanner(System.in);
	int matriz[] []= new int [3][4];

	System.out.println("=== Registro estudiantes ===" );
	System.out.println("Niveles: 0.Basico, 1.Medio, 2.Perfeccionamiento"); 
	System.out.println("Idiomas: 0.Ingles, 1.Frances, 2.Aleman, 3.Ruso");
	
	for (int i=0; i<12; i++) {
		System.out.println("Estudiante " +(i+1));
	
		int nivel;
	
			do {
				System.out.println("Ingrese nivel del estudiante 0-2: ");
				nivel=sc.nextInt();
			}while (nivel<0 || nivel> 2);

			int idioma;
			do {
				System.out.println("Ingrese el idioma 0-3: ");
				idioma=sc.nextInt();
			}while (idioma<0 || idioma> 3);
		
			matriz[nivel][idioma]++;
			System.out.println();
		}
		System.out.println("\n=== Matriz de estudiantes ===");
		String niveles[]={"Basico","Medio","Perfeccionamiento"};
		String idiomas[]={"Ingles","Frances", "Aleman", "Ruso"};

		for (int j=0; j<3; j++) {
			System.out.println(niveles[j] + ":\t");
			for (int f=0; f<4; f++) {
			System.out.print(matriz[j][f] + "\t");
		}
		System.out.println();
	}
	sc.close();
	}
}
	