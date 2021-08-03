package investimento.test;

import java.util.Stack;

public class StackListTest {

	public static void main(String[] args) {

		// First In - Last out
		Stack<String> stack = new Stack<>();
		System.out.println("Vazia? " + stack.empty());

		stack.push("Fl�vio");
		stack.push("Eduardo");
		stack.push("Moreni");
		
		System.out.println(stack);
		
		stack.pop(); // remove um item da fila
		
		System.out.println(stack);
		
		
		
	}

}
