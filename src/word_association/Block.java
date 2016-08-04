package word_association;

import java.util.ArrayList;

/**
 * Defines the interface for word block
 * 
 * @author Zevran
 * 
 */
public interface Block {

	/**
	 * Getter
	 * @return data that resides on the block
	 */
	String getData();
	
	/**
	 * Getter
	 * @return neighbor blocks
	 */
	ArrayList<String> getNeighbor();
	
	/**
	 * Setter
	 */
	void setNeighbor(ArrayList<String> neightbor);
}
