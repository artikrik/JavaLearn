package w8_Shopping;

public class Main {
    public static void main(String[] args) {

        Husband husband = new Husband();


        Wife wife = new Wife();
        wife.itemsNeedToBought("Sony", 100);
        wife.itemsNeedToBought("Bread", 110);
        wife.itemsNeedToBought("Baraban", 999);

        wife.getTotalListOfItemsFromHusband();
        wife.getTotalPriceOfFoundItems();

        TechnoStore technoStore = new TechnoStore();
        technoStore.listOfTechnoItems("Sony", 100);
        technoStore.listOfTechnoItems("Samsung", 80);
        technoStore.listOfTechnoItems("Sharp", 70);
        technoStore.listOfTechnoItems("Appl", 300);
        technoStore.listOfTechnoItems("Acer", 40);

        GroseryStore groseryStore = new GroseryStore();
        groseryStore.listOfGroseryItems("Bread", 110);
        groseryStore.listOfGroseryItems("Sausage", 33);
        groseryStore.listOfGroseryItems("Butter", 17);
        groseryStore.listOfGroseryItems("Milk", 55);
        groseryStore.listOfGroseryItems("Potato", 10.58);

    }
}