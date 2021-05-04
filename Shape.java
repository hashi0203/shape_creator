public abstract class Shape {
    /**
    * The name of this shape
    */
    private String name;

    /**
    * Constructs a newly created Shape object that represents a shape with an default name.
    */
    public Shape() {
        this.name = this.getClass().getSimpleName();
    }

    /**
    * Constructs a newly created Shape object with name.
    * @param name The name of this shape
    */
    public Shape(String name){
        this.name = name;
    }

    /**
    * Returns the name of this shape.
    * @return The name of this shape
    */
    public String getName(){
        return this.name;
    }

    /**
    * Changes the name of this shape.
    * @param name The name of this shape
    */
    public void setName(String name){
        this.name = name;
    }

    /**
    * Returns the area of this rectangle.
    * @return The area of this rectangle
    */
    public abstract Double area();

    /**
    * Returns a string representation of this shape. The returned string contains the type of
    * this shape and the name of this shape.
    * @return A string representation of this shape
    */
    public String toString(){
        return this.getClass().getSimpleName() + ": " + this.name;
    }

    /**
    * Indicates if this shape is "equal to" some other object. If the other object is a shape,
    * this shape is equal to the other shape if they have the same names. If the other object is
    * not a shape, this shape is not equal to the other object.
    * @param obj A reference to some other object
    * @return A boolean value specifying if this shape is equal to some other object
    */
    public boolean equals(Object obj){
        //The specific object isn’t a shape.
        if(!(obj instanceof Shape)){
            return false;
        }
        //The specific object is a shape.
        Shape other = (Shape)obj;
        return this.name.equalsIgnoreCase(other.name);
    }
}