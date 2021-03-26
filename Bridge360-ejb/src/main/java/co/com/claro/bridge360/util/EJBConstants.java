package co.com.claro.qdn.util;

/**
 *
 * @author lramiria
 * @author eloaizao
 * @author jaguilaa - everis
 * @author jbernalh - everis
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.1
 * @since 12/08/2018
 */
public class EJBConstants {

    public static final String EXCEPTION_GENERIC = "516";
    public static final String PERSISTENCE_EXCEPTION = "517";
    public static final String ILLEGAL_STATE_EXCEPTION = "518";
    public static final String QUERY_TIME_OUT_EXCEPTION = "519";
    public static final String TRANSACTION_REQUIRED_EXCEPTION = "520";
    public static final String PESSIMISTIC_LOCK_EXCEPTION = "521";
    public static final String LOCK_TIME_OUT_EXCEPTION = "522";
    public static final String ENTITY_EXISTS_EXCEPTION = "523";
    public static final String ILLEGAL_ARGUMENT_EXCEPTION = "524";

    //constantes parametrizacion usuario 
    public static final String ERROR_CORREO = "El correo no cumple con los "
            + "parametros necesarios";
    public static final String CORREO_IN_BD = "El correo ya existe en el"
            + " sistema";
    public static final String PARAM_CORREO = "@claro.com.co";

    // PARA ERRORES GLOBALES JPA, USO EXCLUSIVO PARA LOS ABSTRACT-DAO-FACADE.
    public static String ERROR_JPA_GLOBAL = "";
    public static final String ERROR_JPA_REPLACE
            = "Internal Exception: java.sql."
            + "SQLIntegrityConstraintViolationException: ";

    public static final String KEY_ERROR_JPA_SQL_EXCEPTION = "SQLException";
    public static final String KEY_ERROR_JPA_CONSTRAINT = "ORA-00001";
    public static final String GENERAR_BACKUP = "GENERAR_BACKUP";
    public static final String HORA_GENERACION_BACKUP = 
            "HORA_GENERACION_BACKUP";
    public static final String HORA_GENERACION_SICACON
            = "HORA_GENERACION_SICACON";
    public static final String HORA_INACTIVACION_REGISTROS
            = "HORA_INACTIVACION_REGISTROS";

    public static final String GENERAR_BACKUP_MENSAJE_NO_EXPORT
            = "Generacion del BACK_UP no realizado por parametro de "
            + "configuracion";
    public static final String GENERAR_BACKUP_MENSAJE_SI_EXPORT
            = "Generacion del BACK_UP realizada correctamente";
    public static final String GENERAR_BACKUP_LV_PARAM_ACCION_SI_EXPORT
            = "\n\tREALIZADO BACKUP LvParamAccion";
    public static final String GENERAR_BACKUP_LV_REGISTRO_LISTA_SI_EXPORT
            = "\n\tREALIZADO BACKUP LvRegistroLista";
    public static final String GENERAR_BACKUP_TRUE = "1";
    public static final String GENERAR_BACKUP_FALSE = "0";

    //PARA ERRORES GLOBALES JPA, USO EXCLUSIVO PARA LOS ABSTRACT-DAO-FACADE.
    public static final String NOMBRE_LISTA_CLIENTES = "CLIENTES";
    public static final String NOMBRE_LISTA_CORREOS = "CORREOS";
    public static final String NOMBRE_LISTA_LISTAS_BLANCAS = "CHEQUES";
    public static final String NOMBRE_LISTA_TELEFONOS = "TELEFONOS";
    public static final Long ESTADO_ACTIVO = 1l;
    public static final String ESTADO_ACTIVO_STRING_A = "A";

    // Errores en cargue masivo de listas
    public static final String IDENTIFICACION_ERROR
            = "Tipo de documento no existe o no está activo";
    public static final String NUM_DATA_INCORRECTA
            = "La cantidad de datos en el regitro no es la adecuada";
    public static final String LB_IDENTIFICADOR_NULL
            = "El campo numero de documento no es valido";
    public static final String LB_FECHA_FORMATO
            = "El formato de la fecha de vencimiento no es valido";
    public static final String LB_FECHA_ACTUAL 
            = "La fecha debe de ser mayor a la actual.";
    public static final String LB_ESTADO = "Estado no valido";
    public static final String LB_ESTADO_ACTIVO = "1";
    public static final String LB_ESTADO_INACTIVO = "0";
    public static final String REGISTRO_DUPLICADO = "Registro duplicado";
    public static final String CL_ID_MOTIVO_INCORRECTO
            = "El Id del motivo es incorrecto";
    public static final String CL_ID_MOTIVO_INEXISTENTE
            = "El Id del motivo no existe en la base de datos";
    public static final String TE_TELEFONO = "Numero de telefono no permitido";
    public static final String CORREO_NO_VALIDO = "El correo no es valido";
    public static final String VALIDA_CORREO
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+"
            + "(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static final String PTLUS_ESTADO_ACTIVO_CHAR = "A";
    public static final String PTLUS_ESTADO_INACTIVO_CHAR = "I";

