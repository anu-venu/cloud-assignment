import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Stories extends HttpServlet
{	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{	resp.setContentType("text/plain");
    		resp.getWriter().println("{ \"name\": \"World\" }");
		System.out.println("Welcome.\nThis is my cloud computing assignment. This app displays a collection of short stories from the website Daily Fiction.\n");
		Scanner input = new Scanner(new File("stories.txt"));
		while (input.hasNextLine())
			System.out.println(input.nextLine());
	}
}
