public class JavaDoc {  //class name
    public static double areaOfRectangle(double length, double width){ //method that calculate the area of a rectangle
        //Documentation comment that explains what the code is all about
        /**
         * Calculate the area of a rectangle
         * @param length the length of the rectangle
         * @param width the width of the rectangle
         * @return the area of the rectangle
         */
        return length * width;
    }
    public static void main(String[] args) {
        double length = 3.2;    //length of the rectangle
        double width = 6.0;     //width of the rectangle
        System.out.println("the area of the rectangle is: " + areaOfRectangle(length,width));   //printing the area

    }
}
