/**
 * 
 */

/**
 * @author nalin
 *
 */
public class Main {

	public static void main(String[] args) {
		
		String wallet1 = "555wdefioivrv8r9v8erwqpmciewmcrnvvire";
		String wallet2 = "8734cefberijger84t4vfdfvver8374fndvui";
		String wallet3 = "qpof4090122xcnbzxvce534klgotjgje7r3kj";
		String wallet4 = "po902enchdiccere35865112jkdeunce34iue";
		
		String [] transaction1 = {new Transaction(wallet1, wallet2, Action.SENT, 10).toString()};
		Block block1 = new Block(0, transaction1);
		
		String [] transaction2 = {new Transaction(wallet1, wallet3, Action.SENT, 15).toString()};
		Block block2 = new Block(block1.getHash(), transaction2);
		
		String [] transaction3 = {new Transaction(wallet3, wallet4, Action.SENT, 30).toString()};
		Block block3 = new Block(block2.getHash(), transaction3);
		
		print("block 1", block1);
		print("block 2", block2);
		print("block 3", block3);
		
		
	}
	
	private static void print(String blockName, Block block) {
		System.out.println(blockName + " : " +String.valueOf(block.getHash()));
	}
}
