//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.29 a las 09:11:30 PM COT 
//


package webservicefederacion.arqsoftware.espe.edu.ec.ws;

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import lombok.Data;


/**
 * <p>Clase Java para partido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="partido"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo_partido" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="codigo_localidad" type="{http://ec.edu.espe.arqSoftware.webServiceFederacion/ws}localidad"/&gt;
 *         &lt;element name="equipo_local" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="equipo_visitante" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="lugar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partido", propOrder = {
    "codigoPartido",
    "codigoLocalidad",
    "equipoLocal",
    "equipoVisitante",
    "fecha",
    "lugar"
})
@Entity
@Data
@Table(name = "partido_futbol")
public class Partido {
    @Id
    @Column(name = "CODIGO_PARTIDO", nullable = false, length = 20)
    @XmlElement( required = true)
    protected BigInteger codigoPartido;
    @Column(name = "CODIGO_LOCALIDAD", nullable = false, length = 20)
    @XmlElement( required = true)
    protected Localidad codigoLocalidad;
    @Column(name = "EQUIPO_LOCAL", nullable = false, length = 20)
    @XmlElement( required = true)
    protected String equipoLocal;
    @Column(name = "EQUIPO_VISITANTE", nullable = false, length = 20)
    @XmlElement( required = true)
    protected String equipoVisitante;
    @Column(name = "FECHA", nullable = false, length = 20)
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fecha;
    @Column(name = "LUGAR", nullable = false, length = 20)
    @XmlElement(required = true)
    protected String lugar;


    /**
     * Obtiene el valor de la propiedad codigoPartido.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoPartido() {
        return codigoPartido;
    }

    /**
     * Define el valor de la propiedad codigoPartido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoPartido(BigInteger value) {
        this.codigoPartido = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoLocalidad.
     * 
     * @return
     *     possible object is
     *     {@link Localidad }
     *     
     */
    public Localidad getCodigoLocalidad() {
        return codigoLocalidad;
    }

    /**
     * Define el valor de la propiedad codigoLocalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Localidad }
     *     
     */
    public void setCodigoLocalidad(Localidad value) {
        this.codigoLocalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad equipoLocal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipoLocal() {
        return equipoLocal;
    }

    /**
     * Define el valor de la propiedad equipoLocal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipoLocal(String value) {
        this.equipoLocal = value;
    }

    /**
     * Obtiene el valor de la propiedad equipoVisitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    /**
     * Define el valor de la propiedad equipoVisitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipoVisitante(String value) {
        this.equipoVisitante = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad lugar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Define el valor de la propiedad lugar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugar(String value) {
        this.lugar = value;
    }

}
