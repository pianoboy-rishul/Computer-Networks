
/**
 * JAVA Program for URL.
 *
 * @author (Rishul Ghosh)
 * @version (_N230_70471119030_)
 * MBA TECH CS DIV-B BATCH-A
 */

import java.io.*;
import java.net.*;
public class URLDemo
{
   public static void main(String[]args)
   {
       try
       {
           URL url=new URL("http://...................l");
           System.out.println("Protocol: "+url.getProtocol());
           System.out.println("Host Name: "+url.getHost());
           System.out.println("Port Number: "+url.getPort());
       }catch(Exception e)
       {
       System.out.println(e);
       }
    }
}

