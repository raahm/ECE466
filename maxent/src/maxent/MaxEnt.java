package maxent;

import java.util.*;

public class MaxEnt {
	private
		List<String> postokens;
		List<String> negtokens;
	
	public MaxEnt() {
		postokens = TrainingData.trainPos();
		negtokens = TrainingData.trainNeg();
	}
	
	public List<String> getPosTokens() {
		return postokens;
	}
	
	public List<String> getNegTokens() {
		return negtokens;
	}
	
	public static void main(String [] args) {
		MaxEnt max = new MaxEnt();
		
		
		
		
	}
}