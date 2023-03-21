package entities;

public class Product {
		public String name;
		public double price;
		public int stock;
		
		public double total() {
			return price * stock;
		}
		
		public void addProduto(int stock) {
			this.stock += stock;
		}
		
		public void removeProduto(int stock) {
			this.stock -=stock;
		}
		
		public String toString() {
			return name + ", $ " + String.format("%.2f", price) + ", " + stock + " units," + " Total: $ " + String.format("%.2f", total());
		}
}
