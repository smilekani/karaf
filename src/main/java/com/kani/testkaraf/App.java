package com.kani.testkaraf;

import java.util.Map;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.ConfigurationPolicy;
import org.apache.felix.scr.annotations.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Hello world!
 *
 */
@Component (policy = ConfigurationPolicy.OPTIONAL, ds = true, immediate = true, metatype = false)
@Service (App.class)
public class App 
{
	
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	
	/* public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }*/

	@Activate
	public void activate(Map<String, Object> properties) throws Exception
	{
		System.out.println("Test Karaf Bundle");
		System.out.println("Hello Kanimozhi, Welcome to Karaf!!!!");
		LOG.info("Test Karaf Bundle11");
	}
}
