 class MethodOverloading
{
     public static void main(String args[])
     {
     AreaCalculator a = new AreaCalculator();
     System.out.println(a.PI);
     float myCircle = a.area(29);
     float myRectangle = a.area(29,23);
      System.out.println("area of circle is "+myCircle);
      System.out.println("area of rectangle is"+myRectangle);
  
     }
}