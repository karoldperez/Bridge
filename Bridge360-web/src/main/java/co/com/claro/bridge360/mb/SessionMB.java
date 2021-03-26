package co.com.claro.bridge360.mb;

import javax.faces.bean.*;
import javax.faces.event.PhaseListener;
import java.io.Serializable;

@ManagedBean(name = "inicioSesionBean")
@SessionScoped
public class SessionMB implements Serializable {

    private String idUser;
    private String min;
    private String channelTypeCode;
    private String documentType;
    private String documentNumber;
    private String source;
    private String idHeader;
    private String idTurn;
    private String account;
    private String urlReturn;
    private String urlDestiny;
    private String idFlow;
    private String AddressId;

    public SessionMB() {
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getChannelTypeCode() {
        return channelTypeCode;
    }

    public void setChannelTypeCode(String channelTypeCode) {
        this.channelTypeCode = channelTypeCode;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getIdHeader() {
        return idHeader;
    }

    public void setIdHeader(String idHeader) {
        this.idHeader = idHeader;
    }

    public String getIdTurn() {
        return idTurn;
    }

    public void setIdTurn(String idTurn) {
        this.idTurn = idTurn;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUrlReturn() {
        return urlReturn;
    }

    public void setUrlReturn(String urlReturn) {
        this.urlReturn = urlReturn;
    }

    public String getUrlDestiny() {
        return urlDestiny;
    }

    public void setUrlDestiny(String urlDestiny) {
        this.urlDestiny = urlDestiny;
    }

    public String getIdFlow() {
        return idFlow;
    }

    public void setIdFlow(String idFlow) {
        this.idFlow = idFlow;
    }

    public String getAddressId() {
        return AddressId;
    }

    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

}
