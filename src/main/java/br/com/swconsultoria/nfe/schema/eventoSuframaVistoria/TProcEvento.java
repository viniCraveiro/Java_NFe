
package br.com.swconsultoria.nfe.schema.eventoSuframaVistoria;

import javax.xml.bind.annotation.*;


/**
 * Tipo procEvento
 * 
 * <p>Classe Java de TProcEvento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TProcEvento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="evento" type="{http://www.portalfiscal.inf.br/nfe}TEvento"/&gt;
 *         &lt;element name="retEvento" type="{http://www.portalfiscal.inf.br/nfe}TretEvento"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TVerEvento" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TProcEvento", namespace = "http://www.portalfiscal.inf.br/nfe", propOrder = {
    "evento",
    "retEvento"
})
public class TProcEvento {

    @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
    protected TEvento evento;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
    protected TretEvento retEvento;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Obtém o valor da propriedade evento.
     * 
     * @return
     *     possible object is
     *     {@link TEvento }
     *     
     */
    public TEvento getEvento() {
        return evento;
    }

    /**
     * Define o valor da propriedade evento.
     * 
     * @param value
     *     allowed object is
     *     {@link TEvento }
     *     
     */
    public void setEvento(TEvento value) {
        this.evento = value;
    }

    /**
     * Obtém o valor da propriedade retEvento.
     * 
     * @return
     *     possible object is
     *     {@link TretEvento }
     *     
     */
    public TretEvento getRetEvento() {
        return retEvento;
    }

    /**
     * Define o valor da propriedade retEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link TretEvento }
     *     
     */
    public void setRetEvento(TretEvento value) {
        this.retEvento = value;
    }

    /**
     * Obtém o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

}
