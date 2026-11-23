/**
 * Vertegenwoordigt een supermarkt met een vast aanbod van producten.
 */
public class SuperMarket {
    // Beschikbare producten in de supermarkt
    Product bread;
    Product fruit;
    Product cheese;
    Product toiletPaper;

    /**
     * Maakt een SuperMarket aan en vervangt null-waardes door een "fake" product
     * zodat de applicatie later niet crasht op een NullPointerException.
     */
    public SuperMarket(Product bread, Product fruit, Product cheese, Product toiletPaper) {
        this.bread = (bread != null) ? bread : new Product("fake", 0, 0);
        this.fruit = (fruit != null) ? fruit : new Product("fake", 0, 0);
        this.cheese = (cheese != null) ? cheese : new Product("fake", 0, 0);
        this.toiletPaper = (toiletPaper != null) ? toiletPaper : new Product("fake", 0, 0);
    }

    // Hulpmethode die voor een specifiek product controleert of er genoeg voorraad is,
    // de voorraad verlaagt en de aankoop- of voorraadmelding print
    void buyItem(Product product, int amount) {
        if (amount <= product.amount) {
            product.amount -= amount;
            double totalPrice = product.price * amount;
            IO.println("You bought " + amount + " " + product.name + " for " + totalPrice + " euro");
        } else {
            IO.println("You cannot buy " + amount + " " + product.name + ", we only have " + product.amount + " " + product.name + " in stock.");
        }
    }

    // Specifieke koopmethodes per productcategorie
    void buyBread(int amount) {
        buyItem(this.bread, amount);
    }

    void buyFruit(int amount) {
        buyItem(this.fruit, amount);
    }

    void buyCheese(int amount) {
        buyItem(this.cheese, amount);
    }

    void buyToiletPaper(int amount) {
        buyItem(this.toiletPaper, amount);
    }
}