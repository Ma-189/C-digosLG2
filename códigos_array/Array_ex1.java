
public class Array_ex1 {

	public static void main(String[] args) {
		
		Integer array1[] = new Integer [9];
		
		        System.out.println("Array: \n");
		        
				for(int cont = 0; cont < array1.length; cont++){
					array1[cont] = cont;
					System.out.println(array1[cont]);
				}
				
				System.out.println("\nArray * 3: \n");
				
				for(int cont = 0; cont < array1.length; cont++){
					array1[cont] = array1[cont] * 3;
					System.out.println(array1[cont]);
				}
				
	}
}
				


