package training.intermediateoperators;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperatorsExercise implements StreamIntermediateOperators {

    @Override
    public Stream<String> wordsLongerThanFiveCharacters(List<String> words) {

        return words.stream().filter(x -> x.length() > 5);
    }

    @Override
    public Stream<String> firstThreeWordsLongerThanFiveCharacters(List<String> words) {

        return words.stream().filter(x -> x.length() > 5).limit(3);
    }

    @Override
    public Stream<String> firstThreeDistinctWordsLongerThanFiveCharactersInReverseAlphabeticalOrder(List<String> words) {

        return words.stream()
                .filter(x -> x.length() > 5)
                .distinct()
                .limit(3)
                .sorted(Comparator.reverseOrder());
    }

    @Override
    public Stream<Integer> lengthOfWords(List<String> words) {

        return words.stream().map(String::length);
    }

    @Override
    public Stream<Integer> staircase() {
        return Stream.empty();
              //  .iterate(new ArrayList<Integer>(0), i -> new ArrayList<Integer>(Stream.iterate(0,y -> y+1).limit(3)))
              //  .limit(7);
    }
}
