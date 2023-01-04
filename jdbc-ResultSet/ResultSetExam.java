
import java.sql.*;
public class ResultSetExam {
	
	public static void main(String [] args) {
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/record", "root", "len0v0@33214");
		
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		String query = "SELECT * FROM employee";
		
		ResultSet rs = st.executeQuery(query);
		
		// getting the record of the 2nd row
		rs.relative(4);
		
		System.out.println(rs.getInt(1)+" "+rs.getString(2) + " "+rs.getString(3) + " " + rs.getString(4));
		
	
		// returns the string value of column 2
		System.out.println(rs.getString(2));
		// returns the integer value of column 1
		System.out.println(rs.getInt(1));
				
		con.close();
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}

}
}