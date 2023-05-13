

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class C_76_Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	M_76_AddQuery addQueryDAO;

	public void init() {
    	this.addQueryDAO = new M_76_AddQuery();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// create a friend model to save friend's information
		M_76_Friends friendModel = new M_76_Friends();
		friendModel.setFriendName(request.getParameter("fname"));
		friendModel.setEmailAddr(request.getParameter("email"));
		
		// perform data validation: age must be integer
		try {
			int ageParsed = Integer.parseInt(request.getParameter("age"));
			friendModel.setAge(ageParsed);
		} catch (Exception e) {
			
			String errorMessage = "Age must be an integer";
			PrintWriter out = response.getWriter();
			out.print("<p style='color: red'>" + errorMessage + "</p>");
			return;
		}		
		
		friendModel.setFavoriteColor(request.getParameter("favcolor"));
		
		
		// add new friend's information to database
		try {
			addQueryDAO.addNewFriend(friendModel);
			// redirect to Read servlet
			RequestDispatcher rd = request.getRequestDispatcher("/Read");
			rd.forward(request, response);
			
		} catch (Exception e) {
			String errorMessage = "Error occured when adding a new friend";
			PrintWriter out = response.getWriter();
			out.print("<p style='color: red'>" + errorMessage + "</p>");
		}
		
		
		
		
		
		
	}

}
