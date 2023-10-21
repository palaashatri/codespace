package Activity_13;
//mport com.mysql.jdbc.Driver;
import java.sql.*;
import java.util.Scanner;


public class JDBC_Activity {

    static final String url = "jdbc:mysql://localhost/jdbc_activity";
    static final String user = "root";
    static final String password = "1234";

    static Scanner sc = new Scanner(System.in);

    static void listEmployees(Connection con) throws SQLException{
        System.out.println("--- Displaying Employee List ---");

        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM employee;";
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()){
            System.out.print("ID : "+rs.getInt("employee_id"));
            System.out.print(", Name : "+rs.getString("employee_name"));
            System.out.print(", Date of Birth : "+rs.getDate("employee_dob") + "\n");
        }
    }


    static void addNewEmployee(Connection con) throws SQLException{
        System.out.println("--- Add New Employee ---");
        
        System.out.print("ID : ");
        int empID = sc.nextInt();
        sc.nextLine(); //digest \n

        System.out.print("Name : ");
        String empName = sc.nextLine();

        System.out.print("Date of Birth (YYYYMMDD): ");
        String empDOBStr = sc.nextLine();
        int empDOB = Integer.parseInt(empDOBStr);

        PreparedStatement stmt = con.prepareStatement("INSERT INTO employee VALUES(?,?,?)");
        stmt.setInt(1, empID);
        stmt.setString(2, empName);
        stmt.setInt(3, empDOB);

        stmt.executeUpdate();

        System.out.println("NEW EMPLOYEE ADDED SUCCESSFULLY!");

    }

    static void updateEmployee(Connection con) throws SQLException{
        Statement stmt = con.createStatement();
        System.out.println("--- Update Employee --- ");
        System.out.print("Insert Employee ID you want to update : ");
        int employee_id = sc.nextInt();
        String employee_name;
        String employee_dob_str;
        String sql;

        System.out.println("Enter field you want to update : \n1. Name\n2. Date of Birth");
        int choice = sc.nextInt();
        sc.nextLine();//digest
        switch(choice) {
            case 1: 
                System.out.print("New Name : ");
                employee_name = sc.nextLine();
                sql = "UPDATE employee SET employee_name = '"+employee_name+"' WHERE employee_id = '"+employee_id+"';";
                stmt.executeUpdate(sql);
            break;
            case 2 : 
                System.out.print("New Date of Birth (YYYYMMDD) : ");
                employee_dob_str = sc.nextLine();
                int employee_dob = Integer.parseInt(employee_dob_str);
                sql = "UPDATE employee SET employee_dob = '"+employee_dob+"' WHERE employee_id = '"+employee_id+"';";
                stmt.executeUpdate(sql);
            break;
            default : System.out.println("Invalid Choice. Program will exit");

            System.out.println("EMPLOYEE UPDATED SUCCESSFULLY!");
        }
    }

    static void removeEmployee(Connection con) throws SQLException{
        Statement stmt = con.createStatement();
        System.out.println("--- Remove Employee --- ");
        System.out.print("Insert Employee ID you want to remove : ");
        int employee_id = sc.nextInt();
        String sql = "DELETE FROM employee WHERE employee_id = '"+employee_id+"';";
        stmt.executeUpdate(sql);

        System.out.println("EMPLOYEE REMOVED SUCCESSFULLY!");
    }

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);            
            System.out.println("Welcome to Program. Please enter your choice : \n1. List All Employess\n2. Add New Employee\n3.Update Employee Details\n4. Remove Employee");
            int choice = sc.nextInt();
            switch(choice) {
                case 1 : listEmployees(con);
                break;
                case 2 : addNewEmployee(con);
                break;
                case 3 : updateEmployee(con);
                break;
                case 4 : removeEmployee(con);
                break;
                default : 
                System.out.println("Invalid Input. System will exit!");
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
            System.exit(0);
        }
    }
}
