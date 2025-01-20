package RestaurantMain;

import java.text.DecimalFormat;
import java.util.List;

public class Order {
    // atributes
    private String orderNumber;
    private String date;
    private List<Product> productList;
    private List<Product> productCart;
    private String clientName;
    private double discount;

    public Order() {
    }

    public Order(String orderNumber, String date, List<Product> productList, List<Product> productCart, String clientName, double discount) {
        this.orderNumber = orderNumber;
        this.date = date;
        this.productList = productList;
        this.productCart = productCart;
        this.clientName = clientName;
        this.discount = discount;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductCart() {
        return productCart;
    }

    public void setProductCart(List<Product> productCart) {
        this.productCart = productCart;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    // function to calculate the total amount to be paid
    public String totalCalculation(){
        double totalPrice = 0;

        // 2 decimals format
        DecimalFormat df = new DecimalFormat("0.00");

        for (Product list : productCart){
            totalPrice += list.getProductPrice();
        }
        double calcService = 0;
        calcService = totalPrice * 0.10;

        double calcIVA = 0;
        calcIVA = totalPrice * 0.13;

        double total = 0;
        total = totalPrice + calcService + calcIVA;

        double totalFinal = 0;

        if(discount != 0){
            totalFinal = (total - (total * discount));

            return
                "Order Number: " + orderNumber +
                "\nDate: " + date +
                "\nList of consumed products and their price: " + productCart +
                "\nAccount owner name: " + clientName +
                "\nDiscount type: " + df.format(discount) + "%"+
                "\nService tax is: $" + calcService +
                "\nTax to pay is: $" + calcIVA +
                "\nDiscount is: $" + (total * discount) +
                "\nFinal total is: $" + totalFinal + "\n\n";

        } else {

            System.out.println("\n");
            return
                "Order Number: " + orderNumber +
                "\nDate: " + date +
                "\nList of consumed products and their price: " + productCart +
                "\nAccount owner name: " + clientName +
                "\nService tax is: $" + calcService +
                "\nTax to pay is: $" + calcIVA +
                "\nFinal total is: $" + total + "\n\n"; // total is assigned directly without any discount
        }
    }

    @Override
    public String toString() {
        return "Order details:\n" +
            "Order Number: " + orderNumber +
            "\nDate: " + date +
            "\nList of created products: " + productList +
            "\nList of consumed products and their price: " + productCart +
            "\nAccount owner name: " + clientName +
            "\nDiscount type: " + discount + "%";
    }

}
