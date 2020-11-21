package co.ufps.edu.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.ufps.edu.dao.ClienteDao;
import co.ufps.edu.model.Cliente;

/**
 * Servlet implementation class ClienteController
 */
@WebServlet("/ClienteController")
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		switch(action) {
		case "new":
			showNewForm(request, response);
			break;
		case "insert":
			insertarCliente(request, response);
			break;
		case "delete":
			eliminarCliente(request, response);
			break;
		
		case "update":
			actualizarCliente(request, response);
			break;
		
		default:
			listCliente(request,response);	
				
		}
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("registro-clientes.jsp");
		dispatcher.forward(request, response);
		
	}

	private void insertarCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cliente cliente=new Cliente();
		cliente.setClave(request.getParameter("pass"));
		cliente.setEmail(request.getParameter("email"));
		cliente.setNombre(request.getParameter("nombre"));
		
		ClienteDao cDao=new ClienteDao();
		cDao.insert(cliente);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
		
		
		
	}

	private void eliminarCliente(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}


	private void actualizarCliente(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void listCliente(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
