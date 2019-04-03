package com.insightfullogic.java8.answers.chapter9;

import java.util.function.Consumer;

// BEGIN class
public interface ArtistAnalyzer {

    void isLargerGroup(String artistName,
                       String otherArtistName,
                       Consumer<Boolean> handler);
    // other comment
}
// END class
