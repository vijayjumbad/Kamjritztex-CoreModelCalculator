package com.example.corecalc.service;

import com.example.corecalc.model.CalculationResult;
import com.example.corecalc.model.CoreModelParameters;

public class CoreModelService {
	public CalculationResult calculate(String coreModel) {
        CoreModelParameters params = parseCoreModel(coreModel);

        double coreFactors = calculateCoreFactors(params);
        double effectiveVolume = calculateEffectiveVolume(params);
        double effectiveLength = calculateEffectiveLength(params);
        double effectiveArea = calculateEffectiveArea(params);
        double minimumArea = calculateMinimumArea(params);

        return new CalculationResult(coreFactors, effectiveVolume, effectiveLength, effectiveArea, minimumArea);
    }

    private CoreModelParameters parseCoreModel(String coreModel) {
        String[] parts = coreModel.split("/");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid core model format. Expected format: part1/part2/part3\"");
        }

        double width = Double.parseDouble(parts[0].replaceAll("[^0-9]", ""));
        double height = Double.parseDouble(parts[1]);
        double depth = Double.parseDouble(parts[2]);

        return new CoreModelParameters(width, height, depth);
    }

    private double calculateCoreFactors(CoreModelParameters params) {
        return (params.getWidth() + params.getHeight() + params.getDepth()) / 3.0;
    }

    private double calculateEffectiveVolume(CoreModelParameters params) {
        return params.getWidth() * params.getHeight() * params.getDepth();
    }

    private double calculateEffectiveLength(CoreModelParameters params) {
        return 2 * (params.getWidth() + params.getHeight());
    }

    private double calculateEffectiveArea(CoreModelParameters params) {
        return params.getWidth() * params.getHeight();
    }

    private double calculateMinimumArea(CoreModelParameters params) {
        return Math.min(params.getWidth() * params.getHeight(), params.getHeight() * params.getDepth());
    }

}
