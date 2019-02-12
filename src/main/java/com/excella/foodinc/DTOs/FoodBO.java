package com.excella.foodinc.DTOs;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class FoodBO {

    //List<FoodTO> food;
    HashMap<String, FoodTO> food;

    public FoodBO() {
        //food = new ArrayList<FoodTO>();
        food = new HashMap<>();
        FoodTO apple = new FoodTO("apple", 95, 0, 0, 25);
        FoodTO banana = new FoodTO("banana", 110, 0, 1, 30);
        FoodTO potatoChips = new FoodTO("potato chips", 160, 10, 2, 15);
        food.put("apple", apple);
        food.put("banana", banana);
        food.put("potatoChips", potatoChips);
    }

    public void deleteFood(String name) {
        food.remove(name);
    }

    public HashMap<String, FoodTO> getAllFood() {
        return food;
    }

    public FoodTO getFood(String name) {
        return food.get(name);
    }

    public boolean updateFood(String name, FoodTO newFood) {
        FoodTO oldFood = food.get(name);
        return food.replace(name, oldFood, newFood);
    }


//    public FoodBO() {
//        food = new ArrayList<FoodTO>();
//        FoodTO apple = new FoodTO("apple", 1, 95, 0, 0, 25);
//        FoodTO banana = new FoodTO("banana", 2, 110, 0, 1, 30);
//        FoodTO potatoChips = new FoodTO("potato chips", 3, 160, 10, 2, 15);
//        food.add(apple);
//        food.add(banana);
//        food.add(potatoChips);
//    }
//
//    public void deleteFood(FoodTO foodItem) {
//        food.remove(foodItem.getId());
//    }
//
//    public List<FoodTO> getAllFood() {
//        return food;
//    }
//
//    public FoodTO getFood(String name) {
//        System.out.println("Made it");
//        System.out.println(food.indexOf(name));
//        System.out.println("HERE");
//        return food.get(food.indexOf(name));
//    }
//
//    public void updateFood(FoodTO foodItem) {
//        food.get(food.indexOf(foodItem.getName())).setCalories(foodItem.getCalories());
//    }

}