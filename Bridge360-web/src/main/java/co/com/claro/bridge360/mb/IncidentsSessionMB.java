package co.com.claro.bridge360.mb;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean(name = "incidentSesionBean")
@SessionScoped
@ToString
public class IncidentsSessionMB implements Serializable {

    @Getter @Setter
    private List<String> parameters;

    @Getter @Setter
    private String urlDestiny;

    public IncidentsSessionMB() {
    }

    public IncidentsSessionMB(List<String> parameters, String urlDestiny) {
        this.parameters = parameters;
        this.urlDestiny = urlDestiny;
    }
}
