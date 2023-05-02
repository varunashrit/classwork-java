package webapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.entities.Dealer;
import webapp.service.DealerService;
import webapp.service.DealerServiceImpl;

@WebServlet("/dealer")
public class DealerServlet extends HttpServlet{
	
	//http://localhost:8080/webapp/dealer
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		RequestDispatcher dispatcher =  req.getRequestDispatcher("dealerform.jsp");
		dispatcher.forward(req, resp);
		
	}
	
	//When I will submit the dealer form then the http request will come here and 
	protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
		
		Dealer dealer = new Dealer();
		dealer.setCity(request.getParameter("city"));
		dealer.setDealerName(request.getParameter("dealername"));
		DealerService dealerService = new DealerServiceImpl();
		Dealer dealr = dealerService.createDealer(dealer);
		
		RequestDispatcher dispatcher =  request.getRequestDispatcher("index.jsp");
		request.setAttribute("dealer",dealr);
		dispatcher.forward(request, response);
    }
	}
