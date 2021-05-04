class Circle extends Shape {
    /**
    * The name of this circle
    */
    private Double radius;

    /**
    * Constructs a newly created Circle object that represents a circle.
    */
    public Circle() {
        super();
        this.radius = 1.0;
    }

    /**
    * Constructs a newly created Circle object with name.
    * @param name The name of this circle
    * @param radius The radius of this circle
    */
    public Circle(String name, Double radius){
        super(name);
        this.radius = radius;
    }

    /**
    * Returns the radius of this circle.
    * @return The radius of this circle
    */
    public Double getRadius(){
        return this.radius;
    }

    /**
    * Changes the radius of this circle.
    * @param radius The radius of this circle
    */
    public void setRadius(Double radius){
        this.radius = radius;
    }

    /**
    * Returns the area of this circle.
    * @return The area of this circle
    */
    public Double area() {
        return this.radius * this.radius * Math.PI;
    }
}
