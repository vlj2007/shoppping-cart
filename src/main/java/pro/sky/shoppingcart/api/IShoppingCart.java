package pro.sky.shoppingcart.api;

import java.util.ArrayList;

public interface IShoppingCart {
    void add(ArrayList<Integer> id);

    ArrayList<Integer> getShoppingCart();

}
