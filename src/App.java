
public class App {

	public static void main(String[] args) {
		Plant plant1 = new Plant();
		
		Tree tree1 = new Tree();
		
		Plant plant2 = tree1;
		
		tree1.grow();
		tree1.shedLeaves();
		
		System.out.println();
		
		plant2.grow();
		// Can't do next since tree does not have this method and overridden by Tree,
		// the method is specific to Trees
		// plant2.shedLeaves();
	}

}
