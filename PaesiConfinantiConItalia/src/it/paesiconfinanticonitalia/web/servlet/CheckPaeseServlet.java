package it.paesiconfinanticonitalia.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.paesiconfinanticonitalia.model.Nazione;

@WebServlet("/CheckPaeseServlet")
public class CheckPaeseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CheckPaeseServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Nazione austria = new Nazione("Austria", "Vienna");
		Nazione francia = new Nazione("Francia", "Parigi");
		Nazione slovenia = new Nazione("Slovenia", "Lubiana");
		Nazione svizzera = new Nazione("Svizzera", "Berna");
		
		Nazione[] nazioniConfinanti = {austria, francia, slovenia, svizzera};
		
		ArrayList<Nazione> nazioni = new ArrayList<Nazione>();
		for (Nazione nazione : nazioniConfinanti) {
			nazioni.add(nazione);
		}
		String destinazione = null;
		
		Nazione nazioneInserita = new Nazione(request.getParameter("nazioneInserita"), request.getParameter("capitaleInserita"));
		if(nazioni.contains(nazioneInserita)) {
			destinazione ="giusto.jsp";
		} else {
			destinazione = "sbagliato.jsp";
		}
		request.setAttribute("nazioneInserita", nazioneInserita);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destinazione);
		requestDispatcher.forward(request, response);
	}

}
