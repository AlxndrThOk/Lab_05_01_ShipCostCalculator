public class Main {
    public static void main(String[] args)
    {
        double itemPrice = 0;
        double shippingCost = 0;
        double totalCost = 0;
        double SHIPPING_RATE = 0.02;
        double FREE_SHIPPING_CUTOFF = 100;
        itemPrice = 200;
        if (itemPrice < FREE_SHIPPING_CUTOFF)
        {
            shippingCost = itemPrice * SHIPPING_RATE;
        }
        totalCost = shippingCost + itemPrice;
        System.out.println("Your item cost was " + itemPrice);
        System.out.println("Your shipping cost is " + shippingCost);
        System.out.println("Your total cost is " + totalCost);
    }
}