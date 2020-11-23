package training.termialoperators;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperatorsExercise implements StreamTerminalOperators {

    @Override
    public void addToSet(Stream<String> stream, Set<String> set) {
        set.addAll(stream.collect(Collectors.toUnmodifiableSet()));
    }

    @Override
    public void addToListInReverseOrder(Stream<String> stream, List<String> list) {
        list.addAll(stream.collect(Collectors.toList()));
        list.sort(Comparator.reverseOrder());
    }

    @Override
    public String[] collectToArray(Stream<String> stream) {

        return stream.toArray(String[]::new);
    }

    @Override
    public Set<String> collectToSet(Stream<String> stream) {

        return stream.collect(Collectors.toSet());
    }

    @Override
    public List<String> collectToList(Stream<String> stream) {

        return stream.collect(Collectors.toList());
    }

    @Override
    public String mergeIntoString(Stream<String> stream) {

        return "["+ stream.collect(Collectors.joining("-")) +"]";
    }

    @Override
    public int countCharacters(Stream<String> stream) {
        return stream.collect(Collectors.joining("")).length();
    }

    @Override
    public int longestWordLength(Stream<String> stream) {
        String s = stream.collect(Collectors.joining(" "));
        List<String> strings = Arrays.asList(s.split(" "));
        String longestWorld = Collections.max(strings, Comparator.comparing(String::length));
        return longestWorld.length();
    }

    @Override
    public String longestWord(Stream<String> stream) {
        String s = stream.collect(Collectors.joining(" "));
        List<String> strings = Arrays.asList(s.split(" "));
        String longestWorld = Collections.max(strings, Comparator.comparing(String::length));
        return longestWorld;
    }

    @Override
    public Map<Integer, List<String>> wordsGroupedByLength(Stream<String> stream) {
        return Map.of();
    }
}
