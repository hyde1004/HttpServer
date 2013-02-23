import java.util.StringTokenizer;


public class HttpServer {


	public boolean parseVerbGet(String input) {
		// TODO Auto-generated method stub
		/*	starts with GET	*/
		StringTokenizer st = new StringTokenizer(input);
		
		String verb = st.nextToken();
		
		if (!verb.equalsIgnoreCase("GET"))
			return false;

		String root = st.nextToken();
		System.out.println("root : " + root);
		
		String versionInfo = st.nextToken();
		System.out.println("version : " + versionInfo);
		
		return true;
	}

}
