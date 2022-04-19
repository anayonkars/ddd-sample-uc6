package com.ddd_bootcamp.application;

import com.ddd_bootcamp.domain.Cart;
import com.ddd_bootcamp.domain.Item;
import com.ddd_bootcamp.domain.Product;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        //codeProblem1to5();

        //Code Problem 6
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        Product headphone1 = new Product("Sony Wireless headphone");
        Item headphoneItem1 = new Item(headphone1,1);

        Product headphone2 = new Product("Sony Wireless headphone");
        Item headphoneItem2= new Item(headphone2,1);

        cart1.add(headphoneItem1);
        cart2.add(headphoneItem2);

        System.out.println("----------------------------------------");
        System.out.print("cart1.equals(cart2) :");
        System.out.println(cart1.equals(cart2)? "true=Carts are same " : "false=Carts are different");
        System.out.println("----------------------------------------");
        System.out.print("cart1.hasSameIdentityAs(cart2) :");
        System.out.println(cart1.hasSameIdentityAs(cart2)? "true=Carts are same"  : "false=Carts are different");
        System.out.println("----------------------------------------");

    }

    private static void codeProblem1to5() {
        Cart cart = new Cart();

        Product headphone = new Product("Sony Wireless headphone");
        Item headphoneItem = new Item(headphone,1);
        cart.add(headphoneItem);

        Product applePencil = new Product("Apple Pencil");
        Item applePencilItem = new Item(applePencil, 2);
        cart.add(applePencilItem);


        System.out.println("Cart = " + cart);
        List<Item> items = cart.getItems();
        System.out.println("items = " + items);

        Product applePencil1 = new Product("Apple Pencil");
        Item applePencilItem1 = new Item(applePencil1, 2);

        cart.remove(applePencilItem1);

        System.out.println("----------------------------------------");
        System.out.println("After Removing Apple Pencil with 2 quantity");
        System.out.println("Cart = " + cart);
        List<Item> items1 = cart.getItems();
        System.out.println("items = " + items1);

        System.out.println("----------------------------------------");
        System.out.println("Removed product names = " + cart.removedProductNames());
    }
}
