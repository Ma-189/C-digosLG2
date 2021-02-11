import java.util.LinkedList;

public class Lista_encadeada_ex4 {

	public static void main(String[] args) {
		
		LinkedList<Integer> num = new LinkedList<Integer>();
		
		num.add(23);
		num.add(2);
		num.add(68);
		num.add(4);
				
		System.out.println("Lista:" +num);
				
		Integer maior = 0;
		
		for (int cont = 0; cont < num.size(); cont++) 
		
		if( maior < num.get(cont)) 
			maior = num.get(cont);
			
			System.out.println("O maior nodo da lista é: " +maior);
		}
	 }
   

	
		
		