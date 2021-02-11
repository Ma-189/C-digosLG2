
public class Array_ex3 {

	public static void main(String[] args) {
	
		Integer array1[][] = new Integer [100][100];
		
		for(int cont = 0; cont < array1.length; cont++)
			for(int cont2 = 0; cont2 < array1.length; cont2++) {
			array1[cont][cont2] = cont - cont2;
			System.out.println(array1[cont][cont2]);
		}
		
		System.out.println("\nElementos * 7: \n");
		
		for(int cont = 0; cont < array1.length; cont++)
			for(int cont2 = 0; cont2 < array1.length; cont2++) {
			array1[cont][cont2] = array1[cont][cont2] * 7;
			System.out.println(array1[cont][cont2]);
		}
		
	
	}

}
