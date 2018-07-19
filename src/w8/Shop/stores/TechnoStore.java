package w8.Shop.stores;



import w8.Shop.item.ItemGood;

public class TechnoStore extends Store {

    public TechnoStore(){
         items.add(new ItemGood("Sony", 100));
         items.add(new ItemGood("Samsung", 80));
         items.add(new ItemGood("Sharp ", 70));
         items.add(new ItemGood("Apple ", 300));


    }

    @Override
    protected void addItem(String name, double price) {
        items.add(new ItemGood(name, price));
    }
}

