
package OopsPractice;



class Parent {
    int parentData;

    public Parent(int parentData) {
        this.parentData = parentData;
    }

    public void display() {
        System.out.println("Parent Data: " + parentData);
    }
}

class Child extends Parent {
    int childData;

    public Child(int parentData, int childData) {
        super(parentData); 
        this.childData = childData;
    }

    public void display() {
        super.display(); 
        System.out.println("Child Data: " + childData);
    }
}

class Super {
    public static void main(String[] args) {
        Child child = new Child(10, 20);
        child.display(); 
}
}
