package com.mcupdater.projectepic.api;

public interface IElectricNode {

	// Get the current electric charge of the node
	int getCurrentPower();

	// Get the maximum charge capacity of a node
	int getMaximumPower();

	// Apply change in electric charge, returning new value
	int applyPowerChange(int delta);
}
