package serialisation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import model.Deck;

public class Serialisation {

	public static void writeDeck(String json) {
		try {
			FileWriter fw;
			File dir = new File("Deck");
			dir.mkdir();
			fw = new FileWriter(dir + "/deck.json");
			PrintWriter pw = new PrintWriter(fw);
			pw.println(json);
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Deck readDeck() {
		BufferedReader br = null;
		String deckJson = "";
		String line = "";
		try {
			FileReader fr = new FileReader("Deck/deck.json");
			br = new BufferedReader(fr);
			deckJson = br.readLine();
			while ((line = br.readLine()) != null) {
				deckJson += line;
			}
			return Deck.fromJson(deckJson);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
