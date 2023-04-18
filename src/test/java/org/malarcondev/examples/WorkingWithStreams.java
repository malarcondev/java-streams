package org.malarcondev.examples;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkingWithStreams {
    @Test
    void steams() {
        List<String> names = List.of("Marcos","Fabi","Mari","Sebas");
        Stream<String> stream = names.stream();

        Stream<String> namesStream = Stream.of("Marcos","Fabi","Mari","Sebas");

        Long count = stream
                .limit(2).map(null).sorted(null).dropWhile(null)
                .count();

        String[] namesArray = {};
        Arrays.stream(namesArray);
    }
}
