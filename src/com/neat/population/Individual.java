package com.neat.population;

import java.util.ArrayList;

import com.Formulas.Formulas;
import com.neat.genes.Gene;
import com.neat.genes.GenePool;

import javafx.util.Pair;

public class Individual {

	private GenePool genePool;
	private DNA dna;

	public Individual(GenePool genePool) {
		this.genePool = genePool;
		this.dna = new DNA();
		for (int i = 0; i < genePool.getTotalNumberOfGenes(); i++)
			dna.addGene(genePool.specificGene(i));
	}

	public void nodeMutation() {

	}

	public void linkMutation() {

	}

	
	// Getters
	public GenePool getGenePool() {
		return genePool;
	}

	public DNA getDNA() {
		return dna;
	}

	class DNA {

		/*
		 * DNA of the individual. This class holds data on the genes that the
		 * individual have. This class also holds data on the Genes weights and
		 * statuses.
		 */
		private ArrayList<Gene> dna;
		private ArrayList<double[]> geneAspects;

		public DNA() {
			dna = new ArrayList<>(); // List of genes to be presented as the DNA
										// of an individual
			geneAspects = new ArrayList<>(); // Weight and the status of the
												// gene
		}

		// Adds a new gene to the DNA of the individual
		public void addGene(Gene gene) {
			dna.add(gene);
			double[] aspects = new double[2];
			aspects[0] = Formulas.randomWeight(); // weight of the link(gene)
			aspects[1] = 1; // If the gene is disabled or not
			geneAspects.add(aspects);
		}

		// Disables a gene at the DNA after node mutation
		public void disableGene(int index) {
			geneAspects.get(index)[1] = 0;
		}

		// Adjusts a gene at the DNA after link mutation
		public void adjustGeneWeight(int index, double weight) {
			geneAspects.get(index)[0] = weight;
		}

		// Getters
		public ArrayList<Gene> getDNA() {
			return dna;
		}

		public ArrayList<double[]> getGeneAspects() {
			return geneAspects;
		}
	}
}
