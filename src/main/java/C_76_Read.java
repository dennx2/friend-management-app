

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class C_76_Read
 */
@WebServlet("/Read")
public class C_76_Read extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	M_76_AddQuery addQueryDAO;
	
	public void init() {
    	this.addQueryDAO = new M_76_AddQuery();
    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
				
		try {
			
//			ResultSet rs = addQueryDAO.readData();
//			
////			while (rs.next()) {
////                int id = rs.getInt("friend_id");
////                String name = rs.getString("friend_name");
////                String email = rs.getString("email_addr");
////                int age = rs.getInt("age");
////                String color = rs.getString("favorite_color");
////                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
////            }
//			
//			request.setAttribute("rs", rs);
			
//			RequestDispatcher dispatcher = request.getRequestDispatcher("read.jsp");
//		    dispatcher.forward(request, response);
//		    
		    response.sendRedirect("read.jsp");

		    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Something wrong here at Read.java");
			e.printStackTrace();
		}
		
	}

}
