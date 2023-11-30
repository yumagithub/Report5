package jp.ac.uryukyu.ie.e235715;

public class Main {
    public static void main(String[] args){
        try{
            String str = null;
            System.out.println(str.length());
        }catch(NullPointerException i){
            System.out.println("NullPointExeption");
            System.out.println(i.getMessage());
        }
    }
}