package mail;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Program {
	  /*
     * THe URL which should be requested
     */
    private static final String ApiUrl = "https://api.hippoapi.com/v3/more/json";
    
    /*
     * Query string for request
     * %1$s = ApiUrl
     * %2$s = API Key
     * %3$s = Email address to query
     */
    private static final String QueryFormatString = "%1$s/%2$s/%3$s";
    
    /*
     * Your API Key
     * 
     */
    private static final String YourAPIKey = "06AD0352";
    
    /**
     * The main program entry point
     * @param args the command line arguments
     * @throws IOException If the server does not return a success response
     */
    public static void main(String[] args) 
    {
        System.out.println("Input email address to verify");
        
        // Create a scanner to read in the requested email address
        Scanner in = new Scanner(System.in);
        String readLine = in.next();
          
        try 
        {
            // Format the request url to the correct structure for the request
            URL requestUrl = new URL(String.format(QueryFormatString, ApiUrl, YourAPIKey, readLine));
            
            // Open a connection to the website
            HttpURLConnection myRequest =  (HttpURLConnection) requestUrl.openConnection();
            
            // Set the type to HTTP GET
            myRequest.setRequestMethod("GET");

            // Create a new buffered reader to read the response back from the server
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(myRequest.getInputStream()));
            
            String inputLine;
            StringBuilder response = new StringBuilder();
            
            // Read in the response line from the server
            while ((inputLine = reader.readLine()) !=null )
            {
                response.append(inputLine);
            }
            
            // Close the reader
            reader.close();
            
            // Output the result to console
            System.out.println(response.toString());
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
