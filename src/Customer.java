/**
 * Vertegenwoordigt een klant die naar een supermarkt kan gaan en daar producten kan kopen.
 */
public class Customer {
    // Naam van de klant en de supermarkt waar de klant op dat moment is
    String name;
    SuperMarket superMarket;

    // Maakt een nieuwe klant aan met een naam
    public Customer(String name) {
        this.name = name;
    }

    // Koppelt de gekozen supermarkt aan deze klant
    void goToSuperMarket(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }

    // Zoekt het gewenste product op naam (hoofdletterongevoelig) en roept de bijbehorende koopmethode aan
    void buyItem(String productName, int amount) {
        if (productName == null) {
            IO.println("Product not found: null");
            return;
        }

        if (productName.equalsIgnoreCase("bread")) {
            superMarket.buyBread(amount);
        } else if (productName.equalsIgnoreCase("fruit")) {
            superMarket.buyFruit(amount);
        } else if (productName.equalsIgnoreCase("cheese")) {
            superMarket.buyCheese(amount);
        } else if (productName.equalsIgnoreCase("toilet paper") || productName.equalsIgnoreCase("toiletpaper")) {
            superMarket.buyToiletPaper(amount);
        } else {
            IO.println("Product not found: " + productName);
        }
    }
}