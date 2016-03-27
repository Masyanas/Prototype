package com.masyanas;

import com.masyanas.model.item.Item;
import com.masyanas.registry.item.ItemRegistry;

public class Main
{

    public static void main(String[] args)
    {
        ItemRegistry registry = new ItemRegistry();
        Item myBook = registry.createBasicItem("Book");
        myBook.setTitle("Custom Title");
    }

}
