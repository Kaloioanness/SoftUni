package JavaFundamentals.Excercises.ObjectsAndClasses;

import java.security.PublicKey;
import java.util.Random;

public class P01AdvertisementMessage {
    private static final String[] PHRASES = {
             "Excellent product.",
             "Such a great product.",
             "I always use that product.",
             "Best product of its category.",
             "Exceptional product.",
             "I can’t live without this product."
    };
    private static final String[] EVENTS = {
            "Now I feel good.",
            "I have succeeded with this product.",
            "Makes miracles. I am happy of the results!",
            "I cannot believe but now I feel awesome.",
            "Try it yourself, I am very satisfied.",
            "I feel great!"

    };
    public static final String[] AUTHORS = {
            "Diana",
            "Petya",
            "Stella",
            "Elena",
            "Katya",
            "Iva",
            "Annie",
            "Eva"
    };
    public static final String[] CITIES = {
            "Burgas",
            "Sofia",
            "Plovdiv",
            "Varna",
            "Ruse"
    };


    public static void main(String[] args) {
        int num = 5;
        generateText(num);
    }
    public static void generateText (int num){
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            String phrase = PHRASES[random.nextInt(PHRASES.length)];
            String events = EVENTS[random.nextInt(EVENTS.length)];
            String authors = AUTHORS[random.nextInt(AUTHORS.length)];
            String cities = CITIES[random.nextInt(CITIES.length)];
            System.out.printf("%s + %s + %s + %s", phrase, events, authors, cities);
        }
    }
}
