package com.neat.population;

import com.neat.genes.Gene;
import com.neat.genes.GenePool;

public class Population {

	private GenePool genePool;
	private int numberOfIndividuals;

	public Population(GenePool genePool, int numberOfIndividuals, int numberOfInputs, int numberOfOutputs) {
		this(genePool, numberOfIndividuals, numberOfInputs, numberOfOutputs, 0, 0);
	}

	public Population(GenePool genePool, int numberOfIndividuals, int numberOfInputs, int numberOfOutputs,
			int numberOfHiddenLayers) {
		this(genePool, numberOfIndividuals, numberOfInputs, numberOfOutputs, numberOfHiddenLayers, numberOfInputs * 2);
	}

	public Population(GenePool genePool, int numberOfIndividuals, int numberOfInputs, int numberOfOutputs,
			int numberOfHiddenLayers, int numberOfHiddenNodes) {
		Topology startTopology = new Topology(numberOfInputs, numberOfOutputs, numberOfHiddenLayers, numberOfHiddenNodes);
		this.genePool = startTopology.getGenePool();
		this.numberOfIndividuals = numberOfIndividuals;
	}

	// Getters
	public GenePool getGenePool() {
		return genePool;
	}

	public int getNumberOfIndividuals() {
		return numberOfIndividuals;
	}

	class Topology {

		/*
		 * Topology This class is called at the start of creating the
		 * population. This class creates the start topology of the neural
		 * network. It has 3 constructors: The first creates a network of only
		 * input and output nodes. The second gives the user the ability to
		 * create hidden layers with (numberOfInputnodes * 2) hidden nodes. The
		 * third lets the user to decide every aspect of the network, number of
		 * input, output and hidden nodes as well as the number of hidden
		 * layers.
		 */
		private int numberOfInputs, numberOfOutputs, numberOfHiddenLayers, numberOfHiddenNodes;
		private GenePool genePool;

		public Topology(int numberOfInputs, int numberOfOuputs, int numberOfHiddenLayers, int numberOfHiddenNodes) {
			this.numberOfInputs = numberOfInputs;
			this.numberOfOutputs = numberOfOuputs;
			this.numberOfHiddenLayers = numberOfHiddenLayers;
			this.numberOfHiddenNodes = numberOfHiddenNodes;
			genePool = new GenePool();
			int hM = 0;
			for (int i = 0; i < numberOfInputs; i++)
				for (int j = 0; j < numberOfOutputs; j++) {
					Gene gene = new Gene(i, j);
					hM++;
					gene.setHistoricalMarking(hM);
				}
		}

		// Getters
		public GenePool getGenePool() {
			return genePool;
		}

		public int getNumberOfInputNodes() {
			return numberOfInputs;
		}

		public int getNumberOfOutputNodes() {
			return numberOfOutputs;
		}

		public int getNumberOfHiddenLayers() {
			return numberOfHiddenLayers;
		}

		public int getNumberOfHiddenNodes() {
			return numberOfHiddenNodes;
		}
	}
}
