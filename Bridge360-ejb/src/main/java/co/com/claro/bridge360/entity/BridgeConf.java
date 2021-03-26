package co.com.claro.bridge360.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "BRIDGE_CONFIG")
@NamedQueries({
        @NamedQuery(name = "BridgeConf.findAll", query = "SELECT q FROM BridgeConf q")
        ,@NamedQuery(name = "BridgeConf.findByNombre", query = "SELECT q FROM BridgeConf q " +
        "WHERE q.nombre = :nombre")
})
public class BridgeConf implements Serializable {

    @Id
    @Column(name = "ID")
    @Getter @Setter
    private Long id;

    @Column(name = "NOMBRE")
    @Getter @Setter
    private String nombre;

    @Column(name = "PARAMETRO")
    @Getter @Setter
    private String parametro;

    @Column(name = "URLTEST")
    @Getter @Setter
    private String urlTest;

    @Column(name = "URLREAL")
    @Getter @Setter
    private String urlReal;

    @Column(name = "DESTINO")
    @Getter @Setter
    private String destino;

    @Column(name = "USUARIO_MOD")
    @Getter @Setter
    private String usuarioMod;

    @Column(name = "FECHA_MOD")
    @Getter @Setter
    private Date fechaMod;

}
