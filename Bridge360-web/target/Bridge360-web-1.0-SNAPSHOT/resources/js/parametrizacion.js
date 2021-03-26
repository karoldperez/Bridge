/*
 * imartipe@everis
 */
/* global modalOperationProgress, modalEditEnd, jsf, modalEdit, modalDeleteEnd, modal, modalCreateEnd, modalError, data */

$(document).ready(function () {
    $(window).keydown(function (event) {
        if (event.keyCode == 13) {
            event.preventDefault();
            return false;
        }
    });
});

//Menú vertical
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
    //document.getElementById("contenido").style.marginLeft = "250px";
    /*
     * cgordilg 19-01-2018
     */
    $(document).ready(function () {
        $(".fadeDiv").show('swing');
        $("#navMenu").show('swing');
        $(".closebtn").show('swing');
        $('#mySidenav').show();
        $('.dataTables_wrapper').css({"z-index": "-1"});
        $('.glyphicon-calendar').css({position: 'relative', "color": "white"});

    });
    /*
     *  Fin cgordilg 19-01-2018
     */
}

function closeNav() {
    /*
     * cgordilg 19-01-2018
     */
    $(document).ready(function () {
        $(".fadeDiv").hide('swing');
        $("#navMenu").hide('swing');
        $(".closebtn").hide('swing');
        $('#mySidenav').hide();
        $('.dataTables_wrapper').css({"z-index": "0"});
        $('.glyphicon-calendar').css({"color": "black"});

    });
    document.getElementById("mySidenav").style.width = "0";
    document.getElementById("contenido").style.marginLeft = "0";
    document.body.style.backgroundColor = "white";
    /*
     *  Fin cgordilg 19-01-2018
     */
}

function openBackGround()
{
    $(document).ready(function () {
        $(".fadeDiv").show('swing');
        $('.dataTables_wrapper').css({"z-index": "-1"});
    });
}

function hideBackground()
{
    $(document).ready(function () {
        $(".fadeDiv").hide('swing');
        $('.dataTables_wrapper').css({"z-index": "0"});
    });
    document.body.style.backgroundColor = "white";
}

//-----------
function parametrizacionDialogModal(idObj, title, fnClose)
{
    $(idObj).dialog
            (
                    {
                        modal: true,
                        title: title,
                        resizable: false,
                        buttons:
                                {
                                    Cerrar: function ()
                                    {
                                        if (fnClose !== undefined)
                                            fnClose();
                                        $(this).dialog("destroy");
                                    }
                                }
                    }
            );
}

/**
 * 
 * @param {type} idObj
 * @param {type} title
 * @param {type} fnClose
 * @returns {undefined}
 * acastanv@everis
 */
function opsDialogModalReload(idObj, title, fnClose)
{
    $(idObj).dialog
            (
                    {
                        modal: true,
                        title: title,
                        resizable: false,
                        buttons:
                                {
                                    Cerrar: function ()
                                    {
                                        if (fnClose !== undefined)
                                            fnClose();
                                        window.location.reload();
                                        $(this).dialog("destroy");
                                    }
                                }
                    }
            );
}

/**
 * 
 * @param {type} idObj
 * @param {type} title
 * @param {type} fnClose
 * @returns {undefined}
 * cgordilg 24-01-2018
 */
function opsDialogModalEdit(idObj, title, fnClose)
{

    $(idObj).dialog
            (
                    {
                        modal: true,
                        title: title,
                        resizable: false,
                        width: 1400,
                        height: 360,
                        buttons:
                                {
//                Cancelar: function ()
//                {
//                    if(fnClose !== undefined)
//                        fnClose();
//                    /*window.location.reload();*/
//                    $(this).dialog("destroy");
//                }
                                }
                    }
            );
    $(idObj).siblings('div.ui-dialog-titlebar').remove();
    $(idObj).siblings('.ui-widget-overlay').css({"border": "4px solid #a71010"});
}

//$(window).load(function () {
// jsf.ajax.addOnEvent(function(data) {
//  if (data.status === 'success') {
//      $.datepicker.setDefaults({
//        dateFormat: "dd/mm/yy"
//    });
//       $(".Fecha").datepicker({
//             dateFormat: "dd/mm/yy"
//        });     
//        }
// });
//});

function habilitarCalendar(id)
{
    jQuery(document).ready(function ($) {
//        $("#" + id).datepicker({
//            dateFormat: "dd/mm/yy"}).val();
//        $(".Fecha").datepicker({
//            dateFormat: "dd/mm/yy"}).val();  

        $(document).on('mouseover', '.Fecha', function () {
            $(this).datepicker({
                dateFormat: "dd/mm/yy"
            });
        });

//        $("#FechaInicioL").datepicker({
//            dateFormat: "dd/mm/yy"}).val();
//
//        $("#FechaVenceL").datepicker({
//            dateFormat: "dd/mm/yy"}).val();
//
//        $("#ingresoL").datepicker({
//            dateFormat: "dd/mm/yy"}).val();
////        dserrato
//        $("#FechaInicio").datepicker({
//            dateFormat: "dd/mm/yy"}).val();
//        $("#FechaVence").datepicker({
//            dateFormat: "dd/mm/yy"}).val();
//        $("#FechaInicioEd").datepicker({
//            dateFormat: "dd/mm/yy"}).val();
//        $("#FechaVenceEd").datepicker({
//            dateFormat: "dd/mm/yy"}).val();
//        $("#FechaInicioEd").datepicker({
//            dateFormat: "dd/mm/yy"}).val();
//        $("#FechaVenceEd").datepicker({
//            dateFormat: "dd/mm/yy"}).val();

    });
}

