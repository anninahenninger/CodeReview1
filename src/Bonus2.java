public class Bonus2 {

    public static int calculateRectArea(int width, int height){
        int rectangularArea = width * height;
        return rectangularArea;
    }

    public static void main(String[] args){
        try {
            int[] parameters = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                parameters[i] = Integer.parseInt(args[i]);
            }
            for (int i = 0; i < args.length; i = i + 2) {
                System.out.println("The area of the given rectangular is " +
                        calculateRectArea(parameters[i], parameters[i + 1]) + "m2");
            }
        }catch (Exception e){
            System.out.println("Check your input, maybe there is a value missing");
        }
    }
}
