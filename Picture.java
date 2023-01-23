/*
Me trying to make a battle droid vs a clone trooper.
 */
public class Picture {
    private boolean drawn;
    
    /**
     * Constructor for objects of class Picture
     */
    public Picture() {
        Square square = new Square();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Person person = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw() {
        if(!drawn){
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