function initFecha()
{
    jQuery(document).ready(function ($) {
        $("#fecInicio").datepicker({
            dateFormat: "dd/mm/yy"}).val();

        $("#fecFin").datepicker({
            dateFormat: "dd/mm/yy"}).val();

    });
}


function opsDialogModalRemove(idObj, title, fnClose)
{
    $(idObj).dialog
            (
                    {
                        modal: true,
                        title: title,
                        resizable: false,
                        width: 400,
                        height: 250,
                        buttons:
                                {
                                }
                    }
            );
    $(idObj).siblings('div.ui-dialog-titlebar').remove();
    $(idObj).siblings('.ui-widget-overlay').css({"border": "4px solid #a71010"});
}

function cerrarPopUp(idObj, title, fnClose)
{
    $(idObj).dialog
            (
                    );
    if (fnClose !== undefined)
        fnClose();
    /*window.location.reload();*/
    $(idObj).dialog("destroy");
    if (idObj)
        hideBackground();
}
/*
 * Fin cgordilg 24-01-2018
 */

function parametrizacionDialogModalLoading(idObj, title)
{
    $(idObj).dialog
            (
                    {
                        modal: true,
                        title: title,
                        closeOnEscape: false,
                        draggable: false,
                        resizable: false,
                        open: function (event, ui)
                        {
                            $(".ui-dialog-titlebar-close", ui.dialog | ui).hide();
                        }
                    }
            );
}

function allCheck(idCheck, estado)
{
    if (estado === undefined)
    {
        estado = $(idCheck).prop('checked');
    }

    $(':checkbox').prop('checked', estado);
}

function selectAllCheck(idCheck)
{
    allCheck(idCheck, true);
}

function unSelectAllCheck(idCheck)
{
    allCheck(idCheck, false);
}

function documentRun(fnRun)
{
    $(document).ready
            (
                    fnRun
                    );
}

/*imartipe - stackoverflow*/
function checkWithValue(val, strSeparator, fnClear)
{
    if (strSeparator !== undefined)
    {
        arr = val.split(strSeparator);

        $.each
                (
                        arr,
                        function (index, value)
                        {
                            $(":checkbox").filter
                                    (
                                            function ()
                                            {
                                                return this.value === value;
                                            }
                                    ).prop("checked", "true");
                        }
                );
    } else
    {
        $(":checkbox").filter
                (
                        function ()
                        {
                            return this.value === val;
                        }
                ).prop("checked", "true");
    }

    if (fnClear !== undefined)
        fnClear;
}

//imartpe@everis.com
function listBoxGetAllItem(idListBox)
{
    return $(idListBox + ' option').map
            (
                    function ()
                    {
                        return this.value;
                    }
            ).get();
}

//imartpe@everis.com
function listBoxExistValue(idListBox, valOption)
{
    if (valOption == "")
        return false;
    return 0 !== $(idListBox + ' option[value=' + valOption + ']').length;
}

//imartipe
function listBoxCountItems(idListBox)
{
    return $(idListBox + ' option').length;
}

function listBoxSelectItem(idListBox, index)
{
    if (index === undefined)
        $(idListBox)[0].selectedIndex = 0;
    else
        $(idListBox)[0].selectedIndex = index;
}

function listBoxAddItem(idListBox, data)
{
    $(idListBox).append(data);
}

function listBoxDelSelectItem(idListBox)
{
    $(idListBox + ' option:selected').remove();
}

/*
 * imartipe@everis.com
 * Ayuda a escribir los menus
 **/
function docAdd(text)
{
    document.writeln(text);
}

/**
 * 
 * @param {string} idMenu
 * @param {optional string} idDiv
 * @returns {mNew} El elemento para trabajar con el menu y agregar items
 */
function mNew(idMenu, idDiv)
{
    this.idDiv = idDiv;
    this.menuId = "#" + idMenu;
    docAdd("<div " + ((idDiv !== undefined) ? "id='" + idDiv + "'" : "") + ">");
    docAdd("<ul class='menuParametrizacion' id='" + idMenu + "'>");
    docAdd("</ul>");
    docAdd("</div>");

    return this;
}

/**
 * 
 * @param {mNew|string} menu The return value of {mNew} or {id} of one submenu
 * @param {string} text Text of menu item
 * @param {optional string} idSubMenu Set for create submenu
 * @param {optional string} url path page
 * @returns {undefined|null} Nothing
 * 
 * Si se llama solo con 2 parametros crea un menu horizontal.
 * Si se llama con 3 parametros crea un menu horizontal pero preaparado
 * para tener submenus o subniveles. El 3 parametro se usa como id para
 * identificar al submenu padre.
 * 
 * Ej.  objMenu = mNew('idDelMenu');
 *          Crea un objeto menu con id '#idDelMenu'
 *      mAddM(objMenu, 'TextoMenu');
 *          Crea un menu horizontal con texto 'TextoMenu', no soporta submenu
 *      mAddM(objMenu, 'TextoMenu', 'idSubMenuPadre');
 *          Crea un menu horizontal con texto 'TextoMenu', soporta submenu,
 *          el submenu se identificara con el id '#idSubMenuPadre'
 *      mAddM('#idSubMenuPadre', 'TextoSubMenu');
 *          Agrega al menu '#idSubMenuPadre' con soporte de submenu el sebmenu
 *          con texto 'TextoSubMenu'
 *      mAddM(objMwnu, 'TextoSubMenu', null , 'path.xhtml');
 *          Crea un menu horizontal, sin soporte de submenu, va a la pagina
 *          'path.xhtml' al dar click sobre el menu
 *      mAddM('#idSubMenuPadre', 'TextoMenu', null , 'path2.xhtml');
 *          Agrega un submenu al menu '#idSubMenuPadre' con texto 'TextoMenu'
 *          al dar click va a la pagina 'path2.xhtml'
 * 
 */
