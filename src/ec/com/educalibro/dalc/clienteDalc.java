package ec.com.educalibro.dalc;

import ec.com.edulibro.entidades.cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Vinicio Diaz.vinicioismael1694@gmail.com
 */

public class clienteDalc extends dalc{
    /**
     * Función que envia los datos para almacenarlos en la base de datos
     * @param c Clase cliente
     * @throws Exception captura el error y lo muestra
     */
    public  void registrar(cliente c) throws Exception{
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("INSERT INTO cliente(ruc,nombre,telefono) VALUES (?,?,?)");
            st.setString(1, c.getRUC());
            st.setString(2, c.getNombre());
            st.setString(3, c.getTelefono());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }        
    }
    
    /**
     * Retorna un listado de todos los clientes de la base de datos mediante una consulta
     * @return listado de objetos cliente
     * @throws Exception captura y muestra un error
     */
    public List<cliente> listar() throws Exception{
        List<cliente> lista;
        ResultSet rs;
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareCall("SELECT id, ruc,nombre,telefono FROM cliente");
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {             
                cliente c = new cliente();
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                c.setTelefono("telefono");
                c.setRUC(rs.getString("ruc"));
                
                lista.add(c);
            }
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return lista;
    }
}
