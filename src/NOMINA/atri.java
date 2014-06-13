/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NOMINA;

/**
 *
 * @author Mayela
 */
class atri {

 private int id,INSS;
 private String nombre,cedula,oficio;
 private double antiguedad,extra,salario,TOTALPAGO,inss,ir,deduccion,total;

 
 public atri(){}
    public atri(int id, int INSS, String nombre, String cedula, String oficio, double antiguedad, double extra, double salario, double TOTALPAGO, double inss, double ir, double deduccion, double total) {
        this.id = id;
        this.INSS = INSS;
        this.nombre = nombre;
        this.cedula = cedula;
        this.oficio = oficio;
        this.antiguedad = antiguedad;
        this.extra = extra;
        this.salario = salario;
        this.TOTALPAGO = TOTALPAGO;
        this.inss = inss;
        this.ir = ir;
        this.deduccion = deduccion;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public double getTOTALPAGO() {
        return TOTALPAGO;
    }

    public void setTOTALPAGO(double TOTALPAGO) {
        this.TOTALPAGO = TOTALPAGO;
    }
    
    
    public void setId(int id) {
        this.id = id;
    }

    public int getINSS() {
        return INSS;
    }

    public void setINSS(int INSS) {
        this.INSS = INSS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public double getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(double antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getExtra() {
        return extra;
    }

    public void setExtra(double extra) {
        this.extra = extra;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double getIr() {
        return ir;
    }

    public void setIr(double ir) {
        this.ir = ir;
    }

    public double getDeduccion() {
        return deduccion;
    }

    public void setDeduccion(double deduccion) {
        this.deduccion = deduccion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
 
 
   
}
