package com.harshit.qcalc;

public class StandardCalculator {

    private double result;
    
    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

    public double getResult(){
        return this.result;
    }
    
    public void setResult(double result)
    {
        this.result= result;
    }

//for integer value
   // public final void add(int num1, int num2)
   // {
   //     int res= num1+num2;
   //     if(res==Integer.MAX_VALUE)
   //     {
   //       throw new ArithmeticException("Integer overflow");
   //     }
   //     setResult(res);
   // }

   // public  final void subtract(int num1, int num2){
   //    int res= num1-num2;
   //     setResult(res);
   // }

   // public  final void multiply(int num1, int num2)
   // {
   //    int res= num1*num2;
   //    setResult(res);
   // }
 

   // public final void divide(int num1, int num2)
   // {
   //    int res= (num1/num2);
   //    setResult(res);
   // }


// for decimal value
   public final void add(double num1, double num2)
   {
       double res= num1+num2;
       if(res==Double.MAX_VALUE || res== Double.POSITIVE_INFINITY)
       {
          throw new ArithmeticException("double value overflow");
       }
       setResult(res);
   }

   public final void subtract(double num1, double num2){
    double res= num1-num2;
      if(res==(-Double.MAX_VALUE) || res== Double.NEGATIVE_INFINITY)
      {
         throw new ArithmeticException("double value overflow");
      }
     setResult(res);
   }

   public final void multiply(double num1, double num2)
   {
      double res= num1*num2;
      if(res==Double.MAX_VALUE || res== Double.POSITIVE_INFINITY || res== Double.NEGATIVE_INFINITY )
      {
         throw new ArithmeticException("double value overflow");
      }
      setResult(res);
   }

   public final void divide(double num1, double num2)
   {
      if(num2==0)
      {
         throw new ArithmeticException("Divide by zero");
      }
      double res= (num1/num2);
      setResult(res);
   }


   public void clearResult(){
      this.result=0;
   }

   
  public void printResult(){
   System.out.println("Standard Calculator Result:"+ this.result);
  }




}
