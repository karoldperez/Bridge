package co.com.claro.bridge360.mb;

import co.com.claro.bridge360.entity.BridgeConf;
import co.com.claro.bridge360.facade.BridgeConfIFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedProperty;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@WebServlet("cruceModal.xhtml")
public class ShowParametersIncidents extends HttpServlet {

    @EJB
    BridgeConfIFacade bridgeConfIFacade;

    @ManagedProperty(value = "#{incidentSesionBean}")
    private IncidentsSessionMB pasoIncidentsMB;

    public ShowParametersIncidents() {
    }

    public ShowParametersIncidents(IncidentsSessionMB pasoIncidentsMB) {
        this.pasoIncidentsMB = pasoIncidentsMB;
    }

    public IncidentsSessionMB getPasoIncidentsMB() {
        return pasoIncidentsMB;
    }

    public void setPasoIncidentsMB(IncidentsSessionMB pasoIncidentsMB) {
        this.pasoIncidentsMB = pasoIncidentsMB;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        //super.doPost(req, resp);
        try {
            if (pasoIncidentsMB == null) {
                pasoIncidentsMB = new IncidentsSessionMB();
            }
            getServletContext().setAttribute("incidentSesionBean", pasoIncidentsMB);
            Enumeration<String> params = req.getParameterNames();
            List<String> data = new ArrayList<>();
            while (params.hasMoreElements()) {
                String param = params.nextElement();

                String elementos = param + ":" + req.getParameter(param);
                if (param.equals("urlReturn")) {
                    elementos = "";
                    elementos = param + ":" + URLEncoder.encode(req.getParameter(param),
                            StandardCharsets.UTF_8.toString());
                }
                if (req.getParameter(param) != null && !"".equals(req.getParameter(param))) {
                    data.add(elementos);
                }
            }
            BridgeConf consulta = new BridgeConf();
            consulta = this.bridgeConfIFacade.bridgeConfByName(req.getQueryString());
            String UrlDestino = "";
            UrlDestino = consulta.getDestino().equals("T") ? consulta.getUrlReal() : consulta.getUrlTest();
            pasoIncidentsMB.setParameters(data);
            pasoIncidentsMB.setUrlDestiny(UrlDestino);
            resp.sendRedirect("/Bridge360-web/secure/cargue/cruceModalPost.xhtml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
