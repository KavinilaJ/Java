
package MultiThreading.newpackage;
class AlphabetThread extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println("Char: " + c);
            try {
                Thread.sleep(100); // Pause for 100ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Characters {
    public static void main(String[] args) {
        AlphabetThread at = new AlphabetThread();
        at.start();
    }
}

