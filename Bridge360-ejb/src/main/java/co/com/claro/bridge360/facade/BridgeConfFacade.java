package co.com.claro.bridge360.facade;

import co.com.claro.bridge360.controller.BridgeConfController;
import co.com.claro.bridge360.entity.BridgeConf;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class BridgeConfFacade implements  BridgeConfIFacade, Serializable {
    private static final long serialVersionUID = 1L;

    @EJB
    BridgeConfController confController;


    @Override
    public void create(BridgeConf bridgeConf) {
        try {
            this.confController.create(bridgeConf);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void edit(BridgeConf bridgeConf) {
        try {
            this.confController.edit(bridgeConf);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(BridgeConf bridgeConf) {
        try {
            this.confController.delete(bridgeConf);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<BridgeConf> allBridgeConf() {
        List<BridgeConf> bridgeConfs = new ArrayList<>();
        try {
            bridgeConfs = this.confController.allBridgeConf();
        }catch (Exception e){
            e.printStackTrace();
        }
        return bridgeConfs;
    }

    @Override
    public BridgeConf bridgeConfByName(String nombre) {
        BridgeConf bridgeConf =  new BridgeConf();
        try {
            bridgeConf =this.confController.bridgeConfByName(nombre);
        }catch (Exception e){
            e.printStackTrace();
        }
        return bridgeConf;
    }
}
