/*
Me trying to make a battle droid vs a clone trooper.
 */
public class Picture {
    private Square square;
    private Circle circle;
    private Triangle triangle;
    private Person person;
    private boolean drawn;
    
    /**
     * Constructor for objects of class Picture
     */
    public Picture() {
        square = new Square(100, 30, 100, "tan");
        circle = new Circle(10, 60, 60, "yellow");
        triangle = new Triangle(10, 10, 20, 20, "green");
        person = new Person(20, 20, 40, 40, "white");
        drawn = false;
    }
    
    /**
     * Draw this picture.
     */
    public void draw() {
        if(!(drawn == true)){
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite() {
        
    }

    /**
     * Change this picture to use color display
     */
    public void setColor() {
        
    }
}
