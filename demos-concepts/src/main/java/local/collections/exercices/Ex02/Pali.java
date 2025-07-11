package local.collections.exercices.Ex02;

import java.util.Stack;

public class Pali {

    String word;
    Stack<Character> stack;

    public Pali(String word) {
        this.word = word;
        this.stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // reconstruir palabras
        StringBuffer reversed = new StringBuffer();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // mostrar palabra
        System.out.println("Palabra original: " + word);
        System.out.println("Palabra invertida: " + reversed.toString());

        // comparar letra mayúscula y minúsculas

        if (word.equalsIgnoreCase(reversed.toString())) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
    }

    public static void main(String[] args) {

        System.out.println("---------------------");
        Pali p = new Pali("reconocer");
        System.out.println("---------------------");
        Pali p1 = new Pali("retor , somos");
    }

}
