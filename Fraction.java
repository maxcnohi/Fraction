public class Fraction{
 
  //instance variables
  private int numerator;
  private int denominator;
  
  
  
  //constructor(s)
  public Fraction() {
      this.numerator = 0;
      this.denominator = 1;
  }
  public Fraction(int n, int d){
      this.numerator = n;
      if (d != 0)
          this.denominator = d;
      else{
          this.denominator = 1;
          System.out.println("Error:Denominator no 0");
      }
      
  }  
  public Fraction(String f){
      String[] numbers= f.split("/");
      int n = Integer.parseInt(numbers[0]);
      int d = Integer.parseInt(numbers[1]);
      this.numerator = n;
      if (d != 0)
          this.denominator = d;
      else{
          this.denominator = 1;
          System.out.println("Error:Denominator no 0");
      }
  }
  
  public Fraction(Fraction f){
      this.numerator = f.numerator;
      this.denominator = f.denominator;
  }
  
  public double toDecimal(){
      return (double) numerator / denominator;
  }
  //behaviour method(s)
  public void setNum(int n){
      numerator = n;
  }
  
  public static Fraction multiply (Fraction a, Fraction b){
      if (b.toDecimal == 0){
          System.out.println("Can't divide 0");
      }
      
      int newNum = a.numerator * b.numerator;
      int newDen = a.denominator * b.numerator;
      Fraction c = new Fraction(newNum, newDen);
      return c;
  }
  
  public static Fraction add (Fraction a, Fraction b){
      int newDen = a.numerator * b.numerator;
      int newNum = a.numerator * b.denominator + b.numerator*a.denominator;
      Fraction c = new Fraction(newNum, newDen);
      //c.reduce();
      return c;
  }
  
  public static Fraction subtract (Fraction a, Fraction b){
      
  }
  
  public void reduce(){
      int gcf = GCF(numerator, denominator);
      numerator = numerator / gcf;
      denominator = denominator / gcf;
  }
  
  private int GCF (int a, int b){
    
      
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
