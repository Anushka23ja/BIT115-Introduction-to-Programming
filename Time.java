//Anushka Chougule and Jolie Davison
class Time{
   public static void main(String args[]) {
   
   int hour= 12;
   int minute= 15;
   int second= 00;
   
   //The variable helps turn the hours and minutes into seconds. Since there are 3600 seconds in an hour we multiply it by hours as well as multiply mintues with 60.
   //Finally we add up all the numbers and set it to SecSinceMidnight.
   int SecSinceMidnight= hour*3600 + minute*60 + second;
   
   System.out.println("The number of seconds that have passed since midnight is: "+ SecSinceMidnight);
   
   //There are 86400 seconds in a day. 24*3600
   int SecRemaining= 86400 - SecSinceMidnight;
   
   System.out.println("The number of seconds that are remaining in the day: "+ SecRemaining);
   
  double DayPercent= SecSinceMidnight*100.0/ (86400.0);
  System.out.println("Percentage of the day that has passed: "+ DayPercent +"%");
  
  hour= 12;
  minute= 55;
  second= 10;
  int EndTime= hour*3600 + minute*60 + second - SecSinceMidnight;
  System.out.println("The amount of seconds elasped since we started working on this assingment is: "+ EndTime);

   }   
}