package projetos.controleEstoque;

import java.util.Scanner;

public class sistema {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product p1 = new Product(); 
		System.out.println("Entre os dados do produto:");
		System.out.println("Nome: ");
		p1.name = sc.nextLine();
		
		System.out.println("Preço:");
		p1.price = sc.nextDouble();
		
		System.out.println("Quantidade no estoque:");
		p1.quantity = sc.nextInt();
				
		System.out.println(p1);
		
		String saida = "";
		
		while (!saida.equalsIgnoreCase("sim")) {
			
		System.out.println("Digite o número de produtos a ser adicionado no estoque: ");
		p1.addProducts(sc.nextInt());
		
		System.out.println(p1);
						
		System.out.println("Entre o número de produtos a ser removido do estoque: ");
		p1.removeProduct(sc.nextInt());
		
		System.out.println(p1); 
		
		System.out.println("Deseja sair (Sim / Não): ");
		saida = sc.next();
		}
		
		System.out.println("Sistema finalizado com sucesso!");
				
		sc.close();

	}

}
			