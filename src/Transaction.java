/**
 * 
 */

/**
 * @author nalin
 *
 */
public class Transaction {

	private String senderWallet;
	private String receiverWallet;
	private Action action;
	private int amount;

	public Transaction() {
		super();
	}

	public Transaction(String senderWallet, String receiverWallet, Action action, int amount) {
		super();
		this.senderWallet = senderWallet;
		this.receiverWallet = receiverWallet;
		this.action = action;
		this.amount = amount;
	}

	public String getSenderWallet() {
		return senderWallet;
	}

	public void setSenderWallet(String senderWallet) {
		this.senderWallet = senderWallet;
	}

	public String getReceiverWallet() {
		return receiverWallet;
	}

	public void setReceiverWallet(String receiverWallet) {
		this.receiverWallet = receiverWallet;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
