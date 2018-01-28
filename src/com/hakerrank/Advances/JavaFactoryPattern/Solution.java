package com.hakerrank.Advances.JavaFactoryPattern;

public class Solution {
    class FoodFactory {
        public Food getFood(String order) {
            if (order.equals("pizza")) {
                return new Pizza();
            } else {
                return new Cake();
            }
        }
    }
}
