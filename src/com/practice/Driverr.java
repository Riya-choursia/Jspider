import org.example.Payement;

import java.sql.*;

public class Driverr {
    public static void main(String[]args) {
        //1st
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("loaded");
            //2nd
            Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/student","postgres","root");
            System.out.println("connection established");

              con.setAutoCommit(false);

            java.sql.Statement statement =con.createStatement();
            String sql1="INSERT into flight values(7432,'Air-Asia','BLR','BBSR')";


            statement.execute(sql1);

            String sql2="INSERT into passenger values(100,'Girish',21,5000)";
            statement.execute(sql2);

            String sql3="INSERT into passenger values(101,'Pujar',21,5000)";

            statement.execute(sql3);

            java.sql.Savepoint savepoint =con.setSavepoint();

            String sql4="INSERT into payement values(2341,'Girish',2,10000)";
            statement.execute(sql4);

            if (Payement.status()){
                con.commit();
                System.out.println("data saved!!");
            }
            else{
                con.rollback(savepoint);
                con.commit();
                System.out.println("payemnt fialed");
            }








//            DatabaseMetaData metaData=con.getMetaData();
//            System.out.println(metaData.getDatabaseProductName());
//            System.out.println(metaData.getDatabaseProductVersion());
//            System.out.println(metaData.getDriverName());
//            System.out.println(metaData.getDriverVersion());
            //3rd
           /* Statement stm=con.createStatement();
            System.out.println("statement created");
            //String sql="UPDATE student set age=22 where id=102";
            //4th
           /* int res=stm.executeUpdate(sql);
            System.out.println(res);
            if(res!=0){
                System.out.println("data is updated");
            }
            else{
                System.out.println("data not updated");
            }*/
           /* String sql="SELECT * from student";
            ResultSet res= stm.executeQuery(sql);
            while(res.next()){
              System.out.println(res.getInt(1));
                System.out.println(res.getString(2));
                System.out.println(res.getInt(3));
                System.out.println("==========================================");
            }*/
           /* String sql="update student set age=? where id=?";
            PreparedStatement pstm=con.prepareStatement(sql);
            pstm.setInt(1,21);
            pstm.setInt(2,201);*/
            String sql="select * from student";
//            java.sql.PreparedStatement pstm=con.prepareStatement(sql);
         PreparedStatement pstm=con.prepareStatement(sql);
           /* pstm.setInt(1,106);
            pstm.setString(2,"yanshi");
            pstm.setInt(3,19);
            pstm.addBatch();
            pstm.setInt(1,105);
            pstm.setString(2,"yanshu");
            pstm.setInt(3,18);
            pstm.addBatch();
            int arr[]=pstm.executeBatch();
            for(int i=0;i< arr.length;i++)
                System.out.println(arr[i]);*/
//            ResultSet resultSet=pstm.executeQuery();
//            ResultSetMetaData resultSetMetaData= resultSet.getMetaData();
//            System.out.println(resultSetMetaData.getColumnCount());
//            System.out.println(resultSetMetaData.getColumnName(1));
//            System.out.println(resultSetMetaData.getColumnName(2));
//            System.out.println(resultSetMetaData.getColumnName(3));
//            System.out.println(resultSetMetaData.getColumnType(1));


            //5th
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("driver loading failed");
            e.printStackTrace();
            // [it will print the reason of exception if occur.]
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
