package abstractionoccurrence;

import java.util.ArrayList;
import java.util.List;

//Le informazioni sulla serie non sono duplicate
class Serie {
	String serieName;
	String producer;
	List<Episode> episodes;// episodi della serie

	Serie(String serieName, String producer) {
		this.serieName = serieName;
		this.producer = producer;
		episodes = new ArrayList<Episode>();
	}

	String printSerie() {
		return serieName + " di " + producer;
	}
}

class Episode {
	int number;
	String title;
	String storySinopsis;
	Serie serie;// serie a cui appartengono gli episodi

	Episode(int number, String title, String storySinopsis, Serie serie) {
		this.number = number;
		this.title = title;
		this.storySinopsis = storySinopsis;
		this.serie = serie;
		serie.episodes.add(this);// aggiunta dell'episodio corrente agli episodi della serie
	}

	String printEpisode() {
		return number + ") " + title + "\nSinopsi: " + storySinopsis;
	}
}

public class AbstractionOccurencePattern {

	public static void main(String[] args) {
		Serie tp = new Serie("Twin Peaks", "David Lynch");
		Serie xf = new Serie("X-Files", "Chris Carter");
		Episode tpe1 = new Episode(1, "Passaggio a Nord-Ovest",
				"sinopsi episodio 1 TP", tp);
		Episode tpe2 = new Episode(2, "Tracce verso il nulla",
				"sinopsi episodio 2 TP", tp);
		Episode xfe1 = new Episode(1, "Al di là del tempo e dello spazio",
				"sinopsi episodio 1 XF", xf);
		Episode xfe2 = new Episode(2, "Il prototipo", "sinopsi episodio 2 XF",
				xf);
		System.out.println(tp.printSerie() + "\n");
		for(Episode e: tp.episodes)
			System.out.println(e.printEpisode() + "\n");
		System.out.println("\n" + xf.printSerie() + "\n");
		for(Episode e: xf.episodes)
			System.out.println(e.printEpisode() + "\n");
	}

}
