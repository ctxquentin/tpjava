package surcharge;

public class Point {

    private int x,y,z;

    public Point(){
        super();
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Point(int xVal){
        this.x = xVal;
        this.y = 0;
        this.z = 0;
    }

    public Point(int xVal, int yVal){
        this.x = xVal;
        this.y = yVal;
    }

    public Point(int xVal, int yVal, int zVal){
        this.x = xVal;
        this.y = yVal;
        this.z = zVal;
    }


}