function mAddM(menu, text, idSubMenu, url)
{
    (($.type(menu) === "string") ? idElemt = menu : idElemt = menu.menuId);

    $(idElemt)
            .append
            (
                    "<li><a href='"
                    + ((url === undefined) ? "#" : url)
                    + "'>"
                    + text
                    + "<span class='menuIParametrizacion'>&#9660;</span></a>"
                    + ((idSubMenu !== undefined && idSubMenu !== null) ? "<ul id='" + idSubMenu + "'></ul>" : "")
                    + "</li>"
                    );
}

function mAddMJsf(menu, text, idSubMenu, idBtnJsfAction)
{
    (($.type(menu) === "string") ? idElemt = menu : idElemt = menu.menuId);

    $(idElemt)
            .append
            (
                    "<li><a href='#' onclick=\"$('" + idBtnJsfAction + "').click()\">"
                    + text
                    + "<span class='menuIParametrizacion'>&#9660;</span></a>"
                    + ((idSubMenu !== undefined && idSubMenu !== null) ? "<ul id='" + idSubMenu + "'></ul>" : "")
                    + "</li>"
                    );
}

/**
 * @autor imartipe
 * @param {type} data
 * @returns {undefined}
 */
//function estadoSolicitudAjax(data)
//{
//
//    estado = data.status;
//    switch (estado)
//    {
//        case "begin":
//            modalOperationProgress.style.display = "block";
//            break;
//        case "success":
//            modalOperationProgress.style.display = "none";
//            break;
//    }
//}

function downloadTemplate(idLink, objCall)
{
    var a = document.getElementById(idLink);
    var listType = null;
    const path = '../../main/resources/co.com.claro.ListaVerficacion/cargueMasivoPlatillas/XXX.csv';
    var pathNew = null;
    var listTypeSelected = null;
    a.href = path;
    a.download = "TemplateClientes.csv";

    if (objCall !== undefined)
    {
        listType = document.getElementById(objCall);
        listTypeSelected = $('#' + objCall + ' option:selected').val();

        if (listTypeSelected == 2)
        {
            pathNew = path.replace("XXX", "TemplateClientes");
            a.download = "TemplateClientes.csv";
        } else if (listTypeSelected == 3)
        {
            pathNew = path.replace("XXX", "TemplateTelefono");
            a.download = "TemplateTelefono.csv";
        } else if (listTypeSelected == 1)
        {
            pathNew = path.replace("XXX", "TemplateCheques");
            a.download = "TemplateCheques.csv";
        } else if (listTypeSelected == 4)
        {
            pathNew = path.replace("XXX", "TemplateCorreos");
            a.download = "TemplateCorreos.csv";
        }
    } else
    {
        pathNew = path.replace("XXX", "TemplateClientes");
        a.download = "TemplateClientes.csv";
    }

    a.href = pathNew;
}

//imartpe
function loadingWindow()
{
    jsf.ajax.addOnEvent(estadoSolicitudAjax);
}

function loadWindow() {
    /**
     * 
     * cgordilg 23-01-2018
     */
    asignarFechaActual();
    $(document).ready(function ()
    {
        $('.dataTables_wrapper').css({"z-index": "0"});
    });

    /**
     * 
     * Fin cgordilg 23-01-2018
     */
    jsf.ajax.addOnEvent(estadoSolicitudAjax);
}

/**
 * 
 * cgordilg 23-01-2018
 */
function asignarFechaActual()
{
    var fecha = new Date();
    var meses = new Array("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre",
            "Diciembre");
    var diasSemana = new Array("Domingo", "Lunes", "Martes", "Miércoles", "Jueves",
            "Viernes", "Sábado");


    var hours = fecha.getHours();
    var minutes = fecha.getMinutes();
    var dn = "A.M";
    if (hours > 12) {
        dn = "P.M";
        hours = hours - 12;
    }
    if (hours == 0)
        hours = 12;
    if (minutes <= 9)
        minutes = "0" + minutes;

    var fechaActual = (diasSemana[fecha.getDay()] + ", " + fecha.getDate() + " de " +
            meses[fecha.getMonth()] + " de " + fecha.getFullYear());
    var horaActual = (hours + " : " + minutes + " " + dn);
    $(document).ready(function () {
        var date = document.getElementById("dateSys");
        date.textContent = fechaActual;
        var hour = document.getElementById("dateTimeAct");
        hour.textContent = horaActual;
    });
    setTimeout('asignarFechaActual()', 1000);
}

/**
 * 
 * Fin cgordilg 23-01-2018
 */

/**
 * 
 * INI eloaizao 22-03-2018
 */
function callbackEdit() {
    $(document).ready(function () {
        $("#btnActualizar").bind("click", function () {
            modalEdit.style.display = "none";
            jsf.ajax.addOnEvent(cargarEditExitoso);
            jsf.ajax.addOnError(cargarEditExitoso);
        });
    });
}
function callbackRemove() {
    $(document).ready(function () {
        $("#btnEliminar").bind("click", function () {
            modal.style.display = "none";
            jsf.ajax.addOnEvent(cargarRemoveExitoso);
            jsf.ajax.addOnError(cargarRemoveExitoso);
        });
    });
}