    public static final String PTLUS_PORTAL_TOKEN_ESTADO_ACTIVO = "1";

    // Constantes para generacion de archivo CSV
    public static final Character CSV_SEPARATOR = ';';
    public static final String CHARACTER_CODIFICATION = "UTF-8";
    public static final String NAME_CSV = "NO_CHEQUES";
    public static final String NAME_CSV_CHEQUES = "CHEQUES";
    public static final String SEPARATOR_NAME_CSV = "_";
    public static final String EXT_NAME_CSV = ".csv";

    // Constantes para conexion FTP
    public static final String KEY_FTP_CONFIGURATION = "StrictHostKeyChecking";
    public static final String VALUE_FTP_CONFIGURATION = "no";
    public static final String IP_FTP_SERVER_CONNECTION = "IP_FTP_SERVIDOR";
    public static final String FOLDER_FTP_SERVER = "RUTA_ARCHIVO_FTP_LISTA";
    public static final String FOLDER_FTP_SERVER_CHEQUES = 
            "RUTA_ARCHIVO_FTP_LISTA_CHEQUES";
    public static final String USER_FTP_SERVER = "USUARIO_FTP";
    public static final String PASSWORD_FTP_SERVER = "CONTRASENA_FTP";
    public static final String CHANNEL_FTP_SERVER = "sftp";
    public static final int PORT_FTP_SERVER = 22;

    // Constantes para tarea actividades listas
    public static final long ID_LISTA_EXCLUDED_LV_REGISTRO_LISTA = 1;
    public static final String IP_FTP_SERVER_CONNECTION_LV_ACT_LISTA
            = "IP_FTP_ACT_LISTAS";
    public static final String FOLDER_FTP_SERVER_LV_ACT_LISTA
            = "RUTA_ARCHIVO_FTP_ACT";
    public static final String USER_FTP_SERVER_LV_ACT_LISTA = "USUARIO_FTP_ACT";
    public static final String PASSWORD_FTP_SERVER_LV_ACT_LISTA
            = "CONTRASENA_FTP_ACT";
    public static final int INDEX_ZERO = 0;
    public static final String FILE_NAME_LV_REGISTRO_LISTA = "Registros";
    public static final String FILE_NAME_LV_PARAM_ACCION = "Matriz";
    public static final String FILE_NAME_LV_ACCION = "Acciones";
    public static final String FILE_NAME_LV_CANAL = "Canales";
    public static final String FILE_NAME_LV_PROCESO = "Procesos";
    public static final String FILE_NAME_LV_MOTIVO = "Motivos";
    public static final int NUMBER_ONE = 1;
    public static final long INACTIVE_STATE = 0;
    public static final long ACTIVE_STATE = 1;

    // Constantes de encabezados tablas LV
    public static final String FIELD_ID_LISTA = "ID_LISTA";
    public static final String FIELD_ID_TIPO_LISTA = "ID_TIPO_LISTA";
    public static final String FIELD_ID_AREA = "ID_AREA";
    public static final String FIELD_NOMBRE = "NOMBRE";
    public static final String FIELD_USUARIO = "USUARIO";
    public static final String FIELD_ESTADO = "ESTADO";

    public static final String FIELD_LV_REGISTRO_LISTA_ID_REGISTRO
            = "ID_REGISTRO_LISTA";
    public static final String FIELD_LV_REGISTRO_LISTA_ID_LISTA = "ID_LISTA";
    public static final String FIELD_LV_REGISTRO_LISTA_ID_AREA = "ID_AREA";
    public static final String FIELD_LV_REGISTRO_LISTA_RESPONSABLE
            = "RESPONSABLE";
    public static final String FIELD_LV_REGISTRO_LISTA_SOLICITANTE
            = "SOLICITANTE";
    public static final String FIELD_LV_REGISTRO_LISTA_IDENTIFICADOR
            = "IDENTIFICADOR";
    public static final String FIELD_LV_REGISTRO_LISTA_DESCRIPCION
            = "DESCRIPCION";
    public static final String FIELD_LV_REGISTRO_LISTA_OBSERVACION
            = "OBSERVACION";
    public static final String FIELD_LV_REGISTRO_LISTA_ESTADO = "ESTADO";
    public static final String FIELD_LV_REGISTRO_LISTA_CAMPO1 = "CAMPO1";
    public static final String FIELD_LV_REGISTRO_LISTA_CAMPO2 = "CAMPO2";
    public static final String FIELD_LV_REGISTRO_LISTA_CAMPO3 = "CAMPO3";
    public static final String FIELD_LV_REGISTRO_LISTA_INGRESO = "INGRESO";
    public static final String FIELD_LV_REGISTRO_LISTA_VENCIMIENTO
            = "VENCIMIENTO";
    public static final String FIELD_LV_REGISTRO_LISTA_ID_MOTIVO = "ID_MOTIVO";
    public static final String FIELD_LV_REGISTRO_LISTA_ORIGEN = "ORIGEN";
    public static final String FIELD_LV_REGISTRO_LISTA_INICIO = "INICIO";
    public static final String FIELD_LV_REGISTRO_LISTA_NOMBRE_ARCHIVO
            = "NOMBRE_ARCHIVO";
    public static final String FIELD_LV_REGISTRO_LISTA_USUARIO_MOD
            = "USUARIO_MOD";
    public static final String FIELD_LV_REGISTRO_LISTA_FECHA_MOD = "FECHA_MOD";

