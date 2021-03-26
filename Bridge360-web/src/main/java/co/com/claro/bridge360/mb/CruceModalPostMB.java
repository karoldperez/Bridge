package co.com.claro.bridge360.mb;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ManagedBean(name = "CruceModalPost")
@ViewScoped
public class CruceModalPostMB implements Serializable {

    private String listData;

    private String urlDestiny;

    @ManagedProperty(value = "#{incidentSesionBean}")
    private IncidentsSessionMB pasoIncidentsMB;

    public CruceModalPostMB() {
    }

    public String getListData() {
        return listData;
    }

    public void setListData(String listData) {
        this.listData = listData;
    }

    public String getUrlDestiny() {
        return urlDestiny;
    }

    public void setUrlDestiny(String urlDestiny) {
        this.urlDestiny = urlDestiny;
    }

    public IncidentsSessionMB getPasoIncidentsMB() {
        return pasoIncidentsMB;
    }

    public void setPasoIncidentsMB(IncidentsSessionMB pasoIncidentsMB) {
        this.pasoIncidentsMB = pasoIncidentsMB;
    }


    @PostConstruct
    public void inicializar(){
        System.out.println("start data ");
        listData = "";
        for (int i =0 ;i < pasoIncidentsMB.getParameters().size() ; i++ ) {
            listData += pasoIncidentsMB.getParameters().get(i) ;
            if (i == (pasoIncidentsMB.getParameters().size() -1) ) {
                listData += "";
            }else {
                listData += ",";
            }
        }
        urlDestiny = pasoIncidentsMB.getUrlDestiny();
    }

}