function callbackInsertar() {
    $(document).ready(function () {
        $("#btnInsertar").bind("click", function () {
            jsf.ajax.addOnEvent(cargarCreateExitoso);
            jsf.ajax.addOnError(cargarCreateExitoso);
        });
    });
}

function callbacktokenSend() {
    $(document).ready(function () {
        $("#tokenSend").bind("click", function () {
            jsf.ajax.addOnEvent(cargarCreateExitoso);
            jsf.ajax.addOnError(cargarCreateExitoso);
        });
    });
}

function cargarCreateExitoso(data) {
    estado = data.status;
    var modalOperationProgress = document.getElementById('popUpProgress');
    modalOperationProgress.style.display = "none";
    if (estado === "serverError") {
        modalError.style.display = "block";
        return mayFireAjax(this);
    }
    if (estado === "success") {
        modalCreateEnd.style.display = "block";
    }
}

function cargarRemoveExitoso(data)
{
    estado = data.status;
    if (estado === "serverError") {
        modalError.style.display = "block";
        return mayFireAjax(this);
    }
    if (estado === "success") {
        modalDeleteEnd.style.display = "block";
    }
}

function cargarEditExitoso(data)
{
    estado = data.status;
    if (estado === "serverError") {
        modalError.style.display = "block";
        $('#mensajeError3').val('ppp');
        return mayFireAjax(this);
    }
    if (estado === "success") {
        modalEditEnd.style.display = "block";
    }
}

function cerrarEditExitoso() {
    $(document).ready(function () {
        $("#iconEditEx").bind("click", function () {
            location.reload();
        });
    });
}

function cerrarCrearExitoso() {
    $(document).ready(function () {
        $("#iconCreateEx").bind("click", function () {
            location.reload();
        });
    });
}


function cerrarRemoveExitoso() {
    $(document).ready(function () {
        $("#iconDeleteEx").bind("click", function () {
            location.reload();
        });
    });
}

function cerrarError() {
    $(document).ready(function () {
        $("#iconErrorEx").bind("click", function () {
            location.reload();
        });
    });
}

function cargarArchivo()
{
    var jsfcargueField = document.getElementById("loadFile");
    jsfcargueField.click();
}

function carga()
{
    $('input[name=loadFile]').change(function (ev)
    {
        var val = $(this).val().split("\\");
        var ext = val[2].split(".");
        if (ext[1] !== "csv") {
            $(this).val("");
            document.getElementById("cmTxtxPlan").innerHTML = "Archivo no valido!";
            document.getElementById("btnCargue").disabled = true;
        } else {
            document.getElementById("cmTxtxPlan").innerHTML = val[2];
        }
//        document.getElementById("cmTxtxPlan").innerHTML = val[2];
        // your code
    });
}

/**
 * 
 * FIN eloaizao 22-03-2018
 */


/**
 *
 * FIN eloaizao 22-03-2018
 */

/**** Validadores ****/

/**
 * @param {type} id
 * @param {type} valor
 * @returns {Boolean}
 * @author asantacb-everis
 * 16/04/18
 * Accion: Funcion para validar que el campo solo contenga Numeros
 */
//<![CDATA[
//function ValidatorOnlyNumbers(id, valor)
//{
//
//    var mensaje = document.getElementById(id + "_mensaje");
//    var input = document.getElementById(id);
//    var patron = /^\d*$/;
//    
//    if (valor.search(patron)){
//        mensaje.innerHTML = "Solo se permiten numeros";
//        mensaje.style.display = "block";
//        return false;
//    } else {
//        mensaje.innerHTML = "";
//        mensaje.style.display = "none";
//    }
//}
function onlyNumbers(id, valor) {
    var mensaje = document.getElementById(id + "_mensaje");
    if (!(/^[0-9]+([,][0-9]+)?$/.test(valor))) {
        var input = document.getElementById(id);
        do {
            input.value = input.value.substring(0, input.value.length - 1);
            if (!onlyNumbers(id, input.value)) {
                break;
            }
        } while (true)
        mensaje.innerHTML = "Solo se permiten numeros";
        mensaje.style.display = "block";
        return false;
    } else {
        mensaje.innerHTML = "";
        mensaje.style.display = "none";
        return true;
    }
}
//]]>



/**
 * @author asantacb-everis
 * 16/04/18
 * Accion: Funcion para validar campos obligatorios
 * @param {type} id
 * @param {type} idValueArray
 * @returns {undefined}
 */

//<![CDATA[

function validateMsid(id, imsi, msisdn) {
    if (imsi == "" && msisdn == "") {
        var plataformas = document.getElementsByClassName("ui-selectcheckboxmenu-token-label");
        var valPlat = [];
        for (var i = 0; i < plataformas.length; i++) {
            var valor = plataformas.item(i).innerHTML;
            valPlat.push(valor);
            console.log(valor);
        }
        document.getElementById(id).disabled = true;
        document.getElementById(id).style.backgroundColor = "#5d5353";
        var mensaje = document.getElementById(id + "_mensaje");
        if (valPlat.length > 0) {
            mensaje.innerHTML = "MSISDN o IMSI debe ser ingresado";
        } else {
            mensaje.innerHTML = "Debe seleccionar por lo menos una plataforma";
        }
        mensaje.style.display = "block";
        document.getElementById(id).disabled = true;
        setTimeout(function () {
            var elemente = document.getElementById("btnConsulta_mensaje");
            var btn = document.getElementById("btnConsulta");
            btn.disabled = false;
            btn.style.removeProperty("background-color");
            elemente.innerHTML = "";
            elemente.style.display = "none";
        }, 2000);
    }

}

