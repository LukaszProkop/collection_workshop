package com.github.lukaszprokop.thirdtask;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO: Add new users with starter packs to the database
 * <p>Implement method {@link GamersDatabase#addNewUsers()}
 *
 * @author Łukasz Prokop
 */
public class GamersDatabase {

    public static void main(String[] args) {
        System.out.println(new GamersDatabase().addNewUsers());
    }

    private Map<String, String> newUsers() {
        HashMap<String, String> users = new HashMap<>();
        users.put("User1", "novice starter pack nr56");
        users.put("User2", "novice starter pack nr43");
        users.put("User3", "novice starter pack nr10");

        return users;
    }

    private Map<String, String> database() {
        HashMap<String, String> users = new HashMap<>();
        users.put("User1", "veteran pack");
        users.put("User4", "healer pack");
        users.put("User5", "support pack");
        users.put("User6", "warrior pack");
        users.put("User7", "warrior pack");

        return users;
    }

    public Map<String, String> addNewUsers() {
        Map<String, String> database = database();
        //TODO: Add `newUsers()` with starter packs to `database`. Add only those users who are not in the `database`

        return database;
    }
}
