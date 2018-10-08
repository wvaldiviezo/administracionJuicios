/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.dto;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eoleas
 */
public class Mensaje implements Serializable {

    public static final  String PRIORIDAD_ALTA = "1";
    public static final  String PRIORIDAD_NORMAL = "3";
 
    public static final  String PRIORIDAD_BAJA = "5";
    private String to;
    private String toName;
    private String cc;
    private String ccName;
    private String bcc;
    private String bccName;
    private String from;
    private String fromName;
    private String replyTo;
    private String replyToName;
    private String subject;
    private String body;
    private String nameHeader;
    private String valueHeader;
    private String priorityValue;

    private List<String> archivosAdjuntos;
    private List<File> adjuntos;

    public void setTo(String to) {
        this.setTo(to, null);
    }

    public void setTo(String to, String toName) {
        this.to = to;
        this.toName = toName;
    }

    public void setCC(String cc) {
        this.setCC(cc, null);
    }

    public void setCC(String cc, String ccName) {
        this.cc = cc;
        this.ccName = ccName;
    }

    public void setBCC(String bcc) {
        this.setBCC(bcc, null);
    }

    public void setBCC(String bcc, String bccName) {
        this.bcc = bcc;
        this.bccName = bccName;
    }

    public void setFrom(String from) {
        this.setFrom(from, null);
    }

    public void setFrom(String from, String fromName) {
        this.from = from;
        this.setFromName(fromName);
    }

    public void setReplyTo(String replyTo) {
        this.setReplyTo(replyTo, null);
    }

    public void setReplyTo(String replyTo, String replyToName) {
        this.replyTo = replyTo;
        this.replyToName = replyToName;


    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setHeader(String name, String value) {
        this.nameHeader = name;
        this.valueHeader = value;
    }

    public void setPriority(String priorityValue) {
        this.priorityValue = priorityValue;
    }

    public void adjuntarArchivo(String archivoNombre) {
        if (getArchivosAdjuntos() == null) {
            archivosAdjuntos = new ArrayList<String>();
        }
        getArchivosAdjuntos().add(archivoNombre);
    }

    public String getTo() {
        return to;
    }

    public String getToName() {
        return toName;
    }

    public String getCC() {
        return cc;
    }

    public String getCcName() {
        return ccName;
    }

    public String getBCC() {
        return bcc;
    }

    public String getBccName() {
        return bccName;
    }

    public String getFrom() {
        return from;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public String getReplyToName() {
        return replyToName;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public String getNameHeader() {
        return nameHeader;
    }

    public String getValueHeader() {
        return valueHeader;
    }

    public String getPriorityValue() {
        return priorityValue;
    }

    public List<String> getArchivosAdjuntos() {
        return archivosAdjuntos;
    }

    public List<File> getAdjuntos() {
        return adjuntos;
    }

    public void setAdjuntos(List<File> adjuntos) {
        this.adjuntos = adjuntos;
    }
}
