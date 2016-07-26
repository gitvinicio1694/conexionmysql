package ec.com.educalibro.dalc;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.print.DocFlavor;

/**
 *
 * @author Vinicio Diaz .vinicioismael1694@gmail.com
 */
public class dalc {
    private Connection cn;
    
    /**
     * Abre una conexión al motor de base de datos
    
     */
    public void Conectar() throws Exception{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Facturacion?user=root");
        } catch (Exception e) {
            throw e;
        }
    }
//    public void Conectar() throws Exception{
//        String  cadena = "jdbc:postgresql://localhost:5432/Facturacion";
//        String user = "postgres";
//        String pass = "postgres";
//                
//        try {
//            Class.forName("org.postgressql.Driver");
//            cn = DriverManager.getConnection(cadena,user,pass);
//            //"jdbc:postgresql://localhost:5432/Factura?user=root"
//        } catch (Exception e) {
//            throw e;
//        }
//    }
//    
    /**
     * Cierra las conexiones abiertas al motor de la base de datos
     * @throws Exception captura el error y lo muestra
     */
    public void Cerrar() throws Exception{
        try {
            if (cn != null) {
                if (cn.isClosed() == false) {
                    cn.close();
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }    
}