function ObligatoryField(id, idValueArray)
{
    var FielsNull = false;
    for (i = 0; i < idValueArray.length; i++)
    {
        if (idValueArray[i].toString() === "")
        {
            FielsNull = true;
            document.getElementById(id).disabled = true;
            document.getElementById(id).style.backgroundColor = "#5d5353";
            var mensaje = document.getElementById(id + "_mensaje");
            mensaje.innerHTML = "Los campos marcados con(*) son obligatorios";
            mensaje.style.display = "block";
            break;
        }
    }

    if (!FielsNull)
    {
        document.getElementById(id).disabled = false;
    }
}


function validateDocumentValue(id, type, value)
{
    var patron = /^\d*$/;
    var alphanumericPatron = /^[a-zA-Z0-9]*$/;
    var val = value;
    var mensaje = document.getElementById(id + "_mensaje");

    if (type === "CC" || type === "CE" || type === "CD" || type === "TI"
            || /*type === "TE" ||*/ type === "RN" || type === "SI") {
        if ((value.length <= 6 || value.length >= 12) || !val.match(patron)) {
            document.getElementById(id).value = "";
            mensaje.innerHTML = "Numero de identificación debe tener entre 6 a 12 dígitos numéricos";
            mensaje.style.display = "block";
        } else {
            mensaje.innerHTML = "";
            mensaje.style.display = "none";
            return true;
        }
    } else if (type === "NI") {
        if ((value.length !== 9) || !val.match(patron)) {
            document.getElementById(id).value = "";
            mensaje.innerHTML = "Numero de NIT debe ser de 9 dígitos numéricos";
            mensaje.style.display = "block";
        } else {
            mensaje.innerHTML = "";
            mensaje.style.display = "none";
            return true;
        }
    } else if (type === "PS" || type === "TE") {

        if ((value.length <= 7 /*|| value.length <= 12*/) || !val.match(alphanumericPatron)) {
            document.getElementById(id).value = "";
            //mensaje.innerHTML = "Numero de pasaporte debe tener entre 6 a 12 caracteres";
            mensaje.innerHTML = "Numero debe tener mas de 7 caracteres";
            mensaje.style.display = "block";
        } else {
            mensaje.innerHTML = "";
            mensaje.style.display = "none";
            return true;
        }
    } else if (type.length <= 0 || type === "") {
        document.getElementById(id).value = "";
        mensaje.innerHTML = "Seleccione un Tipo de Documento";
        mensaje.style.display = "block";
    }
}
//]]>


/**
 * @author asantacb-everis
 * 16/04/18
 * @param {type} id
 * @param {type} valor
 * @returns {Boolean}
 * Accion: Funcion para validar que el campo solo contenga numeros y letras
 */
//<![CDATA[
function ValidatorOnlyAlphaNumeric(id, valor)
{

    var mensaje = document.getElementById(id + "_mensaje");

    if (/[^a-zA-Z0-9]/.test(valor))
    {
        var input = document.getElementById(id);

        do
        {
            input.value = input.value.substring(0, input.value.length - 1);
            if (ValidatorOnlyAlphaNumeric(id, input.value))
            {
                break;
            }
        } while (true)
        mensaje.innerHTML = "Solo se permiten numeros y letras";
        mensaje.style.display = "block";
        return false;
    } else {
        mensaje.innerHTML = "";
        mensaje.style.display = "none";
        return true;
    }
}
//]]>

/**
 * @author asantacb-everis
 * 16/04/18
 * @param {type} id
 * @param {type} valor
 * @returns {Boolean}
 * Accion: Funcion para validar que el campo solo contenga letras
 */
//<![CDATA[
function ValidatorOnlyLetters(id, valor)
{

    var mensaje = document.getElementById(id + "_mensaje");
    if (/[^a-zA-Z\ ]/.test(valor))
    {
        var input = document.getElementById(id);

        do
        {
            input.value = input.value.substring(0, input.value.length - 1);

            if (ValidatorOnlyLetters(id, input.value))
            {
                break;
            }
        } while (true)

        mensaje.innerHTML = "Solo se permiten letras";
        mensaje.style.display = "block";
        return false;
    } else {
        mensaje.innerHTML = "";
        mensaje.style.display = "none";
        return true;
    }
}
//]]>


/**
 * @author krodrigz- everis
 * 17/05/18
 * @param {type} id
 * @param {type} valor
 * @returns {Boolean}
 * Metodo:para validar que el campo contenga letras Mayusculas, numeros, punto y underscore
 */

function ValidatorAlphaNumericDotAndUnderscore(id, valor)
{
    var mensaje = document.getElementById(id + "_mensaje");
    if (/[^A-Z0-9_\ ]/.test(valor))
    {
        var input = document.getElementById(id);
        do
        {
            input.value = input.value.substring(0, input.value.length - 1);

            if (ValidatorOnlyAlphaNumericDotAndUnderscore(id, input.value))
            {
                break;
            }
        } while (true)
        mensaje.innerHTML = "Solo permite numeros, letras Mayusculas, puntos y underscore";
        mensaje.style.display = "block";
        return false;
    } else {
        mensaje.innerHTML = "";
        mensaje.style.display = "none";
        return true;
    }
}




/**
 * @author asantacb-everis
 * 16/04/18
 * @param {type} id
 * @param {type} valor
 * @returns {Boolean}
 * Accion: Funcion para validar que el campo solo contenga letras, numeros y .
 */
