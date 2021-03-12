package com.github.lukaszprokop.thirdtask;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GamersDatabaseTest {

    @Test(dataProvider = "namesAndScores")
    public void testDatabase(String user, String pack){
        //when
        var database = new GamersDatabase().addNewUsers();
        //then
        assertEquals(database.get(user), pack);
    }

    @DataProvider
    public Object[][] namesAndScores(){
        return new Object[][] {
                {"User2", "novice starter pack nr43"},
                {"User1", "veteran pack"},
                {"User6", "warrior pack"},
                {"User5", "support pack"},
                {"User4", "healer pack"},
                {"User3", "novice starter pack nr10"},
                {"User7", "warrior pack"}
        };
    }

}