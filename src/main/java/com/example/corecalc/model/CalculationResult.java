package com.example.corecalc.model;

public class CalculationResult {
	 private double coreFactors;
	    private double effectiveVolume;
	    private double effectiveLength;
	    private double effectiveArea;
	    private double minimumArea;

	    public CalculationResult(double coreFactors, double effectiveVolume, double effectiveLength, double effectiveArea, double minimumArea) {
	        this.coreFactors = coreFactors;
	        this.effectiveVolume = effectiveVolume;
	        this.effectiveLength = effectiveLength;
	        this.effectiveArea = effectiveArea;
	        this.minimumArea = minimumArea;
	    }

	    public double getCoreFactors() {
	        return coreFactors;
	    }

	    public double getEffectiveVolume() {
	        return effectiveVolume;
	    }

	    public double getEffectiveLength() {
	        return effectiveLength;
	    }

	    public double getEffectiveArea() {
	        return effectiveArea;
	    }

	    public double getMinimumArea() {
	        return minimumArea;
	    }

}
