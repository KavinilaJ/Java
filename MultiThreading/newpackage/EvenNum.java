
package MultiThreading.newpackage;


class EvenNum extends Thread { 
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
  public static void main(String[] args) {
        EvenNum t1 = new EvenNum();
        t1.start();
    
}
}