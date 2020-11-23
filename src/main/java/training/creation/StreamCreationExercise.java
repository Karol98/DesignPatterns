package training.creation;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationExercise implements StreamCreator {

    @Override
    public IntStream positiveDigitsUsingOf() {

        return IntStream.of(1,2,3,4,5,6,7,8,9);
    }

    @Override
    public IntStream positiveDigitsUsingRange() {
        return IntStream.range(1,10);
    }

    @Override
    public IntStream positiveDigitsUsingIterate() {

        return IntStream.iterate(1, i -> i + 1).limit(9);
    }

    @Override
    public IntStream powersOfTwo() {

        return IntStream.iterate(2, i -> i * 2).limit(10);
    }

    @Override
    public DoubleStream from0Till1WithTenSteps() {

        return DoubleStream
                .iterate(0.1, i -> i + 0.1)
                .limit(9);
    }

    @Override
    public Stream<String> alphabet() {

        return Stream.iterate("A", i -> String.valueOf((char)(i.charAt(0)+1))).limit(26);
    }

}
