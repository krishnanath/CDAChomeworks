import java.io.*;

public class Writer {
    public static void main(String[] args) {

        try {
            String source = "If len is zero, then no bytes are read and 0 is returned; otherwise, there is an attempt to read at least one byte. If no byte is available because the stream is at end of file, the value -1 is returned; otherwise, at least one byte is read and stored into b.";
            char cbuf[] = new char[source.length()];
            source.getChar(0, source.length(), cbuf, 0);
            FileWriter fw = new FileWriter("Hello.txt");
            for (int i = 0; i < cbuf.length; i += 2) {
                fw.write(cbuf[i]);

            }
            FileWriter f1 = new FileWriter("Hello.txt");
            f1.write(cbuf);
        } catch (IOException e) {

        }
    }
}

/// mysql

import java.sql.*;

public class JdbcTest {

    public static void main(String[] args) throws SQLException {

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        String dbUrl = "jdbc:mysql://localhost:3306/demo";
        String user = "student";
        String pass = "student";

        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection(dbUrl, user, pass);

            System.out.println("Database connection successful!\n");

            // 2. Create a statement
            myStmt = myConn.createStatement();

            System.out.println("BEFORE UPDATE");

            // displayEmployee(myConn, "Krishnanath", "Maly");
            //
            // int rowsAffected = myStmt.executeUpdate(
            // "update employees"+
            // "set email='krishna@gmail.com' " + "where last_name='anj' and
            // first_name='lost' ");

            // Insert a new employee

            System.out.println("Inserting a new employee to db \n");

            int rowsAffected = myStmt
                    .executeUpdate("insert into employees" + "(last_name, first_name, email, department, salary)"
                            + "values" + "('Maly', 'Krishnanath', 'maly@gmail.com', 'CEO', 888888.88)");

            // 3. Execute SQL query
            myRs = myStmt.executeQuery("select * from employees");

            // 4. Process the result set
            while (myRs.next()) {
                System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (myRs != null) {
                myRs.close();
            }

            if (myStmt != null) {
                myStmt.close();
            }

            if (myConn != null) {
                myConn.close();
            }
        }
    }

}
