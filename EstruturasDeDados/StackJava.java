import java.util.ArrayDeque;
import java.util.Deque;

public class StackJava {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();

        stack.push("Lazaro");
        stack.push("Larissa");
        stack.pop();
        System.out.println(stack);
    }
}
