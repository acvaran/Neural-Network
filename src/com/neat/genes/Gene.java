package com.neat.genes;

import javafx.util.Pair;

public class Gene extends Pair<Integer, Integer> {

	private int inputNode, outputNode, historicalMarking;

	public Gene(Integer inputNode, Integer outputNode) {
		super(inputNode, outputNode);
		// TODO Auto-generated constructor stub
		this.inputNode = inputNode;
		this.outputNode = outputNode;
	}
	
	// To String
	public String toString(){
		String str = super.toString();
		return str + " " + historicalMarking;
	}

	// Setters
	public void setHistoricalMarking(int historicalMarking) {
		this.historicalMarking = historicalMarking;
	}

	// Getters
	public int getInputNode() {
		return inputNode;
	}

	public int getOutputNode() {
		return outputNode;
	}

	public int getHistoricalMarking() {
		return historicalMarking;
	}

}