//<![CDATA[
function ValidatorOnlyAlphaNumericAndDot(id, valor)
{
    var mensaje = document.getElementById(id + "_mensaje");

    if (/[^a-zA-Z0-9_ ]/.test(valor))
    {
        var input = document.getElementById(id);

        do
        {
            input.value = input.value.substring(0, input.value.length - 1);

            if (ValidatorOnlyAlphaNumericAndDot(id, input.value))
            {
                break;
            }
        } while (true)
        mensaje.innerHTML = "Solo se permiten numeros y letras";
        mensaje.style.display = "block";
        return false;
    } else {
        mensaje.innerHTML = "";
        mensaje.style.display = "none";
        return true;
    }
}
//]]>

/**
 * @author asantacb-everis
 * 16/04/18
 * @param {type} id
 * @param {type} valor
 * @returns {Boolean}
 * Accion: Funcion para validar que el campo solo contenga letras, numeros y _
 */
//<![CDATA[
function ValidatorOnlyAlphaNumericAndUnderscore(id, valor)
{

    var mensaje = document.getElementById(id + "_mensaje");

    if (/[^a-zA-Z0-9\_]/.test(valor))
    {
        var input = document.getElementById(id);

        do
        {
            input.value = input.value.substring(0, input.value.length - 1);

            if (ValidatorOnlyAlphaNumericAndUnderscore(id, input.value))
            {
                break;
            }
        } while (true)
        mensaje.innerHTML = "Solo se permiten numeros, letras y '_'";
        mensaje.style.display = "block";
        return false;
    } else {
        mensaje.innerHTML = "";
        mensaje.style.display = "none";
        return true;
    }
}
//]]>


/**
 * @author asantacb-everis
 * 16/04/18
 * @param {type} id
 * @param {type} valor
 * @returns {Boolean}
 * Accion: Funcion para validar el nuevo WSDL cumpla la estructura
 */
//<![CDATA[
function ValidatorWsdlPath(id, valor)
{

    var mensaje = document.getElementById(id + "_mensaje");

    if (/https{0,1}:\/\/([a-zA-Z0-9\.\_\\\/(]){1,}?.wsdl/.test(valor))
    {
        mensaje.innerHTML = "";
        mensaje.style.display = "none";
        return true;
    } else {

        mensaje.innerHTML = "Ejemplo: http://ejemplo.url09/.?wsdl o https://ejemplo.url09/.?wsdl";
        mensaje.style.display = "block";
        return false;
    }
}

function isValidEmail(mail) {
    return /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,4})+$/.test(mail);
}

/**
 * @author: cgordilg
 
 * @param {type} id
 * @param {type} valor
 * @returns {undefined} */
