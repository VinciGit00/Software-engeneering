package generalhierarchy;

import java.util.ArrayList;
import java.util.List;

abstract class Node {
	int a;//attributo comune a tutte le sottoclassi
	SuperiorNode superior;//superiore del nodo

	Node(int x, SuperiorNode superior) {
		a = x;
		this.superior = superior;//memorizza il superiore del nodo corrente
		if(superior != null)
			superior.subordinates.add(this);//aggiunge il nodo corrente alla lista dei subordinati del superiore
	}
}

//puo' avere subordinati
class SuperiorNode extends Node {
	List<Node> subordinates;//lista dei subordinati
	int b;//attributo di SuperiorNode

	SuperiorNode(int x, int y, SuperiorNode superior) {
		super(x, superior);
		b = y;
		subordinates = new ArrayList<Node>();
	}
}

//non puo' avere subordinati
class NonSuperiorNode extends Node {
	int c;//attributo di NonSuperiorNode
	
	NonSuperiorNode(int x, int y, SuperiorNode superior) {
		super(x, superior);
		c = y;
	}
}

public class GeneralHierarchyPattern {

	public static void main(String[] args) {
		SuperiorNode sn1 = new SuperiorNode(4, 5, null);//non ha superiori
		SuperiorNode sn2 = new SuperiorNode(1, 8, null);//non ha superiori
		SuperiorNode sn3 = new SuperiorNode(9, 2, sn2);//il suo superiore e' sn2
		NonSuperiorNode nsn1 = new NonSuperiorNode(2, 3, sn1);//il suo superiore e' sn1
		NonSuperiorNode nsn2 = new NonSuperiorNode(3, 4, sn3);//il suo superiore e' sn3
		NonSuperiorNode nsn3 = new NonSuperiorNode(6, 3, sn1);//il suo superiore e' sn3
		
		//notare che l'istruzione qui sotto non e' permessa
		//NonSuperiorNode nsn3 = new NonSuperiorNode(6, 3, nsn1);
	}
}