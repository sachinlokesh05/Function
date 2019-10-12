package desktop;

public class Stock {
private  String stock_name;
private int number_of_stock;
private double stock_price;

public String getStock_name() {
	return stock_name;
}

public void setStock_name(String stock_name) {
	this.stock_name = stock_name;
}

public int getNumber_of_stock() {
	return number_of_stock;
}

public void setNumber_of_stock(int number_of_stock) {
	this.number_of_stock = number_of_stock;
}

public double getStock_price() {
	return stock_price;
}

public void setStock_price(double stock_price) {
	this.stock_price = stock_price;
}

@Override
public String toString() {
	return " [stock_name=" + stock_name + ", number_of_stock=" +
            number_of_stock + ", stock_price=Rs " + stock_price
			+ "/- , total stock_price=Rs "+ number_of_stock*stock_price +"/- ]";
}

public static void main(String[] args) {
	Stock s=new Stock();
	s.setStock_name("jio");
	s.setNumber_of_stock(50);
	s.setStock_price(520.60);
	System.out.println(s.toString());	

}

}
