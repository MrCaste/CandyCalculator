import java.util.Scanner;

public class M1_07_Pedro_Castellano_Gonzalez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cupones=0;
		
		//primero pedimos cuantos cupones tiene el usuario
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantos cupones tienes?: ");
		cupones = sc.nextInt();
		
		sc.close();
		
		// luego llamamos a la funcion y imprimimos los resultados
		
		candyCalculator(cupones);
		
		System.out.println("tienes, "+candyCalculator(cupones) [0]+" caramelo, "+candyCalculator(cupones) [1]+" chicles y "
		+candyCalculator(cupones) [2]+" cupones restantes.");
		

	}
	
	//se crea la funcion que nos indica cuantos caramelos, chicles y cupones tiene

	private static int[] candyCalculator(int numCupones) {
		
		
		
	int [] arrayCandy = new int[3];
	int caramelo=0, chicle=0, auxiliar=0, cuponesRestantes=0;
	
	//se hacen operaciones basicas para determinar cada resultado de cada variable y se igualan a cada posicion del array
	
	caramelo = numCupones / 10;
	auxiliar = numCupones % 10;
	chicle = auxiliar / 3;
	cuponesRestantes = auxiliar % 3;
	
	arrayCandy [0] = caramelo;
	arrayCandy [1] = chicle;
	arrayCandy [2] = cuponesRestantes;
	
	//devolvemos el array con los resultados
	
	return arrayCandy;
	
	
	
	
		
		
	}

}
