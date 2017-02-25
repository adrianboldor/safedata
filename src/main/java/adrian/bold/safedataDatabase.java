package adrian.bold;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by fasttrackit on 2/25/2017.
 */
public class safedataDatabase {

    public List<String> getPolicies(String backupServer){

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

    public void insertPolicies(List<String> protectedServer, String backupServer){

        System.out.println("Inserting servers into DB");
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
            for (String server: protectedServer) {


                String query = "SELECT servers.protectedserver FROM servers WHERE backupserver LIKE '" + backupServer + "'";
                // 5. execute a query
                ResultSet rs = st.executeQuery(query);
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
