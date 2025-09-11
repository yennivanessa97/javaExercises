import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("Pila vacia: " +  pila);

        // This method returns true if the stack is empy and false otherwise
        System.out.println("Está vacia? " + pila.isEmpty());

        // The method push() adds an element to the stack
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);

        for(Integer stack : pila ){
            System.out.println(stack);
        }

        System.out.println("Pila vacia: " +  pila);

        // This method returns true if the stack is empy and false otherwise
        System.out.println("Está vacia? " + pila.isEmpty());

        // The pop() method removes the last element that was pushed onto the stack

        pila.pop();

        // The search() method returns the 1-based position of the element  in the stack, or  -1 if the element is not found
        System.out.println("Está el 3?" + pila.search(3));

        // The peek() method returns the last element that was pushed onto the stack
        System.out.println("ultimo agregado: " + pila.peek());





    }
}
