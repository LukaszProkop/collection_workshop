package com.github.lukaszprokop.secondtask;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO: summarize student scores
 * <p>Implement method {@link StudentEvaluation#summaryOfScores()}
 *
 * @author Łukasz Prokop
 */
class StudentEvaluation {

    public static void main(String[] args) {
        System.out.println("Summary of the students scores:\n"
                + new StudentEvaluation().summaryOfScores());
    }

    private Map<String, Integer> gradingLog() {
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Michał", 90);
        grades.put("Adam", 78);
        grades.put("Thomas", 56);

        return grades;
    }

    private Map<String, List<Integer>> scoresToAdd() {
        return Map.of("Adam", List.of(20, 15, 7, 8, 31),
                "John", List.of(89, 21, 12, 4),
                "Thomas", List.of(34, 12, 14, 45),
                "Mateusz", List.of(32, 35, 13, 2));
    }

    public Map<String, Integer> summaryOfScores() {
        Map<String, Integer> gradingLog = gradingLog();
        //TODO: Add scoresToAdd() to `gradingLog`. Add scores only to those students who are present in the `gradingLog`

        return gradingLog;
    }
}
