package com.klodnicki.design.patterns.singleton;

// checkedException - podczas kompilacji jest sprawdzane czy jest obsluzony, jesli nie jest apka sie nie uruchomi
// uncheckedException - np. RuntimeException podczas kompilacji nie jest sprawdzane czy jest obsluzony. Kompilacja sie zakonczy i apka
// przejdzie w Runtime i jak zrobisz cos co spowoduje wystapienie tego exceptiona to masz crasha apki.

public class StaticBlockSingleton {

    //on jest jak eager bo tworzy od razu instancję, ale dodatkowo daje możliwośc obsluzenia wyjątków
    // https://refactoring.guru/design-patterns/
    private static StaticBlockSingleton instance;
    private StaticBlockSingleton(){}

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while creating singleton"); // to jest tylko przyklad, gdyz tu bedzie jakis customowy exception
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
