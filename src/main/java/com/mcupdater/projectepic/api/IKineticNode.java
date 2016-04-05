package com.mcupdater.projectepic.api;

public interface IKineticNode {

	// Get the current kinetic momentum of the node
	int getCurrentMomentum();

	// Apply change in momentum, returning new momentum value
	int applyMomentumChange(int delta);
}
