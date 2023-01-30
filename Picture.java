/*
Me trying to make a battle droid vs a clone trooper.
 */
public class Picture {
    private Square square;
    private Square sky;
    private Circle circle;
    private Circle ccircle;
    private Triangle triangle;
    private Person person;
    private Circle face;
    private boolean drawn;
    
    /**
     * Constructor for objects of class Picture
     */
    public Picture() {
        square = new Square(1000, 0, 150, "tan");
        sky = new Square(1000, 0, 0, "blue");
        ccircle = new Circle(24, 340, 40, "orange");
        circle = new Circle(26, 360, 60, "orange");
        triangle = new Triangle(40, 40, 150, 190, "green");
        person = new Person(20, 20, 220, 220, "white");
        face = new Circle(15, 213, 208, "yellow");
        drawn = false;
    }
    
    /**
     * Draw this picture.
     */
    public void draw() {
        if(!(drawn == true)){
            sky.makeVisible();
            square.makeVisible();
            circle.makeVisible();
            ccircle.makeVisible();
            triangle.makeVisible();
            person.makeVisible();
            face.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite() {
        sky.changeColor("white");
        square.changeColor("black");
        circle.changeColor("grey");
        ccircle.changeColor("grey");
        triangle.changeColor("white");
        person.changeColor("white");
        face.changeColor("grey");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor() {
        sky.changeColor("blue");
        square.changeColor("tan");
        ccircle.changeColor("orange");
        circle.changeColor("orange");
        triangle.changeColor("green");
        person.changeColor("white");
        face.changeColor("yellow");
    }
}
