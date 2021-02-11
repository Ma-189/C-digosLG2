
public class Array_ex2 {

	public static void main(String[] args) {
		
		Integer array1[] = new Integer [10];
		
		System.out.println("Ordem inversa: \n");
		
		for(int cont = array1.length-1; cont >= 0; cont--){
			array1[cont] = cont;
			System.out.println(array1[cont]);
		}

	}

}
