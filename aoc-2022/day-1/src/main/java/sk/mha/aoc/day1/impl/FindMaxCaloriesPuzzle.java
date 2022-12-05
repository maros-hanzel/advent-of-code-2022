package sk.mha.aoc.day1.impl;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sk.mha.aoc.day1.AbstractCaloriesCounter;
import sk.mha.aoc.day1.data.Elf;

import java.util.List;

@Component
@Order(11)
public class FindMaxCaloriesPuzzle extends AbstractCaloriesCounter {
    @Override
    public Long solve(List<String> input) {
        List<Elf> elves = inputToElves(input);
        return findMaxNCalories(elves, 1);
    }
}
