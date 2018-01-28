package com.hakerrank.OOP.JavaMethodOverriding2;

public class Solution {
    class MotorCycle extends BiCycle {
        String temp = super.define_me();

        MotorCycle() {
            System.out.println("Hello I am a motorcycle, I am " + define_me());

        }

        String define_me() {
            return "a cycle with an engine.";
        }
        System.out.println("My ancestor is a cycle who is "+temp );
    }