package com.example.corecalc.model;

public class CoreModelParameters {

	 private final double width;
	    private final double height;
	    private final double depth;

	    public CoreModelParameters(double width, double height, double depth) {
	        this.width = width;
	        this.height = height;
	        this.depth = depth;
	    }

	    public double getWidth() {
	        return width;
	    }

	    public double getHeight() {
	        return height;
	    }

	    public double getDepth() {
	        return depth;
	    }
}
