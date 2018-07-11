package com.kg.study;
class sampleException
{
    public int print()
    {
        // try {
    
            int a = 30, b = 0;
            int c = a/b;  // cannot divide by zero
            //String name = null;
            System.out.println ("Result = " + c);
            return c;
           // System.out.println(name.charAt(0));
        // } 
        // catch(ArithmeticException e) {
        //     System.out.println ("Can't divide a number by 0");
        // }
        // catch(NullPointerException e) {
        //     System.out.println("NullPointerException..");
        // }
    }
}