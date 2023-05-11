/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

import com.google.common.collect.ImmutableList;
public class App {
    public String getGreeting(ImmutableList<String> args) {
        return "Hello " + String.join(",", args) + "!";
    }

    public static void main(String[] args) {

        ImmutableList<String> immutable_list = ImmutableList.copyOf(args);

        System.out.println(new App().getGreeting(immutable_list));
    }
}
