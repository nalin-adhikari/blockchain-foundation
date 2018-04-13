import java.util.Arrays;

/**
 * 
 */

/**
 * @author nalin
 *
 */
public class Block {

	private int previousHash;
	private String[] transactions;
	private int hash;

	public Block() {
		super();
	}

	public Block(int previousHash, String[] transactions) {
		super();
		this.previousHash = previousHash;
		this.transactions = transactions;

		Object[] hashingCandidate = { Arrays.hashCode(transactions), previousHash };
		this.hash = Arrays.hashCode(hashingCandidate);
	}

	public int getPreviousHash() {
		return previousHash;
	}

	public void setPreviousHash(int previousHash) {
		this.previousHash = previousHash;
	}

	public String[] getTransactions() {
		return transactions;
	}

	public void setTransactions(String[] transactions) {
		this.transactions = transactions;
	}

	public int getHash() {
		return hash;
	}

	public void setHash(int hash) {
		this.hash = hash;
	}

}
