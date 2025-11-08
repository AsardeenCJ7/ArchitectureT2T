// FactoryMethodDemo.java
    interface Shape {
        void draw();
    }

    class Circle implements Shape {
        public void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    class Rectangle implements Shape {
        public void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }

    class Square implements Shape {
        public void draw() {
            System.out.println("Drawing a Square");
        }
    }

    class ShapeFactory {
        public Shape getShape(String shapeType) {
            if (shapeType == null) return null;
            return switch (shapeType.toLowerCase()) {
                case "circle" -> new Circle();
                case "rectangle" -> new Rectangle();
                case "square" -> new Square();
                default -> null;
            };
        }
    }

    public class FactoryMethodDemo {
        public static void main(String[] args) {
            ShapeFactory factory = new ShapeFactory();

            Shape s1 = factory.getShape("circle");
            Shape s2 = factory.getShape("rectangle");
            Shape s3 = factory.getShape("square");

            s1.draw();
            s2.draw();
            s3.draw();
        }
    }


