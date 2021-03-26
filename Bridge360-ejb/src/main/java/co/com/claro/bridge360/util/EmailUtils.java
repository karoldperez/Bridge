package co.com.claro.qdn.util;

import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

/**
 * Clase utilitaria para gestionar emails
 *
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 * @since 10/09/2018
 *
 */
public class EmailUtils {

    private String servidor;
    private int puerto;
    private String usuario;
    private String clave;
    private int tls;

    private Session session;
    //private Transport transport;
    private MimeMessage mimeMessage;

    private final static String NOMBRE_CLASE = EmailUtils.class.getName();

    /**
     * 
     * @param servidor
     * @param puerto
     * @param usuario
     * @param clave
     * @param tls 
     */
    public EmailUtils(String servidor, int puerto, String usuario,
            String clave, int tls) {
        this.servidor = servidor;
        this.puerto = puerto;
        this.usuario = usuario;
        this.clave = clave;
        this.tls = tls;
    }

    /**
     * 
     * @param servidor
     * @param puerto 
     */
    public EmailUtils(String servidor, int puerto) {
        this.servidor = servidor;
        this.puerto = puerto;
    }

    private void iniciarSesion() {
        Properties props = new Properties();
        props.put("mail.smtp.host", this.servidor);
        props.put("mail.smtp.port", this.puerto);
        if (this.usuario == null) {
            props.put("mail.smtp.auth", "false");
            props.put("mail.smtp.starttls.enable", "false");

            this.session = Session.getInstance(props, null);
        } else {
            props.put("mail.smtp.auth", "true");
            if (this.tls == 1) {
                props.put("mail.smtp.starttls.enable", true);
            } else {
                props.put("mail.smtp.starttls.enable", false);
            }

            final String usu = this.usuario;
            final String clv = this.clave;

            Authenticator auth = new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(usu, clv);
                }
            };

            this.session = Session.getInstance(props, auth);
        }
    }

    /**
     * 
     * @param to
     * @param from
     * @param subject
     * @param message
     * @return boolean
     */
    public boolean enviarEmail(String to, String from, String subject,
            String message) {
        boolean enviado = false;

        iniciarSesion();

        if (this.session == null) {
            return enviado;
        } else {
            this.mimeMessage = new MimeMessage(this.session);

            try {
                if (from.trim().equals("")) {
                    this.mimeMessage.setFrom(
                            new javax.mail.internet.InternetAddress(from));
                }

                String[] toMail = to.split(",");
                int i = 0;

                while (i < toMail.length) {
                    this.mimeMessage.addRecipient(Message.RecipientType.TO,
                            new javax.mail.internet.InternetAddress(toMail[i]));
                    Logger.getLogger(NOMBRE_CLASE)
                            .log(Level.INFO, "Enviando email sobre un error de "
                                    + "listas CRC a: " + toMail[i],
                                    "sendEmail");
                    i++;
                }

                this.mimeMessage.setSubject(subject);
                this.mimeMessage.setText(message);
                this.mimeMessage.setSentDate(new Date());
                Transport.send(this.mimeMessage, this.mimeMessage.
                        getAllRecipients());

                enviado = true;
            } catch (MessagingException ex) {
                Logger.getLogger(NOMBRE_CLASE)
                        .log(Level.SEVERE, null, "sendEmail: " + ex);
            }

            return enviado;
        }
    }
}
