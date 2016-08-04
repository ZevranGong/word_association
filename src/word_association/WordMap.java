/**
 * 
 */
package word_association;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Implements the basic framework
 * 
 * @author Zevran
 */
public class WordMap {
	private List<String> wordList = new ArrayList<String>();
	private HashMap<String, Word> wordMap = 
			new HashMap<String, Word>();
	private ArrayList<String> frontier;
	
	/**
	 * Constructor for FriendshipGraph
	 */
	public WordMap() {
		this.setFrontier(new ArrayList<String>());
	}
	
	
	/**
	 * Add a node into the wordMap
	 * @param data Content on the node
	 * @param neighbors Neighbor of the node
	 */
	public void addVertex(String data, ArrayList<String> neighbors) {
		if (wordList.contains(data)) {
			System.out.println("Duplicated node added");
			return;
		}
		for (String s: neighbors) {
			if (!wordList.contains(s)) {
				System.out.println("Preset neighbor " + s + " does not exist.");
				return;
			}
		}
		wordList.add(data);
		Word w = new Word(data, neighbors);
		wordMap.put(data, w);
		return;
	}

	public ArrayList<String> getFrontier() {
		return frontier;
	}

	public void setFrontier(ArrayList<String> frontier) {
		this.frontier = frontier;
	}

}

