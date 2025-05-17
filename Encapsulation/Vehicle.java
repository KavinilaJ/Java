
package Encapsulation;


public class Vehicle {
    private String modal;
    private int year;
    public void setDetails(String modal,int year){
        this.modal=modal;
        this.year=year;
    }
    public void getDetails(){
        System.out.println("Modal:"+modal);
        System.out.println("Year:"+year);
    }
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.setDetails("fgh67",2006);
        v.getDetails();
    }
}
