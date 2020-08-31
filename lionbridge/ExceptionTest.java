package com.lionbridge;

public class ExceptionTest {
	 public static void main(String[] args){

         try{
             getExceptionB();
         }catch(ExceptionA e){
             e.printStackTrace();
         }

         try{
             getExceptionC();
         }catch(ExceptionA e){
             e.printStackTrace();
         }

     }

     public static void  getExceptionB() throws ExceptionB{
         throw new ExceptionB("Exception B");
     }

     public static void  getExceptionC() throws ExceptionC{
         throw new ExceptionC("Exception C");
     }

 
}
