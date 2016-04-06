package com.mcupdater.projectepic.api;

public interface IKineticNode {

	// Get the current kinetic momentum of the node
	int getCurrentMomentum();

	// Get the maximum safe kinetic momentum of the node
	int getMaximumMomentum();

	// Apply change in momentum, returning new momentum value
	int applyMomentumChange(int delta);
}
