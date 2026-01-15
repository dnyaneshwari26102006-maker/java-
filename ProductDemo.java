// WAP to create a class product with data member pid,name,quantity,price,total accept 
// a details of product from user calculate total of each product and final total accept 
// num of product from user and create that number of oobject.
import java.util.Scanner;

class Product {
    int id;
    String name;
    int quantity;
    double price;
    double total;

    
    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        id = sc.nextInt();

        System.out.print("Enter Product Name: ");
        name = sc.next();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    
    void calculateTotal() {
        total = quantity * price;
    }

    
    void display() {
        System.out.println(id + "\t" + name + "\t" + quantity + "\t" + price + "\t" + total);
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        Product[] p = new Product[n];
        double finalTotal = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of product " + (i + 1));
            p[i] = new Product();
            p[i].accept();
            p[i].calculateTotal();
            finalTotal = finalTotal + p[i].total;
        }

        System.out.println("\nID\tName\tQty\tPrice\tTotal");
        for (int i = 0; i < n; i++) {
            p[i].display();
        }

        System.out.println("\nFinal Total of all products = " + finalTotal);
    }
}
