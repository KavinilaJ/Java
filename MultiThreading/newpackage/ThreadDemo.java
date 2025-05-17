package MultiThreading.newpackage;
class Demo extends Thread {
	public void run()
	{
	   int num=3;
        for(int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+(num*i));
               }	
	}
}

public class ThreadDemo {
public static void main(String[] args){
    Demo object= new Demo();
    object.start();
		
	}
}
