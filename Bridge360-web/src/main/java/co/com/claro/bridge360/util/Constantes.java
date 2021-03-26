package co.com.claro.qdn.util;

/**
 *
 * @author mlievano
 * @author lramiria
 * @author imartipe-everis
 * @author acsantacb
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.4
 * @since 05/08/2018
 */
public final class Constantes {

    public static final String KEY_ERR_DESC = "KEY_ERR_DESC";
    public static final String CAMPO_VACIO_MOTIVO = "El campo : ID_MOTIVO va "
            + "vacio, en la linea : ";
    public static final String CAMPO_VACIO_COD_AREA
            = "El campo : CODIGO AREA va "
            + "vacio, en la linea : ";
    public static final String CAMPO_VACIO_TELEFONO = "El campo : TELEFONO va "
            + "vacio, en la linea : ";
    public static final String CAMPO_VACIO_TIPO_DOCUMENTO
            = "El campo : TIPO DOCUMENTO va "
            + "vacio, en la linea : ";
    public static final String CAMPO_VACIO_DOCUMENTO
            = "El campo : DOCUMENTO va "
            + "vacio, en la linea : ";
    public static final String CAMPO_VACIO_CORREO = "El campo "
            + ":CORREO  va vacio, en la linea : ";
    public static final String CAMPO_VACIO_OBSERVACION = "El campo "
            + ":OBSERVACION  va vacio, en la linea : ";
    public static final String CAMPO_VACIO_LISTA
            = "No ha seleccionado ningun tipo de lista";
    public static final String CAMPO_VACIO_ARCHIVO
            = "No ha seleccionado ningun archivo para cargar";
    public static final String ARCHIVO_CARGADO
            = "¡El Archivo fue cargado satisfactoriamente!";
    public static final String TIPO_ARCHIVO = "El tipo de archivo no es un CSV";
    public static final String ARCHIVO_VACIO
            = "El Archivo a cargar se encuentra vacio";
    public static final String ERROR_VACIO_FECHA_VEN
            = "¡La fecha : VENCIMIENTO va vacio en la linea : !";
    public static final String ERROR_VACIO_FECHA_INICIO
            = "¡La fecha : INICIO va vacio en la linea : !";
    public static final String ERROR_ESTRUCTURA_ARCHIVO
            = "¡La estructura del archivo no es la correcta!";
    public static final String ERROR_DESC_BASIO = "El campo descripcion va "
            + ":CORREO  va vacio, en la linea : ";
    public static final String ERROR = "Se ha presentado un error";
    public static final String ERROR_FECHA_INICIO
            = "¡La fecha de inicio no puede ser menor a la fecha de ingreso!";
    public static final String ERROR_FECHA_VEN
            = "¡La fecha de vencimiento no puede ser menor a la fecha actual!";
    public static final String EDITAR = "Se ha modificado el registro";
    public static final String ERROR_EDITAR = "No se ha modificado el registro";
    public static final String REGISTRO_TODOS = "Esta opcion no es valida";
    public static final String REGISTRO_DUPLICADO = "El registro ya existe.";
    public static final String CREAR = "Se ha creado el nuevo registro";
    public static final String ELIMINAR = "Se ha Eliminado el registro";
    public static final String MENSAJE_ERROR = "Se ha presentado un error";
    public static final String TIPO_DOC_NO_VALIDO
            = "Tipo de documento no valido en la linea: ";
    public static final String REGISTRO_EXISTE
            = "Este registro ya se ha ingresado";
    public static final String ERROR_FECHAS_IF
            = "¡La fecha fin no puede ser menor a la fecha de inicio!";
    public static final String ERROR_LISTA_SELECIONADA
            = "¡El tipo de lista selecionada ,no esta disponible para cargue "
            + "masivo!";
    public static final String COD_MOTIVO = "Este CodMotivo ya se encuentra "
            + "asignado a un motivo";
    public static final String COD_ACCION = "Este CodAccion ya se encuentra "
            + "asignado a una accion";
    public static final String COD_MOTIVO_RANGE = "El codMotivo debe estar "
            + "entre 1 y 2";
    public static final String COD_TIPODOC = "Este Codigo ya se encuentra "
            + "asignado a un tipo de documento";
    public static final String COD_CONSTANTES = "Este nombre ya se encuentra "
            + "asignado a una constante";
    public static final String ERR_PARAM_CORREO = "El correo no cumple con "
            + "los parametros establecidos";
    public static final String CORREO_IN_DB = "El correo ya existe en el "
            + "sistema";
    public static final String USUARIO_NO_EXISTE = "El Usuario no existe en "
            + "el sistema";
    public static final String CANAL_IN_DB = "La descripcion de canal ya "
            + "existe en el sistema";
    public static final String PARAM_IN_DB = "Los datos ya existen en el "
            + "sistema";
    public static final String LIST_ELIMINADO = "0";

    public static enum TIPO_REPORTE {

        DEFAULT(0),
        MATRIZ(1),
        REGISTROS_MARCADOS(2),
        LOGS(3),
        TIPO_DOC(4),
        LogUsuario(5),
        LOG_PARAMETRIZACION(6);

        private int value;

        TIPO_REPORTE(int value) {
            this.value = value;
        }

        public int getVal() {
            return this.value;
        }
    };

