/**
 * Startpunt van de applicatie waarin producten, supermarkt en klant samenkomen.
 */
public class Main {
    public static void main(String[] args) {
        // Maak de producten aan met naam, stuksprijs en beginvoorraad
        Product bread = new Product("bread", 2.50, 10);
        Product fruit = new Product("fruit", 3.25, 15);
        Product cheese = new Product("cheese", 5.00, 8);
        Product toiletPaper = new Product("toilet paper", 4.50, 20);

        // Maak de supermarkt met de producten en een klant aan
        SuperMarket superMarket = new SuperMarket(bread, fruit, cheese, toiletPaper);
        Customer customer = new Customer("Jim");

        // Vraag de gebruiker welk product en welk aantal gekocht moet worden
        String productName = IO.readln("Which product do you want to buy?");
        int amount = Integer.parseInt(IO.readln("How many do you want to buy?"));

        // Laat de klant naar de supermarkt gaan en het gekozen item kopen
        customer.goToSuperMarket(superMarket);
        customer.buyItem(productName, amount);
    }
}