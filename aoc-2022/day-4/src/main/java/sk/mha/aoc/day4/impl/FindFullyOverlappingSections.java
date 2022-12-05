package sk.mha.aoc.day4.impl;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sk.mha.aoc.day4.AbstractCampCleanupPuzzle;
import sk.mha.aoc.day4.data.Range;

import java.util.List;

@Component
@Order(41)
public class FindFullyOverlappingSections extends AbstractCampCleanupPuzzle {
    @Override
    public Long solve(List<String> input) {
        return overlaps(input, Range::fullyOverlaps);
    }
}
