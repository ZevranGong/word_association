package wordAssociation.core.components;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines the interface for word block
 * 
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
	List<String> getNeighbor();
	
	/**
	 * Setter
	 */
	void setNeighbor(ArrayList<String> neightbor);
}
