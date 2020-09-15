package pom;

import java.util.Base64;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );   
        System.out.println(EncodeString("Hi World!!"));
        System.out.println(DecodeString(EncodeString("Hi World!!")));
    }   

    public static String EncodeString(String stringValue)
    {
        return Base64.getEncoder().encodeToString(stringValue.getBytes());  
    }

    public static String DecodeString(String encString)
    {
        byte[] actualByte = Base64.getDecoder().decode(encString); 
        return new String(actualByte);
    }
}
