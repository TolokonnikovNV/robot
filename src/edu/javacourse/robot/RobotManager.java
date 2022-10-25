package edu.javacourse.robot;

public class RobotManager {
    public static void main(String[] args) {
        Robot robot = new RobotTotal(0, 0);

        robot.forward(20);
        robot.setCourse(90);
        robot.forward(20);
        robot.setCourse(90);
        robot.forward(50);
        // Напечатать координаты
        robot.printCoordinates();


    }


}