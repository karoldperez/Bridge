package co.com.claro.bridge360.controller;

import co.com.claro.bridge360.dao.BridgeConfDao;
import co.com.claro.bridge360.entity.BridgeConf;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;


@Stateless
public class BridgeConfController {

    @PersistenceContext(unitName = "Bridge360")
    private EntityManager entityManager;

    @EJB
    BridgeConfDao bridgeConfDao;

    public void create(BridgeConf bridgeConf) {
        try {
            this.bridgeConfDao.setEntityManager(this.entityManager);
            this.bridgeConfDao.create(bridgeConf);
        } catch (Exception ex) {
            System.out.println("Error:" + ex.getMessage());
        }

    }

    public void edit(BridgeConf bridgeConf) {
        try {
            this.bridgeConfDao.setEntityManager(this.entityManager);
            this.bridgeConfDao.edit(bridgeConf);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void delete(BridgeConf bridgeConf) {
        try {
            this.bridgeConfDao.remove(this.entityManager.
                    merge(bridgeConf));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<BridgeConf> allBridgeConf(){
        List<BridgeConf> bridgeConfs = new ArrayList<>();
        try {
            bridgeConfs =  this.entityManager
                    .createNamedQuery("BridgeConf.findAll")
                    .getResultList();
        }catch (Exception e){
            e.printStackTrace();
        }
        return bridgeConfs;
    }

    public BridgeConf bridgeConfByName(String nombre){
        BridgeConf bridgeConf = new BridgeConf();
        try {
            bridgeConf = (BridgeConf) this.entityManager
                    .createNamedQuery("BridgeConf.findByNombre")
                    .setParameter("nombre",nombre)
                    .getSingleResult();
        }catch (Exception e){
            e.printStackTrace();
        }
        return bridgeConf;
    }
}
