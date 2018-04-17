package templateMethod;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverageWithHook{
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    boolean customerWantsCondiments() {
        return getAnswer().toLowerCase().startsWith("y");
    }


    private String getAnswer() {
        String ans = null;

        System.out.println("Would you like some milk and sugar? (y/n)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            ans = reader.readLine();
//            reader.close();
        } catch (IOException e) {
            System.out.println("Invalid input");
            e.printStackTrace();
        }

        if (ans == null) return "no";
        return ans;

    }
}
