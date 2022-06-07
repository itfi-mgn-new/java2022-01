package lesson8;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try(final Connection	conn = DriverManager.getConnection(
									"jdbc:postgresql://localhost:5432/postgres",
									"postgres",
									"postgres")) {
			
			System.err.println("Connected");
			conn.setAutoCommit(true);
			
			DatabaseMetaData dbmd = conn.getMetaData();
			
			dbmd.getTables(null, null, "%", null);
			
			try(final Statement	stmt = conn.createStatement()) {
				stmt.executeUpdate("drop table test");
			} catch (SQLException exc) {
			}
			
			try(final Statement	stmt = conn.createStatement()) {
				stmt.executeUpdate("create table test(x integer, y text)");
				System.err.println("Created...");
				
				try(final PreparedStatement pstmt = conn.prepareStatement("insert into test(x,y) values (?,?)")) {
					pstmt.setInt(1, 100);
					pstmt.setString(2, "sto");
					pstmt.executeUpdate();
					pstmt.setInt(1, 200);
					pstmt.setString(2, "dvesti");
					pstmt.executeUpdate();
					pstmt.setInt(1, 300);
					pstmt.setString(2, "trista");
					pstmt.executeUpdate();
				}
//				stmt.executeUpdate("insert into test(x,y) values (100,'sto')");
//				stmt.executeUpdate("insert into test(x,y) values (200,'dvesti')");
//				stmt.executeUpdate("insert into test(x,y) values (300,'trista')");
				System.err.println("Inserted...");
				
				try(final ResultSet  rs	= stmt.executeQuery("select * from test")) {
					final ResultSetMetaData	rsmd = rs.getMetaData();
					
					for (int index = 1; index <= rsmd.getColumnCount(); index++) {
						System.err.println("COl["+index+"]="+rsmd.getColumnName(index));
					}
					
					while (rs.next()) {
						for (int index = 1; index <= rsmd.getColumnCount(); index++) {
							System.err.print(rsmd.getColumnName(index)+"="+rs.getObject(index));
						}
						System.err.println();
						
//						System.err.println("X="+rs.getInt(1)+",Y="+rs.getString(2));
					}
				}
			}
		}
	}
}
