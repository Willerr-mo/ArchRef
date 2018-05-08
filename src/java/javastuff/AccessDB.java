/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastuff;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author guill
 */
public class AccessDB {

    private Connection conexionBD;

    /**
     * Constructor private.
     */
    private AccessDB() {
        abrirConexionBD();
    }

    private void abrirConexionBD() {
        if (conexionBD == null) {
            String tablaConexionBD = "jdbc:mysql://localhost/omgdaw"; //Conexión con nuestra BD
            try {
                Class.forName("com.mysql.jdbc.Driver"); //El driver de mysql
                //Conexión teniendo en cuenta el usuario y clave de administrador de la BD
                conexionBD = DriverManager.getConnection(tablaConexionBD, "root", "");

            } catch (Exception e) {
                //Error en la conexión con la BD
                System.out.println("No se ha completado la peticion...");
            }
        }
    }
}
