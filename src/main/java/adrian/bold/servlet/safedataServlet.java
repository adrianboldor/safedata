package adrian.bold.servlet;

import adrian.bold.safedataAPI;
import adrian.bold.safedataDatabase;
import org.json.JSONObject;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by Tehnic3 on 2/12/2017.
 */
@WebServlet("/safeServlet")
public class safedataServlet extends HttpServlet {


    public void service(HttpServletRequest request, HttpServletResponse response) {


        String server = request.getParameter("server");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //System.out.println("password is"+password);

        System.out.println("got request to return servers on "+server+" ... ");

        safedataAPI apiObject = new safedataAPI();
        //safedataDatabase safedataDbObj = new safedataDatabase();
        JSONObject json = new JSONObject();

        json.put("server", server);
        json.put("policyDescription", apiObject.getPolicies(username,password,server));


        String result=json.toString();
        System.out.println("JSON response from API is"+result);
        returnJsonResponse(response, result);
        System.out.println("..."+server+" list sent ");


    }

    private void returnJsonResponse(HttpServletResponse response, String jsonResponse) {
        response.setContentType("application/json");
        PrintWriter pr = null;
        try {
            pr = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert pr != null;
        pr.write(jsonResponse);
        pr.close();
    }
}
