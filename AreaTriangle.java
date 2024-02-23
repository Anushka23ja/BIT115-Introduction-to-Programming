//Anushka Chougule and Jolie Davison
class AreaTriangle{
   public static void main(String args[]) {   
	
   //Setting the value 21.5 to base. This is necesary when calculating the area which is on line 14. 
	double base = 21.5;
   //Setting the value 64.87 to height. This is necesary when calculating the area which is on line 14. 
	double height = 64.87;

   //Defining the variable "area" as (base*height)/2. Plugging in the perviously defined variables of base and height, the operation becomes: (21.5*64.87)/2. 
   // This is the equation to finding the area of this triangle.
    double area = (base* height)/2;
	// This statement prints out the final sentance "Area of the Triangle is" with the vaule that is calculated in area.
    System.out.println("Area of Triangle is: " + area);  
    
   }
}