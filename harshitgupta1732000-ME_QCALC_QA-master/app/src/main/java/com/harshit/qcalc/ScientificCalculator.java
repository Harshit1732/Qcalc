package com.harshit.qcalc;

public class ScientificCalculator extends StandardCalculator{

    public static void getVersion(){
        System.out.println("Scientific Calculator 1.0");
    }

    public void sin(double a){
        setResult(Math.sin(a));
        
    }
    public void cos(double a){
        setResult(Math.cos(a));
     
    }
    public void tan(double a){
        setResult(Math.tan(a));
    }
    public void sqrt(double a){

        setResult(Math.sqrt(a));

    }
    public void cbrt(double a){
        setResult(Math.cbrt(a));
       
    }
    public void log(double a)
    {
         setResult(Math.log(a));
    }

    public void square(double a){
        multiply(a,a);
    }

    @Override
    public void printResult(){
        System.out.println("Standard Calculator Result:"+ getResult());
    }
     
}