function ValidatorEmail(id, valor) {

    var mensaje = document.getElementById(id + "_mensaje");
    var input = document.getElementById(id);

//    if(/^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/i.test(valor)){
    if (/^((([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+(\.([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+)*)|((\x22)((((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(([\x01-\x08\x0b\x0c\x0e-\x1f\x7f]|\x21|[\x23-\x5b]|[\x5d-\x7e]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(\\([\x01-\x09\x0b\x0c\x0d-\x7f]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]))))*(((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(\x22)))@((([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.)+(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.?$/.test(valor)) {
        mensaje.innerHTML = "";
        mensaje.style.display = "none";
        return true;
    } else {
        mensaje.innerHTML = "Correo electronico invalido";
        mensaje.style.display = "block";
        input.value = "";
        return false;
    }
}

/**
 * @author: cgordilg
 
 * @param {type} id
 * @param {type} valor
 * @returns {undefined} */
function ValidatorDate(id, valor)
{
    var mensaje = document.getElementById(id + "_mensaje");

    if (!/^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\d\d$/.test(valor))
    {
        mensaje.innerHTML = "Formato de fecha invalido";
        mensaje.style.display = "block";
        return false;
    } else {
        mensaje.innerHTML = "";
        mensaje.style.display = "none";
        return true;
    }
}

//]]>

//<![CDATA[

/**
 * @author jmiguel-everis
 * 25/06/18 validCurrentDate
 * @param {type} id
 * @param {type} valor
 * @returns {Boolean}
 * Accion: funcion para validar que la fecha ingresada no sea superior a la actual
 */

function validCurrentDate(id, valor)
{
    var mensaje = document.getElementById(id + "_mensaje");
    var Fdocument = document.getElementById(id);
    var actualDate = new Date();
    var dateUser = valor;
    /*convertir feccha usuario a objeto date*/
    dateUser = dateUser.split("/", 6);
    dateUser = new Date(dateUser[2] + '/' + dateUser[1] + '/' + dateUser[0]);

    if (actualDate >= dateUser) {
        mensaje.innerHTML = "La fecha debe ser superior a la actual";
        mensaje.style.display = "block";
        Fdocument.value = "";
        return false;
    } else {
        mensaje.innerHTML = "";
        mensaje.style.display = "none";
        return true;
    }
}
/**
 * @author jmiguel-everis
 * 03/07/18 dateEndUpper
 * @param {type} id
 * @param {type} endDate
 * @param {type} starDate
 * @returns {Boolean} 
 * Accion: valida que la fecha inicial no sea superior a la final  
 * valida ingresar primero la fecha inicial
 */

function dateEndUpper(id, endDate, starDate) {
    var mensaje = document.getElementById(id + "_mensaje");
    var dateEnd = endDate;
    var dateStar = starDate;

    if (dateStar == "") {
        mensaje.innerHTML = "Ingrese primero la fecha inical";
        mensaje.style.display = "block";
        document.getElementById(id).value = "";
        return false;
    } else {
        /*convertir fecha fin a objeto date*/
        dateEnd = dateEnd.split("/", 6);
        dateEnd = new Date(dateEnd[2] + '/' + dateEnd[1] + '/' + dateEnd[0]);
        /*convertir fecha inicial a objeto date*/
        dateStar = dateStar.split("/", 6);
        dateStar = new Date(dateStar[2] + '/' + dateStar[1] + '/' + dateStar[0]);

        if (dateEnd <= dateStar) {
            mensaje.innerHTML = "La fecha debe ser superior a la inicial";
            mensaje.style.display = "block";
            document.getElementById(id).value = "";
            return false;
        } else {
            mensaje.innerHTML = "";
            mensaje.style.display = "none";
            return true;
        }
    }
}

function ActivateComponet(id)
{
    document.getElementById(id).disabled = false;
    document.getElementById(id).style.backgroundColor = "#000000";
    var mensaje = document.getElementById(id + "_mensaje");
    mensaje.innerHTML = "";
    mensaje.style.display = "none";
}
//]]>
// llenar tabla 
function loadDataTable() {
    $(document).ready(
            function () {
                t = $('#table').DataTable();
                t.on(
                        'order.dt search.dt',
                        function () {
                            t.column(0, {
                                search: 'applied',
                                order: 'applied'
                            }).nodes().each(
                                    function (cell, i) {
                                        cell.innerHTML = i + 1;
                                    }
                            );
                        }
                );
                -
                        t.draw();
            }
    );
}

function reload() {
    $(document).ready(function () {
        $(".btnCancelTest").bind("click", function () {
            location.reload();
        });
    });
}

function diseableReports() {
    var chTodos = document.getElementById('chTodos');

    if (chTodos.checked) {

        $("#inputTableReport :input").prop("disabled", true);
        $(".fieldsetCheck").removeProp('disabled');
        $("#listReportes").removeProp('disabled');
        return true;
    } else {
        $("#inputTableReport :input").prop("disabled", false);
        $(".fieldsetCheck").removeProp('disabled');
        $("#listReportes").removeProp('disabled');
        return false;

    }
}


function verifyObligatoryFields(id, idValueArray)
{
    var chTodos = document.getElementById('chTodos');
    ObligatoryField(id, idValueArray);
    if (!chTodos.checked)
    {
        var inicio = document.getElementById("fecInicio").value;
        var fin = document.getElementById("fecFin").value;
        if (inicio.toString() === "" || fin.toString() === "")
        {
            document.getElementById(id).disabled = true;
            document.getElementById(id).style.backgroundColor = "#5d5353";
            var mensaje = document.getElementById(id + "_mensaje");
            mensaje.innerHTML = "Seleccione un criterio por favor";
            mensaje.style.display = "block";
        } else
        {
            document.getElementById(id).disabled = false;
        }
    } else
    {
        document.getElementById(id).disabled = false;
    }

}

//Inicio jbernalh
function bloquearPorRol(val, id) {
    if (val === true) {
        document.getElementById(id).disabled = true;
    }
}

/**
 * @author jbernalh, eloaizao -everis
 * 29/08/18 dateEndUpper
 * @param {type} id
 * @returns null 
 * Accion: valida que campos de usuario están renderizados en el DOM y con estos
 * crea un arreglo con sus respectivos valores, que son los parametros para el 
 * método ObligatoryField
 *  
 */

function validateField(id) {
    var arreglo = [];
    var i = 0;
    $("table#inputTable :input").each(function () {
        console.log(this.id);
        arreglo[i] = document.getElementById(this.id).value;
        i++;
    });
    ObligatoryField(id, arreglo);
}

/**
 * @author millanja- Hitss
 * 30/07/19
 * @param {type} id
 * @param {type} valor
 * @returns {Boolean}
 * Metodo:Validar el MSISDN de un cliente
 */
function validMsisdn(id, valor)
{
    var mensaje = document.getElementById(id + "_mensaje");
    var msisdn = valor;

    if (msisdn.length > 0) {
        if (/[^0-9]/.test(valor))
        {
            mensaje.innerHTML = "No es un MSISDN valido";
            mensaje.style.display = "block";
            setTimeout(function () {
                mensaje.style.display = "none";
            }, 2000, mensaje);

            return false;
        } else if (msisdn.length === 10) {
            mensaje.innerHTML = "";
            mensaje.style.display = "none";
            return true;
        } else {
            mensaje.innerHTML = "El MSISDN debe contener 10 digitos";
            mensaje.style.display = "block";
            setTimeout(function () {
                mensaje.style.display = "none";
            }, 2000, mensaje);

            return false;
        }
    } else {
        mensaje.innerHTML = "";
        mensaje.style.display = "none";

    }

}

/**
 * @author millanja- Hitss
 * 30/07/19
 * @param {type} id
 * @param {type} valor
 * @returns {Boolean}
 * Metodo:Validar el IMSI de un cliente
 */
function validImsi(id, valor)
{
    var mensaje = document.getElementById(id + "_mensaje");
    var imsi = valor;

    if (imsi.length > 0) {
        if (/[^0-9]/.test(valor))
        {
            mensaje.innerHTML = "No es un IMSI valido";
            mensaje.style.display = "block";
            return false;
        } else if (imsi.length === 15) {
            mensaje.innerHTML = "";
            mensaje.style.display = "none";
            return true;
        } else {
            mensaje.innerHTML = "El IMSI debe contener 15 digitos";
            mensaje.style.display = "block";
            //Fdocument.value = "";
            return false;
        }
    } else {
        mensaje.innerHTML = "";
        mensaje.style.display = "none";

    }

}

/**
 * @author millanja- Hitss
 * 30/07/19
 * @param {type} id
 * @param {type} valor
 * @returns {Boolean}
 * Metodo:Validar el valoe
 */
function ValidatorValue(id, valor)
{
    var mensaje = document.getElementById(id + "_mensaje");

    if (/[^a-zA-Z0-9.:_/\\///// ]/.test(valor))
    {
        var input = document.getElementById(id);

        do
        {
            input.value = input.value.substring(0, input.value.length - 1);

            if (ValidatorOnlyAlphaNumericAndDot(id, input.value))
            {
                break;
            }
        } while (true)
        mensaje.innerHTML = "Solo se permiten numeros y letras";
        mensaje.style.display = "block";
        return false;
    } else {
        mensaje.innerHTML = "";
        mensaje.style.display = "none";
        return true;
    }
}
/**
 * @author millanja- Hitss
 * 30/07/19
 * @param {type} id
 * @param {type} idValueArray
 * @returns {Boolean}
 * Metodo:Validar valor del MSISDN
 */
function ObligatoryMsisdn(id, idValueArray) {
    var FielsNull = false;
    for (i = 0; i < idValueArray.length; i++)
    {
        if (idValueArray[i].toString() === "")
        {
            FielsNull = true;
            document.getElementById(id).disabled = true;
            document.getElementById(id).style.backgroundColor = "#5d5353";
            var mensaje = document.getElementById(id + "_mensaje");
            mensaje.innerHTML = "Los campos marcados con(*) son obligatorios";
            mensaje.style.display = "block";
            break;
        } else if (idValueArray[i].length > 0) {
            if (/[^0-9]/.test(idValueArray[i]))
            {
                document.getElementById(id).disabled = true;
                document.getElementById(id).style.backgroundColor = "#5d5353";
                var mensaje = document.getElementById(id + "_mensaje");
                mensaje.innerHTML = "No es un MSISDN valido";
                mensaje.style.display = "block";
                setTimeout(function () {
                    mensaje.style.display = "none";
                }, 2000, mensaje);

                return false;
            } else if (idValueArray[i].length === 10) {
                //mensaje.innerHTML = "";
                //mensaje.style.display = "none";
                return true;
            } else {
                document.getElementById(id).disabled = true;
                document.getElementById(id).style.backgroundColor = "#5d5353";
                var mensaje = document.getElementById(id + "_mensaje");
                mensaje.innerHTML = "El MSISDN debe contener 10 digitos";
                mensaje.style.display = "block";
                setTimeout(function () {
                    mensaje.style.display = "none";
                }, 2000, mensaje);

                return false;
            }
        } else {
            FielsNull = false;
        }
    }

    if (!FielsNull)
    {
        document.getElementById(id).disabled = false;
    }
}

/* proceso de cierre de pestañas
 * autor Carlos vargas
 * */

function closeTabsAuto() {
    var elements = $(".ui-accordion-header");

    for (i = 0; i < elements.size(); i++) {
        var validacion = elements[i].classList.contains("ui-state-active");
        if (validacion) {
            elements[i].click();
        }
    }

}

function sesion() {
    var idFlow = document.getElementById("idFlow");
    var trigger = document.getElementById("trigerframe");
    var renderF = document.getElementById("renderframe");
    var valId = idFlow.value;
    if (valId.localeCompare("") == 0) {
        console.log("accede is live");
        var url = window.location.href.split("?");
        var flow = url[url.length - 1];
        idFlow.click();
        idFlow.value = flow;
        trigger.click();
        renderF.click();
    }
    sendDataMen();
    /*setTimeout(function () {
     sendDataMen();
     sesion();
     }, 3000);*/
}

function sendDataMen() {
    var idUser = document.getElementById("idUser");
    var min = document.getElementById("min");
    var channelTypeCode = document.getElementById("channelTypeCode");
    var documentType = document.getElementById("documentType");
    var documentNumber = document.getElementById("documentNumber");
    var source = document.getElementById("source");
    var idHeader = document.getElementById("idHeader");
    var idTurn = document.getElementById("idTurn");
    var account = document.getElementById("account");
    var urlReturn = document.getElementById("urlReturn");
    var AddressId = document.getElementById("AddressId");
    var frameImei = document.getElementById('appImei');
    var frameImeiW = frameImei.contentWindow;
    var frameImeiSrc = frameImei.src;

    var mensaje =
            "idUser:" + idUser.value +
            ",min:" + min.value +
            ",channelTypeCode:" + channelTypeCode.value +
            ",documentType:" + documentType.value +
            ",documentNumber:" + documentNumber.value +
            ",source:" + source.value +
            ",idHeader:" + idHeader.value +
            ",idTurn:" + idTurn.value +
            ",account:" + account.value +
            ",urlReturn:" + urlReturn.value +
            ",AddressId:" + AddressId.value;
    console.log(mensaje);
    frameImeiW.postMessage(mensaje, frameImeiSrc);
    console.log("working");
}

function incidentsSession() {
    sendDataIncidents();
}

function sendDataIncidents() {
    var listData = document.getElementById("listData");
    var frameFunc = document.getElementById('appFuncionalidades');
    var frameFuncW = frameFunc.contentWindow;
    var frameFuncSrc = frameFunc.src;

    var mensaje = listData.value;
    console.log(mensaje);
    setTimeout(function () {
        frameFuncW.postMessage(mensaje, frameFuncSrc);
    }, 500);

    console.log("working");
}
