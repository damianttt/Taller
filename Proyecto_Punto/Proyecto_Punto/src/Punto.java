public class Punto {
    private int x, y;
    public Punto(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
    public Punto(int xy){
        this(xy,xy);
    }
    public Punto(){
        this(0,0);
    }
    public double modulo() {
        double valor = 0;
        return valor;
    }
    public double fase() {
        double valor = 0;
        return valor;
    }
    public void setX(int x) {  
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;

    }

}
