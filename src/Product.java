/**
 * Vertegenwoordigt een product dat in een supermarkt verkocht kan worden.
 */
public class Product {
    // Naam van het product (bijvoorbeeld "bread" of "cheese")
    String name;

    // Prijs per los stuk in euro's
    double price;

    // Beschikbare voorraad van dit product
    int amount;

    /**
     * Maakt een nieuw Product aan met een naam, stuksprijs en beginvoorraad.
     */
    public Product(String name, double price, int amount) {
        // Ken de meegegeven waardes toe aan de attributen van dit object (`this.` maakt onderscheid met de parameters)
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
}