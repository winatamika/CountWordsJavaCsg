/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countwords;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
class WordProcessor {
    private String wordSeries;

    public WordProcessor(String wordSeries) {
        this.wordSeries = wordSeries;
    }
    
     /**
     * Counts the number of words that start with a specific prefix.
     *
     * @param prefix the prefix to search for
     * @return the number of words starting with the prefix
     */
    public int countWordsStartingWith(String prefix) {
        String[] words = wordSeries.split(" ");
        int count = 0;
        for (String word : words) {
            if (word.startsWith(prefix) || word.startsWith(prefix.toLowerCase()) || word.startsWith(prefix.toUpperCase())) {
                count++;
            }
        }
        return count;
    }

     /**
     * Retrieves a list of words longer than a specified length.
     *
     * @param length the minimum length of the words to retrieve
     * @return a list of words longer than the specified length
     */
    public List<String> getLongWords(int length) {
        String[] words = wordSeries.split(" ");
        List<String> longWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() > length) {
                longWords.add(word);
            }
        }
        return longWords;
    }
}
