package co.com.claro.qdn.util;

import java.io.IOException;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;

/**
 *
 * @author acastanv
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 */
public class JSFUtil {

    private static Logger logger
            = Logger.getLogger(JSFUtil.class.getName());

    public static void redirectPage(String url) {
        try {
            String urlRedirect = String.valueOf(FacesContext
                    .getCurrentInstance().getExternalContext()
                    .getRequestContextPath());
            urlRedirect += url;
            FacesContext.getCurrentInstance().getExternalContext()
                    .redirect(urlRedirect);
        } catch (IOException ex) {

        }
    }

    /**
     *
     * @param page
     * @return String
     */
    public static String refresh(String page) {
        return page + "?faces-redirect=true";
    }

    /**
     *
     * @param str
     * @return boolean
     */
    public static boolean isNull(String str) {
        return !(str != null && (!str.equals("")));
    }

}
