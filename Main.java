public class Main {
    public static void main(String[] args) {
        // Test the factory with various shape creations
        Shape shape1 = ShapeFactory.getShape(ShapeFactory.CIRCLE_TYPE);
        Shape shape2 = ShapeFactory.getShape(ShapeFactory.SQUARE_TYPE);
        Shape shape3 = ShapeFactory.getShape(ShapeFactory.RECTANGLE_TYPE);
        Shape shape4 = ShapeFactory.getShape(ShapeFactory.CIRCLE_TYPE);
        Shape shape5 = ShapeFactory.getShape(ShapeFactory.SQUARE_TYPE);

        // These should fail due to limits
        Shape shape6 = ShapeFactory.getShape(ShapeFactory.RECTANGLE_TYPE); // 2nd Rectangle
        Shape shape7 = ShapeFactory.getShape(ShapeFactory.CIRCLE_TYPE);     // 3rd Circle

        // Draw all successfully created shapes
        if (shape1 != null) shape1.draw();
        if (shape2 != null) shape2.draw();
        if (shape3 != null) shape3.draw();
        if (shape4 != null) shape4.draw();
        if (shape5 != null) shape5.draw();
    }
}