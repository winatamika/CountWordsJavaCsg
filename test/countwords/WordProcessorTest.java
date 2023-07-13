/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countwords;

import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class WordProcessorTest {
        
    public WordProcessorTest() {
    }
    
    @Test
    public void testCountWordsStartingWith() {
        String wordSeries = "Mango apple Melon Grape mango Banana Melons";
        WordProcessor wordProcessor = new WordProcessor(wordSeries);

        int count = wordProcessor.countWordsStartingWith("M");
        assertEquals(4, count);
    }

    @Test
    public void testGetLongWords() {
        String wordSeries = "Mango apple Melon Grape mango Banana Melons";
        WordProcessor wordProcessor = new WordProcessor(wordSeries);

        List<String> longWords = wordProcessor.getLongWords(5);
        List<String> expected = Arrays.asList( "Banana", "Melons");
        assertEquals(expected, longWords);
    }

   
    
}
