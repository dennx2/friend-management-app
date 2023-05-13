

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class C_76_Delete
 */
@WebServlet("/Delete")
public class C_76_Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	M_76_DeleteQuery deleteQueryDAO;

	public void init() {
    	this.deleteQueryDAO = new M_76_DeleteQuery();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// do nothing
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String reply = request.getParameter("friendIdToDelete");
//		System.out.println(reply);
		
		try {
			deleteQueryDAO.deleteRecord(Integer.parseInt(reply));
			
			// redirect to Read servlet
			RequestDispatcher rd = request.getRequestDispatcher("/Read");
			rd.forward(request, response);
			
		} catch (Exception e) {
			String errorMessage = "Error occured when deleting a friend";
			PrintWriter out = response.getWriter();
			out.print("<p style='color: red'>" + errorMessage + "</p>");
		}
	}

}
