class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int total; 
    total = 11 * 55; 

    double brown; 
      brown = total * .13;
    double green; 
      green = total * .16;
    double blue; 
      blue = total * .24; 
    double orange; 
      orange = total * .20;
    double red; 
      red = total * .13;
    double yellow; 
      yellow = total * .14;

    System.out.println("brown: " + brown);
    System.out.println("green: " + green);
    System.out.println("blue: " + blue);
    System.out.println("orange: " + orange);
    System.out.println("red: " + red);
    System.out.println("yellow: " + yellow);

    double sum; 
    sum = brown + green + blue + orange + red + yellow;

    System.out.println("Sum: " + sum);

    if ( blue < brown && red > orange)
     System.out.println("Blue under Brown and Red over Orange");
    if ( brown >= green)
     System.out.println("Brown is greater than or equal to Green");
    if (sum == total)
     System.out.println("Numbers match");




  }
}