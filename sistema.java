package projetos.controleEstoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sistema {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Product> produtos = new ArrayList<>();
		
		String opcao = "";
		
		while (!opcao.equalsIgnoreCase("sair")) {
			System.out.println("------------------------------");
			System.out.println("----- CONTROLE DE ESTOQUE ----");
			System.out.println("------------ MENU ------------");
			System.out.println("1. Adicionar produto");
			System.out.println("2. Adicionar quantidade ao estoque");
			System.out.println("3. Retirar uma quantidade do estoque");
			System.out.println("4. Ver lista de produtos");
			System.out.println("Digite 'sair' para encerrar o programa");
			System.out.println("------------------------------");
			System.out.println("Digite uma opção: ");
			opcao = sc.nextLine();
			
			
			switch (opcao) {
				case "1":
					System.out.println("Entre os dados do produto: ");
					System.out.println("Nome: ");
					String name = sc.nextLine();
					
					System.out.println("Preço: ");
					double price = sc.nextDouble();
					sc.nextLine();
					Product novoProduto = new Product(name, price);
					
					System.out.println("Quantidade no estoque: ");
					int quantidade = sc.nextInt();
					sc.nextLine();
					novoProduto.addProducts(quantidade);
					
					produtos.add(novoProduto);
					System.out.println("Produto adicionado com sucesso!");
					Product.limpaTela();
					break;
					

				case "2": 
					System.out.println("Digite o nome do produto: ");
					String nomeProduto = sc.nextLine();
					boolean encontrado = false;
					
					for (Product produto : produtos) {
						if (produto.getName().equalsIgnoreCase(nomeProduto)) {
							System.out.println("Digite a quantidade a ser adicionada: ");
							quantidade = sc.nextInt();
							sc.nextLine();
							produto.addProducts(quantidade);
							System.out.println("Quantidade adicionada com sucesso.");
							encontrado = true;
							Product.limpaTela();
							break;						
						}
					}
					
					if (!encontrado) {
						System.out.println("Produto não encontrado.");
						Product.limpaTela();
					}
					break;
					
				case "3": 
					System.out.println("Digite o nome do produto: ");
					nomeProduto = sc.nextLine();
					encontrado = false;
					
					for (Product produto : produtos) {
						if (produto.getName().equalsIgnoreCase(nomeProduto)) {
							System.out.println("Digite a quantidade a ser retirada: ");
							quantidade = sc.nextInt();
							sc.nextLine();
							produto.removeProduct(quantidade);
							System.out.println("Quantidade retirada com sucesso.");
							encontrado = true;
							Product.limpaTela();
							break;
						}
					}
					
					if (!encontrado) {
						System.out.println("Produto não encontrado.");
						Product.limpaTela();
					}
					break;
					
				case "4": 
					
					System.out.println("Lista de produtos:");
					for (Product produto: produtos) {
						System.out.println(produto);
					}
					Product.limpaTela();
					break;
					
				case "Sair": 
					break;
					
				default: 
					System.out.println("Opção invalida. Por favor, escolha uma opção válida: ");
					Product.limpaTela();
					break;
					
			}
					
		}
		
			System.out.println("Sistema finalizado com sucesso.");
			
			sc.close();
		}		
			
	}
	

			