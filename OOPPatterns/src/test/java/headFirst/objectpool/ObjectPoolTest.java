package objectpool;

import java.sql.Connection;

public class ObjectPoolTest {
    public static void main(String args[]) {
        // Do something...

        // Create the ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.postgresql.Driver", "jdbc:postgresql://localhost:5432/BugTrackerBase",
                "postgres", "AhuleB2KS");

        // Get a connection:
        Connection con = pool.checkOut();

        // Use the connection

        // Return the connection:
        pool.checkIn(con);

    }
}
