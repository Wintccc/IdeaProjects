package com.atguigu.d.objective.obj13;

/**
 * @author Wint
 * @create 2022-06-22 10:59
 */
public abstract class GeometricObject {//几何图形
    protected String color;
    protected double weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public GeometricObject(String color, double weight) {
        super();
        this.color = color;
        this.weight = weight;
    }

    public abstract double findArea();
}
