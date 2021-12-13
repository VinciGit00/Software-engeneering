package abstractionoccurrence;

//Le informazioni sul nome della serie e del produttore sono
//duplicate in tutte le istanze di tutti gli episodi
class EpisodeDup {
	String serieName;
	String producer;
	int number;
	String title;
	String storySinopsis;

	EpisodeDup(String serieName, String producer, int number, String title,
			String storySinopsis) {
		this.serieName = serieName;
		this.producer = producer;
		this.number = number;
		this.title = title;
		this.storySinopsis = storySinopsis;
	}

	String printEpisode() {
		return serieName + " di " + producer + "\n" + number + ") " + title
				+ "\nSinopsi: " + storySinopsis;
	}
}

public class DuplicateInformation {

	public static void main(String[] args) {
		EpisodeDup tp1 = new EpisodeDup("Twin Peaks", "David Lynch", 1,
				"Passaggio a Nord-Ovest", "sinopsi episodio 1 TP");
		EpisodeDup tp2 = new EpisodeDup("Twin Peaks", "David Lynch", 2,
				"Tracce verso il nulla", "sinopsi episodio 2 TP");
		EpisodeDup xf1 = new EpisodeDup("X-Files", "Chris Carter", 1,
				"Al di là del tempo e dello spazio", "sinopsi episodio 1 XF");
		EpisodeDup xf2 = new EpisodeDup("X-Files", "Chris Carter", 2, "Il prototipo",
				"sinopsi episodio 2 XF");
		System.out.println(tp1.printEpisode() + "\n");
		System.out.println(tp2.printEpisode() + "\n");
		System.out.println(xf1.printEpisode() + "\n");
		System.out.println(xf2.printEpisode() + "\n");
	}
}