public class Main {

    public static int calculateRectArea(int width, int height){
        int rectangularArea = width * height;
        return rectangularArea;
    }
    public static int calculateSquareArea(int width){
        int squareArea = (int)Math.pow(width,2);
        return squareArea;
    }
    public static int calculateSquarePerimeter(int width){
        int squarePerimeter = 4 * width;
        return squarePerimeter;
    }

    public static void main(String[] args) {
        int width = 5; int width1 = 20; int width2 = 40;
        int height = 2; int height1 = 30; int height2 = 50;

        System.out.println("The area of the given rectangular is " + calculateRectArea(width, height) + "m2");
        System.out.println("The area of the given rectangular is " + calculateRectArea(width1, height1) + "cm2");
        System.out.println("The area of the given rectangular is " + calculateRectArea(width2, height2) + "cm2\n");

        int sWidth = 4; int sWidth1 = 2;
        System.out.println("The area of the given square is " + calculateSquareArea(sWidth) + "cm2");
        System.out.println("The perimeter of the given square is " + calculateSquarePerimeter(sWidth) + "cm");
        System.out.println("The area of the given square is " + calculateSquareArea(sWidth1) + "cm2");
        System.out.println("The perimeter of the given square is " + calculateSquarePerimeter(sWidth1) + "cm\n");

        int width3 = 17; int width4 = 55; int width5 = 83; int width6 = 47;
        int height3 = 44; int height4 = 99; int height5 = 67; int height6 = 11;
        System.out.println("The area of the given rectangular is " + calculateRectArea(width3, height3) + "m2");
        System.out.println("The area of the given rectangular is " + calculateRectArea(width4, height4) + "cm2");
        System.out.println("The area of the given rectangular is " + calculateRectArea(width5, height5) + "m2");
        System.out.println("The area of the given rectangular is " + calculateRectArea(width6, height6) + "cm2\n");

        int sWidth2 = 14; int sWidth3 = 69; int sWidth4 = 36; int sWidth5 = 21;
        System.out.println("The area of the given square is " + calculateSquareArea(sWidth2) + "cm2");
        System.out.println("The perimeter of the given square is " + calculateSquarePerimeter(sWidth2) + "cm");
        System.out.println("The area of the given square is " + calculateSquareArea(sWidth3) + "cm2");
        System.out.println("The perimeter of the given square is " + calculateSquarePerimeter(sWidth3) + "cm");
        System.out.println("The area of the given square is " + calculateSquareArea(sWidth4) + "cm2");
        System.out.println("The perimeter of the given square is " + calculateSquarePerimeter(sWidth4) + "cm");
        System.out.println("The area of the given square is " + calculateSquareArea(sWidth5) + "cm2");
        System.out.println("The perimeter of the given square is " + calculateSquarePerimeter(sWidth5) + "cm\n");
    }
}
