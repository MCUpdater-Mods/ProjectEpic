package com.mcupdater.projectepic.api;

public interface IThermalNode {

	// Get the current temperature of the node
	int getCurrentTemperature();

	// Get the temperature above which things become irrelevant
	int getMaximumTemperature();

	// Apply change in temperature, returning new temperature value
	int applyTemperatureChange(int delta);
}
