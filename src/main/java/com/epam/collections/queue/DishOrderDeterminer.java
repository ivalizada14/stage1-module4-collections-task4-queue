package com.epam.collections.queue;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> dishes = new ArrayDeque<>();
        for(int i = 1; i<=numberOfDishes; i++)
            dishes.add(i);

        for(int i = everyDishNumberToEat; i<=numberOfDishes; i+= everyDishNumberToEat)
        {
            dishes.remove(i);
            list.add(i);
            if(i + everyDishNumberToEat > numberOfDishes)
                i = everyDishNumberToEat - (numberOfDishes - i);
        }
        return list;
    }
}
