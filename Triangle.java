class Triangle extends Shape {
    /**
    * The name of this triangle
    */
    private Double sideOne;
    private Double sideTwo;
    private Double sideThree;

    /**
    * Constructs a newly created Triangle object that represents a triangle.
    */
    public Triangle() {
        super();
        this.sideOne = 1.0;
        this.sideTwo = 1.0;
        this.sideThree = 1.0;
    }

    private boolean isValid(Double sideOne, Double sideTwo, Double sideThree) {
        Double max = Math.max(sideOne, Math.max(sideTwo, sideThree));
        Double other = sideOne + sideTwo + sideThree - max;
        return max < other;
    }

    /**
    * Constructs a newly created Triangle object with name.
    * @param name The name of this triangle
    * @param sideOne The sideOne of this triangle
    * @param sideTwo The sideTwo of this triangle
    * @param sideThree The sideThree of this triangle
    */
    public Triangle(String name, Double sideOne, Double sideTwo, Double sideThree) throws InvalidTriangleException, Exception {
        super(name);
        try{
            if (isValid(sideOne, sideTwo, sideThree)) {
                this.sideOne = sideOne;
                this.sideTwo = sideTwo;
                this.sideThree = sideThree;
            } else {
                throw new InvalidTriangleException("The longest side should be longer than the sum of others.");
            }
        } catch (InvalidTriangleException ex) {
            ex.printStackTrace();
            throw new InvalidTriangleException("The longest side should be longer than the sum of others.");
        } catch (Exception ex){
            ex.printStackTrace();
            System.exit(1);
        } finally{
            // Cleanup code if any.
        }
    }

    /**
    * Returns the sideOne of this triangle.
    * @return The sideOne of this triangle
    */
    public Double getSideOne(){
        return this.sideOne;
    }

    /**
    * Returns the sideTwo of this triangle.
    * @return The sideTwo of this triangle
    */
    public Double getSideTwo(){
        return this.sideTwo;
    }

    /**
    * Returns the sideTwo of this triangle.
    * @return The sideThree of this triangle
    */
    public Double getSideThree(){
        return this.sideThree;
    }

    /**
    * Changes the sideOne of this triangle.
    * @param sideOne The sideOne of this triangle
    */
    public void setSideOne(Double sideOne) throws InvalidTriangleException, Exception {
        try{
            if (isValid(sideOne, this.sideTwo, this.sideThree)) {
                this.sideOne = sideOne;
            } else {
                throw new InvalidTriangleException("The longest side should be longer than the sum of others.");
            }
        } catch (InvalidTriangleException ex){
            ex.printStackTrace();
            throw new InvalidTriangleException("The longest side should be longer than the sum of others.");
        } catch (Exception ex){
            ex.printStackTrace();
            System.exit(1);
        } finally{
            // Cleanup code if any.
        }
    }

    /**
    * Changes the sideTwo of this triangle.
    * @param sideTwo The sideTwo of this triangle
    */
    public void setSideTwo(Double sideTwo) throws InvalidTriangleException, Exception {
        try{
            if (isValid(this.sideOne, sideTwo, this.sideThree)) {
                this.sideTwo = sideTwo;
            } else {
                throw new InvalidTriangleException("The longest side should be longer than the sum of others.");
            }
        } catch (InvalidTriangleException ex){
            ex.printStackTrace();
            throw new InvalidTriangleException("The longest side should be longer than the sum of others.");
        } catch (Exception ex){
            ex.printStackTrace();
            System.exit(1);
        } finally{
            // Cleanup code if any.
        }
    }

    /**
    * Changes the sideThree of this triangle.
    * @param sideThree The sideThree of this triangle
    */
    public void setSideThree(Double sideThree) throws InvalidTriangleException, Exception {
        try{
            if (isValid(this.sideOne, sideThree, this.sideThree)) {
                this.sideThree = sideThree;
            } else {
                throw new InvalidTriangleException("The longest side should be longer than the sum of others.");
            }
        } catch (InvalidTriangleException ex){
            ex.printStackTrace();
            throw new InvalidTriangleException("The longest side should be longer than the sum of others.");
        } catch (Exception ex){
            ex.printStackTrace();
            System.exit(1);
        } finally{
            // Cleanup code if any.
        }
    }

    /**
    * Returns the area of this triangle.
    * @return The area of this triangle
    */
    public Double area() {
        Double s = (this.sideOne + this.sideTwo + this.sideThree) / 2;
        return Math.sqrt(s * (s-this.sideOne) * (s-this.sideTwo) * (s-this.sideThree));
    }
}
