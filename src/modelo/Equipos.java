/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author AYLEEN ROMERO PATIÑO
 */
public class Equipos {

    private String mac;
    private String ip;
    private int numero;
    private int estado;
    private int idEquipo;
    private Laboratorios idLaboratorio;

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Laboratorios getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(Laboratorios idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }


    
}
