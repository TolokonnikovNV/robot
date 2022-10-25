package edu.javacourse.robot;

import jdk.incubator.vector.VectorOperators;

public class Robot {
    private double x = 0;
    private double y = 0;
    protected double course = 0; //курс в градусах
    private Operator operator;

    public Operator getOperator(){
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void printCoordinates() {
        System.out.println(x + ", " + y);
    }

    void forward(int distance) {
        x = x + distance * Math.cos(course / 180 * Math.PI);
        y = y + distance * Math.sin(course / 180 * Math.PI);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course; //Присваиваем СВОЙСТВУ ОБЪЕКТА - ЛОКАЛЬНУЮ ПЕРЕМЕННУЮ
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

}
