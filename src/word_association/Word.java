package word_association;

import java.util.ArrayList;
import java.util.Arrays;

public class Word implements Block {
	private boolean hidden;
	private String data;
	private ArrayList<String> neighbor;
	
	/**
	 * Constructor
	 * @param name
	 */
	public Word(String name, ArrayList<String> neighbor) {
		this.data = name;
		this.neighbor = neighbor;
	}

	/* (non-Javadoc)
	 * @see word_association.Block#getData()
	 */
	public String getData() {
		return data;
	}
	
	/**
	 * Reveal the data on the block
	 */
	public void reveal() {
		this.hidden = true;
		return;
	}
	
	@Override
	public String toString() {
		String s = this.getData();
		if (this.hidden) {
			char[] chars = new char[s.length()];
			Arrays.fill(chars, '_');
			String hidden_word = new String(chars);
			return hidden_word;
		}
		return getData();
	}

	/* (non-Javadoc)
	 * @see word_association.Block#getNeighbor()
	 */
	public ArrayList<String> getNeighbor() {
		return neighbor;
	}

	/* (non-Javadoc)
	 * @see word_association.Block#setNeighbor(java.util.ArrayList)
	 */
	public void setNeighbor(ArrayList<String> neighbor) {
		this.neighbor = neighbor;
	}
	

}
