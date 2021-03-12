package com.github.lukaszprokop.firsttask;

import java.util.HashSet;

/**
 * TODO: Numbers should be displayed in reverse order. Do not change this class.
 * <p> Refactor {@link MagicNumber}
 *
 * @author Łukasz Prokop
 * @see MagicNumber
 */
class Main {
    public static void main(String[] args) {
        setOfNumbers().forEach(System.out::println);
    }


    public static HashSet<MagicNumber> setOfNumbers() {
        HashSet<MagicNumber> numbers = new HashSet<>();
        numbers.add(new MagicNumber("One"));
        numbers.add(new MagicNumber("Two"));
        numbers.add(new MagicNumber("Three"));
        numbers.add(new MagicNumber("Four"));
        numbers.add(new MagicNumber("Five"));
        numbers.add(new MagicNumber("Six"));

        return numbers;
    }
}
