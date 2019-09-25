package com.stackroute;

class CustomExceptionHandling {
    public static void main(String[] args) {
        try{
            throw new Exception("Custom Exception throwing");
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
    }
}