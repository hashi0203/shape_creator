class Rectangle extends Shape {
    /**
    * The name of this rectangle
    */
    private Double length;
    private Double width;

    /**
    * Constructs a newly created Rectangle object that represents a rectangle.
    */
    public Rectangle() {
        super();
        this.length = 1.0;
        this.width = 1.0;
    }

    /**
    * Constructs a newly created Rectangle object with name.
    * @param name The name of this rectangle
    * @param length The length of this rectangle
    * @param width The width of this rectangle
    */
    public Rectangle(String name, Double length, Double width){
        super(name);
        this.length = length;
        this.width = width;
    }

    /**
    * Returns the length of this rectangle.
    * @return The length of this rectangle
    */
    public Double getLength(){
        return this.length;
    }

    /**
    * Returns the width of this rectangle.
    * @return The width of this rectangle
    */
    public Double getWidth(){
        return this.width;
    }

    /**
    * Changes the length of this rectangle.
    * @param length The length of this rectangle
    */
    public void setLength(Double length){
        this.length = length;
    }

    /**
    * Changes the width of this rectangle.
    * @param width The width of this rectangle
    */
    public void setWidth(Double width){
        this.width = width;
    }

    /**
    * Returns the area of this rectangle.
    * @return The area of this rectangle
    */
    public Double area() {
        return this.length * this.width;
    }
}
