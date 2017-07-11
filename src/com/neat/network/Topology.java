package com.neat.network;

public class Topology {

	private int numberOfInputs, numberOfOutputs, numberOfHiddenLayers, numberOfHiddenNodes;

	public Topology(int numberOfInputs, int numberOfOutputs) {
		this.numberOfInputs = numberOfInputs;
		this.numberOfOutputs = numberOfOutputs;
		this.numberOfHiddenLayers = 0;
		this.numberOfHiddenNodes = 0;
	}

	public Topology(int numberOfInputs, int numberOfOutputs, int numberOfHiddenLayers) {
		this.numberOfInputs = numberOfInputs;
		this.numberOfOutputs = numberOfOutputs;
		this.numberOfHiddenLayers = numberOfHiddenLayers;
		this.numberOfHiddenNodes = numberOfInputs * 2;
	}

	public Topology(int numberOfInputs, int numberOfOuputs, int numberOfHiddenLayers, int numberOfHiddenNodes) {
		this.numberOfInputs = numberOfInputs;
		this.numberOfOutputs = numberOfOuputs;
		this.numberOfHiddenLayers = numberOfHiddenLayers;
		this.numberOfHiddenNodes = numberOfHiddenNodes;
	}
}
