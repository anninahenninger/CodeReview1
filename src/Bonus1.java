public class Bonus1 {

    public static int calculateRectArea(int width, int height){
        int rectangularArea = width * height;
        return rectangularArea;
    }

    public static void main(String[] args){
        int[] width = {4,6,33,76,76,97,23,5,7};
        int[] height = {56,2,67,43,7,543,8,54,2};

        for(int i=0; i<width.length; i++) {
            System.out.println("The area of the given rectangular is " + calculateRectArea(width[i], height[i]) + "m2");
        }
    }
}
