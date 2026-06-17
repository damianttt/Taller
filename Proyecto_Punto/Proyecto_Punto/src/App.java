public class App {
    public static void main(String[] args) throws Exception {
    

    Punto p1 = new Punto(3,4);
    Punto p2 = new Punto(6);
    Punto p3 = new Punto();

    //p2.setX(3);
    //p2.setY(5);


    System.out.print("x= " + p1.getX() +"    " + "y= " + p1.getY());  
    System.out.print("x= " + p2.getX() +"    " + "y= " + p2.getY());
    System.out.print("x= " + p3.getX() +"    " + "y= " + p3.getY());  
    }
    
}
   