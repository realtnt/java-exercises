/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package todo;

import java.util.ArrayList;

public class Todo {
  public ArrayList<String> tasks = new ArrayList<>();

  public ArrayList<String> getTasks() {
    return tasks;
  }

  void addTask(String task) {
    tasks.add(task);
  }

  public static void main(String[] args) {

  }
}
