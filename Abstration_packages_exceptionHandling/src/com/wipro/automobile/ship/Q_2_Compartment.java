package com.wipro.automobile.ship;

public class Q_2_Compartment {
	private double height;
    private double width;
    private double breadth;

    public Q_2_Compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getVolume() {
        return height * width * breadth;
    }
    public void displayDimensions() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Breadth: " + breadth);
        System.out.println("Volume: " + getVolume());
    }
    public static void main(String[] args) {
    	Q_2_Compartment compartment = new Q_2_Compartment(10.0, 8.0, 6.0);
        compartment.displayDimensions();
    }
}
