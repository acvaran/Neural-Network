import java.util.ArrayList;

import com.neat.genes.Gene;

import javafx.util.Pair;

public class Test {

	public static void main(String[] args) {
		int hM = 0;
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 2; j++) {
				Gene tempGene = new Gene(i, j);
				hM++;
				tempGene.setHistoricalMarking(hM);
				System.out.println(tempGene);
				
			}

	}
}
