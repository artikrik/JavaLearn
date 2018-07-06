package w8_Shopping;

public class Main {
    public static void main(String[] args) {

        TechnoStore technoStore = new TechnoStore();
        technoStore.listOfTechnoItems("Sony", 100);
        technoStore.listOfTechnoItems("Samsung", 80);
        technoStore.listOfTechnoItems("Sharp", 70);
        technoStore.listOfTechnoItems("Appl", 300);
        technoStore.listOfTechnoItems("Acer", 40);

        GroceryStore groceryStore = new GroceryStore();
        groceryStore.listOfGroceryItems("Bread", 110);
        groceryStore.listOfGroceryItems("Sausage", 33);
        groceryStore.listOfGroceryItems("Butter", 17);
        groceryStore.listOfGroceryItems("Milk", 55);
        groceryStore.listOfGroceryItems("Potato", 10.58);

        Husband husband = new Husband();
        husband.rememberItemsFromStore(groceryStore);
        husband.rememberItemsFromStore(technoStore);

        Wife wife = new Wife(husband);
        wife.needsToBuy("Sony");
        wife.needsToBuy("Bread");
        wife.needsToBuy("Baraban");
        wife.needsToBuy("Arbus");
        wife.needsToBuy("Milk");

        wife.showTotalListOfItemsFromHusband();
        wife.showListOfBoughtItems();
        wife.showTotalPriceOfBoughtItems();
    }
}