package mail;

import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class selectAnimalServlet
 */
@WebServlet("/selectAnimalServlet")
public class selectAnimalServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {

		try {

			List<animalBean> beans = DAO.selectListAnimal();
			request.setAttribute("beans", beans);
			request.getRequestDispatcher("/animalCheck.jsp").forward(request, response);

		}

		catch (Throwable theException) {
			System.out.println(theException);
		}
	}
}
