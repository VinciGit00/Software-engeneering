package proxy;

import java.util.*;

interface RandomList {
	public double displayAverage();
}

//classe di cui si vuole ritardare la creazione dell'istanza
//al momento in cui si vuole utilizzarla
class RealRandomList implements RandomList {
	List<Double> rndList;
	private double average;

	//le operazioni del costruttore possono essere onerose
	//crea una lista di n numeri random e ne calcola la media
	//infine ordina la lista
	public RealRandomList(int n) {
		rndList = new ArrayList<Double>();
		Random rnd = new Random();
		double temp;
		double avg = 0;
		for (int i = 0; i < n; i++) {
			temp = rnd.nextDouble();
			rndList.add(temp);
			avg = avg + temp;
		}
		average = avg / n;
		Collections.sort(rndList);//ordina la lista
	}

	public double displayAverage() {
		return average;
	}
}

//classe Proxy che crea l'istanza di RealRandomList
//quando e' necessario
class ProxyRandomList implements RandomList {
	private int numberElements;
	private RandomList rndList;

	public ProxyRandomList(int n) {
		numberElements = n;
	}

	public double displayAverage() {
		if (rndList == null) {
			rndList = new RealRandomList(numberElements);//si crea l'oggetto solo se serve
		}
		return rndList.displayAverage();
	}
}

public class ProxyExample {
	public static void main(String[] args) {
		RandomList rndList1 = new ProxyRandomList(3);
		RandomList rndList2 = new ProxyRandomList(5);
		RandomList rndList3 = new ProxyRandomList(10000000);

		System.out.println(rndList1.displayAverage());//esegue la creazione dell'oggetto
		System.out.println(rndList2.displayAverage());//esegue la creazione dell'oggetto
		System.out.println(rndList2.displayAverage());//l'oggetto e' gia' stato creato
		
		//il terzo oggetto non deve essere creato perche' non viene mai utilizzato
		//System.out.println(rndList3.displayAverage());//puo' causare out of memory
	}
}