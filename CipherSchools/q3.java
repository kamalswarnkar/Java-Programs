import java.util.Scanner;

public class ShoppingCartDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total cart amount: ₹"import java.util.Scanner;

public class ShoppingCartDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total cart amount: ₹");
        double totalAmount = sc.nextDouble();

        double discount = (totalAmount > 5000) ? totalAmount * 0.20 :
                          (totalAmount >= 3000) ? totalAmount * 0.10 : 0;

        double finalAmount = totalAmount - discount;

        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);

        sc.close();
    }
}
);
        double totalAmount = sc.nextDouble();
        double discount = (totalAmount > 5000) ? totalAmount * 0.20 :
                          (totalAmount >= 3000) ? totalAmount * 0.10 : 0;

        double finalAmount = totalAmount - discount;

        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);

        sc.close();
    }
}

