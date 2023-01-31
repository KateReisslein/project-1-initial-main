package com.csc205.project1;

import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.sqrt;

public class Point {
private double x;
private double y;

    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }
    public  void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y = y;
    }

    public void setPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void shiftX(double n){
        this.x= x+n;
    }

    public void shiftY(double n){
        this.y= y+n;
    }

    public double distance(Point p2){
        double distance = sqrt(Math.pow((p2.getX() - x),2) +Math.pow(p2.getY() - y, 2));

        return distance;
    }

    public void rotate(double angle){
        double oldX = x;
        this.x = x*Math.cos(angle) - y*Math.sin(angle);
        this.y = oldX*Math.sin(angle) + y*Math.cos(angle);
    }

    public String toString() {
        return "Point{x="+getX() +", y=" +getY()+"}";
    }

}
