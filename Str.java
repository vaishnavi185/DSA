

public class Str {
    //ways to define stringd in java

    public static void main(String[] args){
        String s1="abc";
        String s2= new String("abc");
        String s3= new String("abc").intern();  // intern is used to add string pool
        System.out.print(s2==s3);
        System.out.print(s2.length());  // for length
        System.out.print(s2.equals(s3)); // compare value

        System.out.print(s2.toUpperCase()); //convert to upper csse;

        System.out.print(s2.equalsIgnoreCase(s3));  // compare without case

        //to create mutable string :-string buffer, stringbuilder

        StringBuffer sb= new StringBuffer(s1);// used in dev
        StringBuilder sb1= new StringBuilder(s2); // faster used in dsa

        sb1.reverse(); // reverse


        System.out.print(s1.substring(2
        )); //to print from 2 index

        


    }
}
