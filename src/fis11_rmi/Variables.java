/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fis11_rmi;

/**
 *
 * @author squoz
 */
import java.io.Serializable;

public class Variables implements Serializable {

    private static final long serialVersionUID = 1L;

    private final double a, b, x;
    private double y;

    public Variables(double a, double b, double x) {
        this.a = a;
        this.b = b;
        this.x = x;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("a = %s\nb = %s\nx = %s\nОтвет: y = %.3f", a, b, x, y);
    }
}