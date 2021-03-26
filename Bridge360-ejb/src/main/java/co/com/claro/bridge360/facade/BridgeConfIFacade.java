package co.com.claro.bridge360.facade;

import co.com.claro.bridge360.entity.BridgeConf;

import javax.ejb.Local;
import java.util.List;

@Local
public interface BridgeConfIFacade {

    void create(BridgeConf bridgeConf);

    void edit(BridgeConf bridgeConf);

    void delete(BridgeConf bridgeConf);

    List<BridgeConf> allBridgeConf();

    BridgeConf bridgeConfByName(String nombre);

}
