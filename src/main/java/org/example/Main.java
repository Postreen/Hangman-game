package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        Dictionary dictionary;
        try {
           dictionary = mapper.readValue
                    (new File("src/main/resources/5_LETTERS_WORDS.json"), Dictionary.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        dictionary.getClass();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}