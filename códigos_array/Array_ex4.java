
public class Array_ex4 {

	public static void main(String[] args) {
		
        Integer array1[][] = new Integer [50][100];
		
			for(int cont2 = array1.length-1; cont2 >= 0; cont2--)
				for(int cont = 0; cont < array1.length; cont++)  {
			    array1[cont][cont2] = cont + cont2;
			    System.out.println(array1[cont][cont2]);
		    }	
      }
}
