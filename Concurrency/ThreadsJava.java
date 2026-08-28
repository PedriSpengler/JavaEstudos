public class ThreadsJava extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        ThreadsJava thread = new ThreadsJava();
        thread.start();
        // Wait for the thread to finish
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    public void run() {
        System.out.println("Thread: " + amount);
        amount++;
    }
}



/*
Threads permitem que um programa opere de forma mais eficiente, executando várias tarefas simultaneamente. tempo.

Os threads podem ser usados para executar tarefas complexas em segundo plano sem interrupção. o programa principal.

public class Main implements Runnable { //  Outra forma de implementar uma thread.
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
*/