    public static final String HEADER_RESPONSABLE = "RESPONSABLE";
    public static final String HEADER_SOLICITANTE = "SOLICITANTE";
    public static final String HEADER_IDENTIFICADOR = "IDENTIFICADOR";
    public static final String HEADER_DESCRIPCION = "DESCRIPCION";
    public static final String HEADER_OBSERVACION = "OBSERVACION";
    public static final String HEADER_CAMPOUNO = "CAMPO1";
    public static final String HEADER_CAMPODOS = "CAMPO2";
    public static final String HEADER_CAMPOTRES = "CAMPO3";
    public static final String HEADER_INGRESO = "INGRESO";
    public static final String HEADER_VENCIMIENTO = "VENCIMIENTO";
    public static final String HEADER_ID_MOTIVO = "ID_MOTIVO";
    public static final String HEADER_ORIGEN = "ORIGEN";
    public static final String HEADER_INICIO = "INICIO";
    public static final String HEADER_NOMBRE_ARCHIVO = "NOMBRE_ARCHIVO";
    public static final String HEADER_COD_MOTIVO = "COD_MOTIVO";
    public static final String HEADER_COD_ACCION = "COD_ACCION";
    public static final String HEADER_ID_PROCESO = "ID_PROCESO";
    public static final String HEADER_ID_CANAL = "ID_CANAL";
    public static final String HEADER_ID_ACCION = "ID_ACCION";

    //Constante para validación de perfil de usuario
    public static final String LV_PERFIL_NOMBRE = "CONSULTOR";

    public static final String ID_APP_LISTAS = "PTLUS_COD_LISTAS_VER_APP";

    // Constantes para conexión al servidor SFTP de CRC
    public static final String SFTP_CRC_SERVER = "SERVIDOR_SFTP_CRC";
    public static final String SFTP_CRC_USER = "USUARIO_SERVIDOR_SFTP_CRC";
    public static final String SFTP_CRC_PASSWORD = "CLAVE_SERVIDOR_SFTP_CRC";
    public static final String SFTP_CRC_PREFIJO_ARCHIVO_DOWNLOAD
            = "PREFIJO_ARCHIVO_CRC_DOWNLOAD";
    public static final String SFTP_CRC_PREFIJO_ARCHIVO_UPLOAD
            = "PREFIJO_ARCHIVO_CRC_UPLOAD";
    public static final String SFTP_CRC_RUTA_LLEGADA = "ARCHIVOS_CRC_LLEGADA";
    public static final String SFTP_CRC_RUTA_SALIDA = "ARCHIVOS_CRC_SALIDA";
    public static final String SFTP_CRC_RUTA_REMOTA_DOWNLOAD
            = "RUTA_CRC_REMOTA_DOWNLOAD";
    public static final String SFTP_CRC_RUTA_REMOTA_UPLOAD
            = "RUTA_CRC_REMOTA_UPLOAD";
    public static final String SFTP_CRC_PUERTO = "PUERTO_SERVIDOR_SFTP_CRC";
    public static final String SFTP_CHANNEL_CRC_SERVER = "sftp";
    public static final String SFTP_CRC_EMAIL_FROM = "DIRECCION_REMITENTE_CRC";
    public static final String SFTP_CRC_EMAIL_TO
            = "DIRECCIONES_DESTINATARIAS_CRC";
    public static final String SFTP_CRC_EMAIL_SUBJECT = "TITULO_EMAILS_CRC";
    public static final String SFTP_CRC_EMAIL_SMTP_SERVER = "HOST_SMPT_CRC";
    public static final String SFTP_CRC_EMAIL_SMTP_USER = "USUARIO_SMTP_CRC";
    public static final String SFTP_CRC_EMAIL_SMTP_PORT = "PUERTO_SMTP_CRC";
    public static final String SFTP_CRC_EMAIL_SMTP_PASSWORD = "CLAVE_SMTP_CRC";
    public static final String SFTP_CRC_EMAIL_SMTP_TLS
            = "HABILITAR_TLS_SMTP_CRC";
    public static final String SFTP_CRC_EMAIL_SMTP_AUTH
            = "HABILITAR_AUT_SMTP_CRC";
    public static final String SFTP_CRC_EXTENSION_ARCHIVOS = 
            "EXTENSION_ARCHIVO_CRC";
    public static final String MENSAJE_ENVIO_CRC = "MENSAJE";

    /******* URL SERVICIO TORRE DE CONTROL *****/
    public static final String URL_TORRE_CONTROL = "http://100.126.19.74:8091/WsInspiraCunServices/WsInspiraCunServices.svc?wsdl";
}
