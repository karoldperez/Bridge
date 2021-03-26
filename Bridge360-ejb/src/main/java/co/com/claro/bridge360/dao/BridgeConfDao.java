package co.com.claro.bridge360.dao;

import co.com.claro.bridge360.entity.BridgeConf;
import lombok.AllArgsConstructor;
import lombok.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.Date;


@Stateless
public class BridgeConfDao extends AbstractDao<BridgeConf> implements Serializable {

    @PersistenceContext
    EntityManager entityManager;

    @Getter @Setter
    private Long id;

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private String parametro;

    @Getter @Setter
    private String urlTest;

    @Getter @Setter
    private String urlReal;

    @Getter @Setter
    private String destino;

    @Getter @Setter
    private String usuarioMod;

    @Getter @Setter
    private Date fechaMod;



    public BridgeConfDao(){
        super(BridgeConf.class);
    }

    BridgeConfDao(EntityManager entityManager){
        super(BridgeConf.class);
        this.entityManager = entityManager;
    }


    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


}
