/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.controlador.mail;

/**
 *
 * @author eoleas
 */
public class ConstantesEmail {
    public static final String FORMATO_FECHAHORA = "dd/MM/yyyy HH:mm:ss";
    public static final String FORMATO_FECHA = "dd/MM/yyyy";
    public static final String FORMATO_HORA = "HH:mm:ss";
    public static final String HTML_INI = "<html>";
    public static final String BODY_INICIAL = "<body>";
    public static final String BODY_FINAL = " </body></html>";
    public static final String DIV_INICIAL = "<div align=\"justify\" style=\"margin: 50px;\">";
    public static final String DIV_FINAL = "</div>";
    public static final String TABLE_INICIAL = "<table style=\"border:solid 2px #F5F5F5; width: 50%;text-align: justify\" cellpadding=\"10\" cellspacing=\"0\" >";
    public static final String TABLE_FINAL = "</table>";
    public static final String HEAD_TABLE_INICIAL = "<thead style=\"background-color: #F5F5F5; text-align: left; height: 50px\"><th>";
    public static final String HEAD_TABLE_FINAL = "</th></thead>";
    public static final String ENTER = "<br></br>";
    public static final String FILA_INICIAL = "<tr>";
    public static final String FILA_FINAL = "</tr>";
    public static final String COL_INICIAL = "<td>";
    public static final String COL_FINAL = "</td>";
    public static final String TH_INICIAL = "<th id=\"th01\">";
    public static final String TH_FINAL = "</th>";
    public static final String TABLE_INI_DET = "<table id=\"tb01\">";
    public static final String TABLE_FIN_DET = "</table>";
    public static final String COL_INI_DET = "<td id=\"td01\">";
    public static final String COL_FIN_DET = COL_FINAL;
    public static final String COL_INI_NUM = "<td id=\"num\">";
    public static final String COL_FIN_NUM = COL_FINAL;
    public static final String STYLE = "<head><style>table#tb01, td#td01, th#th01 { border: 1px solid #ddd;text-align: left;} table#tb01 {border-collapse: collapse; width: 100%;} th#th01, td#td01{padding: 5px;} td#num{padding: 5px;border: 1px solid #ddd; text-align: right;}</style></head>";

    private ConstantesEmail() {

    }    
}
