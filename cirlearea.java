public class cirlearea {
    public static void main(String[] args) {
        //define the raduis of the cirle
        double radius =10.5;
        //calculate the ares of the cirle 
        double area = Math.PI*radius*radius;
        //display the area as a double
        System.out.println("area as double:"+ area);
        //Typecast the area to an integer and display it
        int areaint =(int)area; 
        System.out.println("Area as integer:"+ areaint);
    }
}
