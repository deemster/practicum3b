public class Cirkel {
     private int radius;
     private int xPositie;
     private int yPositie;

    public Cirkel(int rad, int x, int y){
        this.radius = rad;
        this.xPositie = x;
        this.yPositie = y;
        if (rad <= 0){ //de applicatie helemaal niet uitgevoerd kan worden
            throw new IllegalArgumentException("Radius moet groter dan " + radius + " zijn!");
        }
    }
    public String toString(){
        return  "cirkel (" + xPositie + "," + yPositie + ") met radius: "+ radius;
    }
}
