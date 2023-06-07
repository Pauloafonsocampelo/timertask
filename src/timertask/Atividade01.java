
package timertask;

 import java.util.Stack;
import java.util.Timer;
import java.util.TimerTask;

public class Atividade01 {

    public static void main(String[] args) {
        
        Stack<String> pilhaDeCartas = new Stack<>();
        pilhaDeCartas.push("Rei");
        pilhaDeCartas.push("Rainha");
        pilhaDeCartas.push("Valete");
        pilhaDeCartas.push("Copa");
        pilhaDeCartas.push("Rainha Espada");
        
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (!pilhaDeCartas.isEmpty()) {
                    System.out.println("Tirando carta " + pilhaDeCartas.pop());
                } else {
                    System.out.println("Fim da pilha");
                    cancel(); // parar a execução da TimerTask
                }
            }
        };
        
        timer.scheduleAtFixedRate(task, 0, 1000); // executar a tarefa a cada 1 segundo
        
    }

}


