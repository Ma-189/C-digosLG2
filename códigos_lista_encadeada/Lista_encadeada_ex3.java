import java.util.LinkedList;

public class Lista_encadeada_ex3 {

	public static void main (String[]args) {
				
        LinkedList<Integer> num = new LinkedList<Integer>();
		
		Integer soma = 0;
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		
		System.out.println("Lista:" +num);
		
		for (int cont = 0; cont < num.size(); cont++) {
			soma = soma + num.get(cont);
		}
		
		System.out.println("A soma dos componentes da lista é: " +soma);
	}
}





