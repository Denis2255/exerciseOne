import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import value.Value;

@WebServlet("/main")
public class Servlet extends HttpServlet {
    private final static String index = "servlet1.jsp";

    private List<Value> values;

    @Override
    public void init() throws ServletException {
        values = new CopyOnWriteArrayList<>();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
        req.setAttribute("values", values);
        req.getRequestDispatcher(index).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF8");

        if (!requestIsValid(req)) {
            doGet(req, resp);
        }
        String word = req.getParameter("word");
        String row = req.getParameter("row");
        String column = req.getParameter("column");
        String bgcolor = req.getParameter("bgcolor");

        Value value = new Value(word, row, column, bgcolor);

        values.add(value);

        doGet(req, resp);
    }

    private boolean requestIsValid(final HttpServletRequest req) {

        String word = req.getParameter("word");
        String row = req.getParameter("row");
        String column = req.getParameter("column");
        String bgcolor = req.getParameter("row");

        return word != null && word.length() > 0 &&
                row != null && row.length() > 0 &&
                column != null && column.length() > 0 &&
                bgcolor != null && bgcolor.length() > 0;
    }
}