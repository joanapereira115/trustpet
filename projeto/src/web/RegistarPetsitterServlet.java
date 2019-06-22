package web;
import beans.FacadeBeans;
import org.json.JSONObject;
import org.orm.PersistentSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Map;

@WebServlet(name = "RegistarPetsitterServlet", urlPatterns = {"/RegistarPetsitter"})
public class RegistarPetsitterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        PersistentSession session = Util.getSession(request);
        JSONObject mensagem = new JSONObject();
        Map<String,String> parameters = Util.parseBody(request.getReader());

        Date date = Util.parseDate(parameters.get("data"));
        if(date==null) {
            mensagem.put("msg", "Introduza uma data válida");
            out.print(mensagem);
            out.flush();
            return;
        }

        boolean result = FacadeBeans.registarUtilizador(parameters.get("nome"), parameters.get("email"), date, parameters.get("contacto"), Boolean.parseBoolean(parameters.get("jardim")), parameters.get("morada"), parameters.get("password"), parameters.get("avatar"), "petsitter", parameters.get("concelho"), parameters.get("distrito"),session);
        if (result) {
            // TODO: redirecionar?
            mensagem.put("msg", "Registo de petsitter feito com sucesso.");
        } else {
            // TODO: redirecionar?
            mensagem.put("msg", "Erro no registo.");
        }
        out.print(mensagem);
        out.flush();
    }
}