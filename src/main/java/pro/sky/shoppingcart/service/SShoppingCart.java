package pro.sky.shoppingcart.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.shoppingcart.api.IShoppingCart;
import pro.sky.shoppingcart.exception.BadRequestException;

import java.util.*;

@Service
@SessionScope
public class SShoppingCart implements IShoppingCart {

    private int id;

    private final ArrayList<Integer> shoppingCartList;

    public SShoppingCart(ArrayList<Integer> shoppingCartList) {
        this.shoppingCartList = shoppingCartList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getShoppingCartList() {
        return shoppingCartList;
    }

    @Override
    public void add(ArrayList<Integer> id) {
        try{
            shoppingCartList.addAll(id);
        } catch (Exception e){
            throw new BadRequestException();
        }



    }

    @Override
    public ArrayList<Integer> getShoppingCart() {
        return shoppingCartList;
    }
}
