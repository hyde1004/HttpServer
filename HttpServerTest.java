import junit.framework.TestCase;


public class HttpServerTest extends TestCase
{
	public void setUp()
	{
		System.out.println("Start Unit Test");
	}
	
	public void testGet()
	{
		HttpServer myServer = new HttpServer();
		assertFalse(myServer.parseVerbGet("GE"));
		assertTrue(myServer.parseVerbGet("GET / HTTP/1.1"));
		assertFalse(myServer.parseVerbGet("GETS"));
		assertFalse(myServer.parseVerbGet("gets"));
		assertTrue(myServer.parseVerbGet("get / http/1.1"));	/*	lower test	*/
	}
	
	public void testRoot()
	{
//		HttpServer myServer = new HttpServer();
//		assertTrue(myServer.parseVerbGet("GET / "));
	}
}
