package com.neat.population;

import com.neat.genes.GenePool;

public class Population {

	private GenePool genePool;
	private int numberOfIndividuals;

	public Population(GenePool genePool, int numberOfIndividuals) {
		this.genePool = genePool;
		this.numberOfIndividuals = numberOfIndividuals;
	}

	// Getters
	public GenePool getGenePool() {
		return genePool;
	}

	public int getNumberOfIndividuals() {
		return numberOfIndividuals;
	}
}
