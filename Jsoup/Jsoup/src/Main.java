

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class Main {

	/**
	 * Pegar dados e botar em for para gerar uma lista formatado(insert).
	 *
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		for(int num =1; num <= 9; num ++){
			String tipo = "frases-de-reflexao/page/"; // VOCÊ IRAR COLOCAR A URL QUE SE REPETE EM TODAS AS PÁGINAS AQUI.
			String tipoMensagem = "extra";
			Document doc = Jsoup.connect("http://www.url.com.br/"+ tipo + num).get(); // AQUI FICARÁ A URL QUE SEMPRE MODIFICA, QUANDO É MUDADO DE PÁGINA.
			Elements els = doc.getElementsByClass("frase");

			for(Element t : els){
				System.out.println("insert into " + tipoMensagem + " value(" + t.text()+")\n");

			}
		}

	}
}
