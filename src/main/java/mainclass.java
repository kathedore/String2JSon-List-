import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "mainclass", urlPatterns = "/mainclass")
public class mainclass extends HttpServlet {

    private String2JSon s2j = new String2JSon();

    public mainclass() throws IOException {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        List<MyRes> myres = new ArrayList<>();
        myres = s2j.getMyRes();
        Gson gson = new Gson();
        String response = gson.toJson(myres);

        PrintWriter pw = res.getWriter();
        res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        pw.write(response);
        pw.close();

    }
}
