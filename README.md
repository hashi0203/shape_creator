# Shape Creator
First Java Program.
Create shapes as specified in `shape.txt`.

## Input
Input should be specified in `shape.txt`
You can add `Rectangle`, `Circle`, and `Triangle`.
The formats for each shape is as follows.

### Rectangle
- First line should be `Rectangle`.
- Second line is the name of the rectangle.
- Third line is the length (height) of the rectangle.
- Forth line is the width of the rectangle.

Example
```
Rectangle
Red Rectangle
12.0
34.0
```

### Circle
- First line should be `Circle`.
- Second line is the name of the circle.
- Third line is the radium of the circle.

Example
```
Circle
Red Circle
2.5
```

### Triangle
- First line should be `Triangle`.
- Second line is the name of the triangle.
- The following three lines is the sides of the triangle.

Example
```
Triangle
Right Triangle
3.0
4.0
5.0
```

## Execute
Run `Driver.java`.

## Output
The output shows all the valid shapes and their parameters in order.
When you add invalid triangle, `InvalidTriangleException` will occur.

The output for the given `shape.txt` is as follows.

```
InvalidTriangleException: The longest edge should be longer than the sum of others.
        at Triangle.<init>(Triangle.java:40)
        at Helper.create(Helper.java:64)
        at Helper.start(Helper.java:10)
        at Driver.main(Driver.java:3)
Rectangle: Red Rectangle, length: 12.0, width: 34.0, area: 408.0
Rectangle: Square, length: 12.0, width: 12.0, area: 144.0
Triangle: Right Triangle, sideOne: 3.0, sideTwo: 4.0, sideThree: 5.0, area: 6.0
Circle: Red Circle, radius: 2.5, area: 19.634954084936208
```


