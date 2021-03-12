package com.github.lukaszprokop.secondtask;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StudentEvaluationTest {

    @Test(dataProvider = "namesAndScores")
    public void testSummaryOfScores(String name, Integer score){
        //when
        var gradingLog = new StudentEvaluation().summaryOfScores();
        //then
        assertEquals(gradingLog.get(name), score);
    }

    @DataProvider
    public Object[][] namesAndScores(){
        return new Object[][] {
                {"Adam",159},
                {"Thomas",161},
                {"Michał",90}
        };
    }

}