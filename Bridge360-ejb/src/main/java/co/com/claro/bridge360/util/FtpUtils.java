package co.com.claro.qdn.util;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 * @since 10/09/2018
 *
 */
public class FtpUtils {

    private final static String NOMBRE_CLASE = FtpUtils.class.getName();

    public FtpUtils() {
    }

    /**
     * 
     * @param servidor
     * @param puerto
     * @param usuario
     * @param clave
     * @return 
     */
    public ChannelSftp connect(String servidor, int puerto, String usuario,
            String clave) {
        Session session;
        Channel channel;
        ChannelSftp channelSftp = null;

        if ((servidor.equals("")) || (puerto == 0) || (usuario.equals(""))
                || (clave.equals(""))) {
            return null;
        } else {
            try {

                JSch jsch = new JSch();
                session = jsch.getSession(usuario, servidor, puerto);
                session.setPassword(clave);
                java.util.Properties config = new java.util.Properties();
                config.put(EJBConstants.KEY_FTP_CONFIGURATION,
                        EJBConstants.VALUE_FTP_CONFIGURATION);
                session.setConfig(config);
                session.connect();

                channel = session.openChannel(EJBConstants.CHANNEL_FTP_SERVER);

                Logger.getLogger(NOMBRE_CLASE)
                        .log(Level.INFO, "Conectado al servidor FTP "
                                + servidor, "connect");

                channel.connect();

                channelSftp = (ChannelSftp) channel;
            } catch (JSchException ex) {
                Logger.getLogger(NOMBRE_CLASE)
                        .log(Level.SEVERE, null,
                                "connect: " + ex);
            }
        }

        return channelSftp;
    }

    /**
     * 
     * @param canal
     * @param rutaRemota
     * @param rutaLocal
     * @param archivo
     * @return 
     */
    public boolean downloadFile(ChannelSftp canal, String rutaRemota,
            String rutaLocal, String archivo) {
        boolean descargado = false;

        try {
            canal.cd(rutaRemota);
            canal.lcd(rutaLocal);
            canal.get(archivo, archivo);
            descargado = true;
        } catch (SftpException ex) {
            Logger.getLogger(NOMBRE_CLASE)
                    .log(Level.SEVERE, null, "downloadFile: "
                            + ex);
        }
        return descargado;
    }

    /**
     * 
     * @param canal
     * @param rutaRemota
     * @param rutaLocal
     * @param archivo
     * @return 
     */
    public boolean uploadFile(ChannelSftp canal, String rutaRemota, 
            String rutaLocal, String archivo) {
        boolean descargado = false;

        try {
            canal.cd(rutaRemota);
            canal.lcd(rutaLocal);
            canal.put(archivo, archivo);
            descargado = true;
        } catch (SftpException ex) {
            Logger.getLogger(NOMBRE_CLASE)
                    .log(Level.SEVERE, null, "uploadFile: "
                            + ex);
        }
        return descargado;
    }
}
