package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import Project1DAO.UserModelDAOImplOJDBC;

/**
 * Servlet implementation class ViewAll
 */
public class ViewAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAll() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserModelDAOImplOJDBC user = new UserModelDAOImplOJDBC();
		System.out.println(user.getAllEmployees());
			
		ObjectMapper om = new ObjectMapper();
		om.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		// proactively check to see if user is null
		String jsonRepUser = user.getAllEmployees() == null ? "null" : om.writeValueAsString(user.getAllEmployees());

		// setting the content type tells a browser (or anything else) what to expect
		// in the body of the response. It's better to be safe and specify when you're
		// not just sending text
		response.setContentType("application/json");
		response.getWriter().write(jsonRepUser);
		Logger log = Logger.getLogger(LoginServlet.class);
		log.trace("JSON representation: " + jsonRepUser);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
