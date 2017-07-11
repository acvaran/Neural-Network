package com.neat.genes;

import java.util.ArrayList;

public class GenePool {

	private static ArrayList<Gene> genePool;

	public GenePool() {
		genePool = new ArrayList<>();
	}

	// Searches the Gene Pool for a newly created gene.
	// If the gene exists returns -1 otherwise returns the historical marking of
	// that gene.
	public int doesGeneExist(Gene gene) {
		int index = genePool.indexOf(gene);
		if (index == -1)
			return -1;
		return genePool.get(index).getHistoricalMarking();
	}

	// Returns the latest innovated gene's historical marking.
	public int latestInnovationNumber() {
		return genePool.get(genePool.size() - 1).getHistoricalMarking();
	}

	// Adds a newly created gene to the Gene Pool
	public void addGene(Gene gene) {
		genePool.add(gene);
	}

	// Getters
	public ArrayList<Gene> getGenePool() {
		return genePool;
	}
}
