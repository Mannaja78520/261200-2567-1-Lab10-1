public class ShapeFactory {
    // Constants
    public static final int MAX_PER_SHAPE = 2;
    public static final int MAX_TOTAL_SHAPES = 5;
    public static final String CIRCLE_TYPE = "CIRCLE";
    public static final String SQUARE_TYPE = "SQUARE";
    public static final String RECTANGLE_TYPE = "RECTANGLE";

    // Counters
    private static int circleCount = 0;
    private static int squareCount = 0;
    private static int rectangleCount = 0;
    private static int totalShapes = 0;

    public static Shape getShape(String shapeType) {
        if (totalShapes >= MAX_TOTAL_SHAPES) {
            System.out.println("Maximum total shapes limit (" + MAX_TOTAL_SHAPES + ") reached");
            return null;
        }

        if (shapeType == null) {
            return null;
        }

        switch (shapeType.toUpperCase()) {
            case CIRCLE_TYPE:
                if (circleCount < MAX_PER_SHAPE) {
                    circleCount++;
                    totalShapes++;
                    return new Circle();
                }
                else{
                System.out.println("Maximum Circle limit (" + MAX_PER_SHAPE + ") reached");
                return null;
                }

            case SQUARE_TYPE:
                if (squareCount < MAX_PER_SHAPE) {
                    squareCount++;
                    totalShapes++;
                    return new Square();
                }
                else{
                System.out.println("Maximum Square limit (" + MAX_PER_SHAPE + ") reached");
                return null;
                }

            case RECTANGLE_TYPE:
                if (rectangleCount < MAX_PER_SHAPE) {
                    rectangleCount++;
                    totalShapes++;
                    return new Rectangle();
                }
                else{
                System.out.println("Maximum Rectangle limit (" + MAX_PER_SHAPE + ") reached");
                return null;
                }

            default:
                return null;
        }
    }
}