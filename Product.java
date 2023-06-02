package projetos.controleEstoque;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

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
	 
	 static void limpaTela() {
			for (int i = 0; i < 3; i++) {
			System.out.println();	
			}
	 }
	
}
