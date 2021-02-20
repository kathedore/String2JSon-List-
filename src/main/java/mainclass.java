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
/*
        List<MyRes> myres = new ArrayList<>();
        myres = s2j.getMyRes();
        Gson gson = new Gson();
        String response = gson.toJson(myres);
*/
        String json = "{\n" +
                "   \"command\":\"DailyRapprt\",\n" +
                "   \"response\":\"Ok/WrongDateSpan/WrongScope/NoData\",\n" +
                "   \"ReportBody\":[\n" +
                "      {\n" +
                "         \"param1\":\"value1\",\n" +
                "         \"param2\":\"value2\",\n" +
                "         \"param3\":\"value3\",\n" +
                "         \"param8\":\"value8\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"param1\":\"value1\",\n" +
                "         \"param2\":\"value2\",\n" +
                "         \"param3\":\"value3\",\n" +
                "         \"param8\":\"value8\"\n" +
                "      }\n" +
                "   ]\n" +
                "}\n";
        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();

        PrintWriter pw = res.getWriter();
        res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        //pw.write(response);
        pw.write(String.valueOf(jsonObject));
        pw.close();

    }
}
