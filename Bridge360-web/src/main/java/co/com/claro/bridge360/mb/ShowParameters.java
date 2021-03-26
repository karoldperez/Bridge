package co.com.claro.bridge360.mb;

import co.com.claro.bridge360.entity.BridgeConf;
import co.com.claro.bridge360.facade.BridgeConfIFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedProperty;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@WebServlet("/paso.xhtml")
public class ShowParameters extends HttpServlet {

   /* @ManagedProperty(value = "#{inicioSesionBean}")
    private SessionMB pasoIMEIMB;*/

    @ManagedProperty(value = "#{incidentSesionBean}")
    private IncidentsSessionMB pasoIncidentsMB;

    @EJB
    private BridgeConfIFacade bridgeConfIFacade;

    public ShowParameters() {
    }
    public ShowParameters(IncidentsSessionMB pasoIncidentsMB) {
        this.pasoIncidentsMB = pasoIncidentsMB;
    }

    public IncidentsSessionMB getPasoIncidentsMB() {
        return pasoIncidentsMB;
    }

    public void setPasoIncidentsMB(IncidentsSessionMB pasoIncidentsMB) {
        this.pasoIncidentsMB = pasoIncidentsMB;
    }

    /*public SessionMB getPasoIMEIMB() {
        return pasoIMEIMB;
    }*/

/*    public void setPasoIMEIMB(SessionMB pasoIMEIMB) {
        this.pasoIMEIMB = pasoIMEIMB;
    }*/

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
    }

    /* @Override
     protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {
        if (pasoIMEIMB == null) {
            pasoIMEIMB = new SessionMB();
        }
        req.getParameterNames();
        getServletContext().setAttribute("inicioSesionBean", pasoIMEIMB);
        pasoIMEIMB.setIdUser(req.getParameter("idUser"));
        pasoIMEIMB.setMin(req.getParameter("min"));
        pasoIMEIMB.setDocumentType(req.getParameter("documentType"));

        String chanel = String.valueOf(req.getParameter("channelTypeCode"));
        pasoIMEIMB.setChannelTypeCode(chanel);

        pasoIMEIMB.setDocumentNumber(req.getParameter("documentNumber"));
        pasoIMEIMB.setSource(req.getParameter("source"));
        pasoIMEIMB.setIdHeader(req.getParameter("idHeader"));
        pasoIMEIMB.setIdTurn(req.getParameter("idTurn"));
        pasoIMEIMB.setAccount(req.getParameter("account"));
        pasoIMEIMB.setAddressId(req.getParameter("AddressId"));

        String valor = req.getParameter("urlReturn").toString();

        pasoIMEIMB.setUrlReturn(valor);
        pasoIMEIMB.setIdFlow(req.getQueryString());

        String idFlow = pasoIMEIMB.getIdFlow();
        BridgeConf consulta = new BridgeConf();
        consulta = this.bridgeConfIFacade.bridgeConfByName(idFlow);
        String UrlDestino = "";
        UrlDestino = consulta.getDestino().equals("T") ? consulta.getUrlReal() : consulta.getUrlTest();

        pasoIMEIMB.setUrlDestiny(UrlDestino);

        resp.sendRedirect("/Bridge360-web/secure/cargue/pasoPost.xhtml?" + req.getQueryString());
    }*/

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
