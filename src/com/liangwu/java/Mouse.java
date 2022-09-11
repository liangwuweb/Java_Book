package com.liangwu.java;

public class Mouse {
    private int age = 0;
    private double weight = 1.0;
    private double percentGrowthRate;

    public static void main(String[] args) {
        new Mouse().display();
    }

    public void setPercentGrowthRate(double percentGrowthRate) {
        this.percentGrowthRate = percentGrowthRate;
    }

    public void grow() {
        this.weight += (0.01 * this.percentGrowthRate * this.weight );
        this.age++;
    }

    public void  display() {
        System.out.printf("Age = %d, weight = %.3f", this.age, this.weight);
    }
}


