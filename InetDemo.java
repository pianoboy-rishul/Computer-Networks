
/**
 * JAVA Program for IP Address.
 *
 * @author (Rishul Ghosh)
 * @version (_N230_70471119030_)
 * MBA TECH CS DIV-B BATCH-A
 */

import java.io.*;  
import java.net.*;  
public class InetDemo
{  
    public static void main(String[]args)
    {  
        try
        {  
            InetAddress ip=InetAddress.getByName("www.google.com");  
            System.out.println("Host Name: "+ip.getHostName());  
            System.out.println("IP Address: "+ip.getHostAddress());  
        }catch(Exception e)
        {
            System.out.println(e);
        }  
    }  
} 
