package com.company.w8.Shopping;

public interface IShop {


    public void addItem(Item item);

    public void printItemsOfShop();

    public  void getName();

   public  void removeItem(int indexOfItem);

   public boolean checkIfItemInStore(Item checkItemToBuy);

}