    public static final String REPORTE_MIME_CSV = "text/plain";
    public static final String REPORTE_GENERADO = "Reporte Generado "
            + "Correctamente";
    public static final String REPORTE_CABECERA_TIPO_DOCUMENTO = "identifcador"
            + "|codigo|descripcion|estado|fechaCreacion|usuarioCreacion|"
            + "usuarioModificacion|fechaModificacion"
            + System.getProperty("line.separator");
    public static final String REPORTE_CABECERA_MATRIZ = "idProceso|idCanal"
            + "|idMotivo|idAccion|estado|fechaCreacion|usuarioCreacion"
            + System.getProperty("line.separator");
    public static final String REPORTE_CABECERA_REGISTROS_MARCADOS
            = "No. Registro|Solicitante|Origen|Lista|Identificador|Observacion|"
            + "Estado|Campo1|Fecha de ingreso|Fecha de vencimiento|Motivo"
            + System.getProperty("line.separator");
    public static final String REPORTE_CABECERA_LOGS = "ID|NombreTabla|"
            + "Operacion|Solicitante|Identificador|Campo 1|Campo 2|Campo 3|"
            + "FechaVencimiento|Canal|Proceso|Motivo|Origen|UsuarioMod|"
            + "FechaIngreso|DireccionIP|Host"
            + System.getProperty("line.separator");
    public static final String REPORTE_CABECERA_LOGS_PARAM = "Nombre "
            + "Parametrizacion|Operacion|Nombre|Estado|Descripcion|Codigo|"
            + "Usuario|Fecha|Direccion Ip|Host"
            + System.getProperty("line.separator");
    public static final String REPORTE_CABECERA_LOG_USUARIOS = ""
            + "registro|correoUsuario|"
            + "fechaCreacionUsuario|fechaModificacion|estadoUsuario|"
            + "direccionIp|operacion|perfil|idLista \n";
    public static String PTLUS_ERROR_TIEMPO_INACTIVIDAD = "Tiempo de "
            + "inactividad no encontrado";
    public static String PTLUS_TIEMPO_INACTIVIDAD = "PTLUS_TIEMPO_INACTIVIDAD";
    public static String PTLUS_TIEMPO_VIDA_TOKEN = "PTLUS_TIEMPO_VIDA_TOKEN";
    public static String PTLUS_ERROR_TIEMPO_VIDA_TOKEN = "Tiempo de vida del "
            + "token no encontrado";
    public static String PTLUS_ERROR_INICIO_SESION = "Usuario o contraseña "
            + "no válidos";
    public static String PTLUS_ERROR_USUARIO_NO_EXISTE = ", usuario no activo";
    public static String PTLUS_ERROR_CAMPOS_VACIOS = "Usuario o contraseña "
            + "no pueden estar vacios";
    public static final String PTLUS_ERROR_WADL_WSPORTALUSUARIOS_REST
            = "WSDL de PortalUsuariosRest no encontrada";
    public static String WS_REST_WADL_URL = null;
    public static final String PTLUS_DESC_WADL_WSPORTALUSUARIOS_REST
            = "WS_PORTALUSUARIOS_REST";
    public static final String PTLUS_ERROR_WADL_VACIO
            = "LOG_WSPTLUS: WADL ES OBLIGATORIO";
    public static final String PTLUS_ERROR_USER_PASS_VACIO
            = "LOG_WSPTLUS: USUARIO y PASSWOR SON OBLIGATORIOS";
    public static final String PTLUS_WS_REST_PATH_AUTENTICA = "autentica";
    public static final String PTLUS_ERROR_TOKEN_VACIO
            = "LOG_WSPTLUS: EL TOKEN ES NECESARIO PARA CERRAR SESION";
    public static final String PTLUS_WS_REST_PATH_CERRAR_SESION
            = "cerrarSesion";
    public static final String WS_REST_SESION_TOKEN_CIERRE_EXITOSO
            = "SE HA INACTIVADO EL TOKEN EXITOSAMENTE";
    public static final String TIMER_TASK_EXPORT_DATA_LV_REGISTRO_LISTA
            = "GENERA_RESPALDO_LV_REGISTRO_LISTA";
    public static final String 
            TIMER_TASK_EXPORT_DATA_LV_REGISTRO_LISTA_HORA_BACKUP
            = "HORA_GENERACION_BACKUP_SICACON";
    public static final String TIMER_TASK_CRC_EXECUTION = "HORA_EJECUCION_CRC";
    public static final String LISTAS_PATTERN_NUMERIC = "[0-9]*";
    public static final String 
            TIMER_TASK_EXPORT_DATA_LV_TABLES_ACTIVITY_HORA_BACKUP
            = "HORA_GEN_BACKUP_ACT";
    public static final String TIMER_TASK_EXPORT_DATA_LV_TABLES_ACTIVITY
            = "GENERA_RESPALDO_LV_TABLES_ACTIVITY";
    public static final String CICLE_TASK_PROGRAM_LV_ACT_LISTA
            = "HORAS_TASKEJ_BACKUP_ACT";
    public static final int INDEX_ZERO = 0;
    public static final int HOURS_DAY = 24;
    public static final int INDEX_INIT_HOUR_RANGE = 0;
    public static final int INDEX_LIMIT_HOUR_RANGE = 23;
    public static String PTLUS_ERROR_ACCESO = "El usuario no tiene acceso "
            + "a esta aplicación";
    public static final String MENSAJE_ERROR_CARGUE_ARCHIVO = "No se ha podido realizar el cargue del archivo, "
                        + "por favor valide el archivo e intente nuevamente.";
    public static final String MENSAJE_EXITOSO_CARGUE_ARCHIVO = "Cargue exitoso. Se ha insertado {totalRegitros} de {aud}";
    
    /******** ACCIONES *********/
    public static final String ACCION_INSERTAR = "INSERT";
    public static final String ACCION_MODIFICAR = "UPDATE";
    public static final String ACCION_ELIMINAR = "DELETE";
    
}
