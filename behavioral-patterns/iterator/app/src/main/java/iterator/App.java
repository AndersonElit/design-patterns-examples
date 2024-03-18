/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package iterator;

public class App {

    public static void main(String[] args) {

        ListAggregate<String> colors = new ListAggregate<>();

        colors.addItem("red");
        colors.addItem("yellow");
        colors.addItem("blue");
        colors.addItem("green");

        Iterator<String> iterator = colors.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
