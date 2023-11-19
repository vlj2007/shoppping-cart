package pro.sky.shoppingcart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shoppingcart.api.IShoppingCart;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/order")
public class CShoppingCart {

    private final IShoppingCart service;

    public CShoppingCart(IShoppingCart service) {
        this.service = service;
    }

    @GetMapping(path = "/add")
    public void addSBuy(@RequestParam("id") ArrayList<Integer> id) {
        service.add((ArrayList<Integer>) id);
    }

    @GetMapping(path = "/get")
    public List<Integer> getShoppingCart() {
        return service.getShoppingCart();
    }


}
