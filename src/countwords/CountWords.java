/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countwords;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author ASUS
 */


  /**
  * The CountWords class processes a word series and applies various operations on it.
  */
public class CountWords {

     /**
     * The entry point of the CountWords program.
     *
     * @param args the command-line arguments
     */
     public static void main(String[] args) {
        String filePath = "data/wordSeries.txt";
        String prefix = "M";
        int minLength = 5;

        String wordSeries = readWordSeriesFromFile(filePath);

        WordProcessor wordProcessor = new WordProcessor(wordSeries);

        int count = wordProcessor.countWordsStartingWith(prefix);
        System.out.println("Number of words starting with '" + prefix + "': " + count);

        List<String> longWords = wordProcessor.getLongWords(minLength);
        System.out.println("Words longer than " + minLength + " characters: " + longWords);
    }
     
     
     /**
     * Reads the word series from a file.
     *
     * @param filePath the path of the file containing the word series
     * @return the word series read from the file
     */
    private static String readWordSeriesFromFile(String filePath) {
        StringBuilder wordSeries = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                wordSeries.append(line).append(" ");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        return wordSeries.toString().trim();
    }
    
}
