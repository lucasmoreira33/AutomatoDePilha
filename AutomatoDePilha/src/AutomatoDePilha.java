import java.util.Stack;


public class AutomatoDePilha {

    private Stack<Character> pilha;

    public AutomatoDePilha() {
        pilha = new Stack<>();
    }

    public boolean reconhecer(String entrada) {
        pilha.clear();

        for (char c : entrada.toCharArray()) {
            if (c == '0') {
                pilha.push('0');
            } else if (c == '1') {
                if (pilha.isEmpty() || pilha.pop() != '0') {
                    return false;
                }
            } else {
                return false;
            }
        }

        return pilha.isEmpty();
    }
}