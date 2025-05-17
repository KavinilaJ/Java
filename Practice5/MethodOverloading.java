
package Practice5;


public class MethodOverloading {
        int n1;
	int n2;
	public void add(int n1,int n2) {
		System.out.println(n1+n2);
	}
	public void add(String a,String b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		MethodOverloading m =new MethodOverloading();
		m.add(10,20);
                m.add("hello","world");
	}

}
