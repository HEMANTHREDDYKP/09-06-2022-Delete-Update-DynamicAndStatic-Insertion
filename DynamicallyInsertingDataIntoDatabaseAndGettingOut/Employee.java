package jdbc;
// in jdbc first u need to create an java project
/*and then u  need to add jar files and then 
 * by following the five rules establish the connection
 * 1.Class.forName("pass here the fully qualified name of driver"),
 * 2.establish connection ,here we need to set the url,username,password   
 * 3. create statement object while ur inserting statically
 * 3.a. create Prepared statement object if ur inserting dynamically
 * 4.for static insertion statement.execute(query)
 * 4.a. for dynamic insertion preparedStatement.execute()
 * 5. connection.close()*/
public class Employee {
                              //class with getter and setter methods
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
