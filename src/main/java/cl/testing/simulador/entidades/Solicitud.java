/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.testing.simulador.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Franco
 */
@Entity
@Table(name = "solicitud")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Solicitud.findAll", query = "SELECT s FROM Solicitud s")
    , @NamedQuery(name = "Solicitud.findById", query = "SELECT s FROM Solicitud s WHERE s.id = :id")
    , @NamedQuery(name = "Solicitud.findByRut", query = "SELECT s FROM Solicitud s WHERE s.rut = :rut")
    , @NamedQuery(name = "Solicitud.findByMonto", query = "SELECT s FROM Solicitud s WHERE s.monto = :monto")
    , @NamedQuery(name = "Solicitud.findByCuotas", query = "SELECT s FROM Solicitud s WHERE s.cuotas = :cuotas")
    , @NamedQuery(name = "Solicitud.findByVencimiento", query = "SELECT s FROM Solicitud s WHERE s.vencimiento = :vencimiento")
    , @NamedQuery(name = "Solicitud.findBySeguro", query = "SELECT s FROM Solicitud s WHERE s.seguro = :seguro")
    , @NamedQuery(name = "Solicitud.findByNombre", query = "SELECT s FROM Solicitud s WHERE s.nombre = :nombre")
    , @NamedQuery(name = "Solicitud.findByApellidos", query = "SELECT s FROM Solicitud s WHERE s.apellidos = :apellidos")
    , @NamedQuery(name = "Solicitud.findByRenta", query = "SELECT s FROM Solicitud s WHERE s.renta = :renta")
    , @NamedQuery(name = "Solicitud.findByCelular", query = "SELECT s FROM Solicitud s WHERE s.celular = :celular")
    , @NamedQuery(name = "Solicitud.findByTelefono", query = "SELECT s FROM Solicitud s WHERE s.telefono = :telefono")
    , @NamedQuery(name = "Solicitud.findByEmail", query = "SELECT s FROM Solicitud s WHERE s.email = :email")
    , @NamedQuery(name = "Solicitud.findByRegion", query = "SELECT s FROM Solicitud s WHERE s.region = :region")
    , @NamedQuery(name = "Solicitud.findByComuna", query = "SELECT s FROM Solicitud s WHERE s.comuna = :comuna")
    , @NamedQuery(name = "Solicitud.findByFecha", query = "SELECT s FROM Solicitud s WHERE s.fecha = :fecha")})
public class Solicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "rut")
    private String rut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "monto")
    private int monto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cuotas")
    private int cuotas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vencimiento")
    @Temporal(TemporalType.DATE)
    private Date vencimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "seguro")
    private String seguro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "renta")
    private int renta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "celular")
    private String celular;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "telefono")
    private String telefono;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "region")
    private String region;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "comuna")
    private String comuna;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public Solicitud() {
    }

    public Solicitud(Integer id) {
        this.id = id;
    }

    public Solicitud(Integer id, String rut, int monto, int cuotas, Date vencimiento, String seguro, String nombre, String apellidos, int renta, String celular, String telefono, String email, String region, String comuna, Date fecha) {
        this.id = id;
        this.rut = rut;
        this.monto = monto;
        this.cuotas = cuotas;
        this.vencimiento = vencimiento;
        this.seguro = seguro;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.renta = renta;
        this.celular = celular;
        this.telefono = telefono;
        this.email = email;
        this.region = region;
        this.comuna = comuna;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getRenta() {
        return renta;
    }

    public void setRenta(int renta) {
        this.renta = renta;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitud)) {
            return false;
        }
        Solicitud other = (Solicitud) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.testing.simulador.entidades.Solicitud[ id=" + id + " ]";
    }
    
}
