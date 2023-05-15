package projetos.controleEstoque;

public class Product {
	
	String name;
	double price;
	int quantity;
	
	double totalValueInStock() {
		double total = price * quantity;
		return total;
	}

	void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	 public String toString() {
		 return "Dados do produto: "
				 + name
				 +" | R$" 
				 + String.format("%.2f", price)
				 + " | "
				 + quantity
				 + " unidades | Total: "
				 + String.format("R$%.2f\n", totalValueInStock())
				 + "-----";
	}
	
}
