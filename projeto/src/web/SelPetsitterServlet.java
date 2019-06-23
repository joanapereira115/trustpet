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
import java.util.Map;

@WebServlet(name = "SelPetsitterServlet", urlPatterns = {"/SelPetsitter"})
public class SelPetsitterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        PersistentSession session = Util.getSession(request);
        JSONObject mensagem = new JSONObject();
        JSONObject parameters = Util.parseBody(request.getReader());

        boolean result = FacadeBeans.concluirPedido((String) parameters.get("email"), (int) request.getSession().getAttribute("idPedido"), session);
        if (result) {
            // TODO: redirecionar?
            mensagem.put("msg", "Pedido registado com sucesso.");
        } else {
            // TODO: redirecionar?
            mensagem.put("msg", "Erro ao registar pedido.");
        }
        out.print(mensagem);
        out.flush();
    }
}