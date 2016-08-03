package fr.lmarchau.fcns.poc.elklog;

import fr.lmarchau.fcns.poc.elklog.service.Publisher;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Publisher publisher = new Publisher();

    public static void main( String[] args )
    {
        publisher.publish( "Hello World!" );
        publisher.publish(1000);
    }
}
