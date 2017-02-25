package adrian.bold;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import safedata.*;



//ZbyWPJBET1JB
//pgsql_user
//pgsql_safe
/**
 * Created by Tehnic3 on 2/12/2017.
 */
public class safedataAPI {
    @WebServiceRef(wsdlLocation="file:/E:/IntelliJp/safedata/src/main/java/safedata/view-source_safedata1.r1soft.ro_9080_Policy2_wsdl.wsdl")




    public List<String> getPolicies(String username, String password,String backupServer) {



        //System.out.println(username+"  "+password);
        List<Policy> policies = null;
        List<String> policyDescription = new LinkedList<String>();

        //PolicyService port;
        Policy_Service service = new Policy_Service();

        PolicyService port = service.getPolicyServiceImplPort();

        Map<String, Object> requestContext = ((BindingProvider) port).getRequestContext();

        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://" + backupServer + ":9080/Policy2?wsdl");

        //Map<String, List<String>> requestHeaders = new HashMap<String, List<String>>();

        requestContext.put(BindingProvider.USERNAME_PROPERTY, username);
        requestContext.put(BindingProvider.PASSWORD_PROPERTY, password);


        try {
            policies = port.getPolicies();
            System.out.println("Number of policies found:"+policies.size());
            for (int i=0; i<policies.size(); i++) {

                //System.out.println(policies.get(i).getName());
               String policyName = policies.get(i).getName();
               System.out.println(policyName);
                policyDescription.add(policyName);

                //System.out.println(policyDescription.get(i));
            }


        } catch (OperationFailedFault_Exception e) {
            e.printStackTrace();
        }

        return policyDescription;

    }


    public List<String> getPoliciesDB(String backupServer){

        System.out.println("Got request to show list from DB");
        List<String> serverList = new LinkedList<String>();

        try {
            Class.forName("org.postgresql.Driver");


            // 2. define connection params to db
            final String URL = "jdbc:postgresql://chef.revo.space/pgsql_safe";
            final String USERNAME = "pgsql_user";
            final String PASSWORD = "ZbyWPJBET1JB";

            // 3. obtain a connection
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // 4. create a query statement
            Statement st = conn.createStatement();

            String query = "SELECT servers.protectedserver FROM servers WHERE backupserver LIKE '"+backupServer+"'";
            // 5. execute a query
            ResultSet rs = st.executeQuery(query);

            while(rs.next()) {
                serverList.add(rs.getString("protectedserver"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    return serverList;

    }

}
