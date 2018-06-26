package br.com.samuelweb.nfe.util.model;

import br.com.samuelweb.nfe.util.annotation.NfeCampo;
import br.com.samuelweb.nfe.util.annotation.NfeObjeto;
import br.com.samuelweb.nfe.util.annotation.NfeObjetoList;
import br.com.samuelweb.nfe.util.consts.NfeConsts;
import br.com.samuelweb.nfe.util.enumeration.ModalidadeFrete;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

import java.util.List;

public class Transp {

    @NfeCampo(tipo = ModalidadeFrete.class, id = "X02", tag = "modFrete"
            , tamanhoMinimo = 1, tamanhoMaximo = 1
            , ocorrencias = 1, descricao = NfeConsts.DSC_MODFRETE)
    private ModalidadeFrete modFrete;

    @NfeCampo(id = "X25a", tag = "vagao"
            , tamanhoMinimo = 1, tamanhoMaximo = 20,
            ocorrencias = 0, descricao = NfeConsts.DSC_VAGAO)
    private String vagao;

    @NfeCampo(id = "X25b", tag = "balsa"
            , tamanhoMinimo = 1, tamanhoMaximo = 20
            , ocorrencias = 0, descricao = NfeConsts.DSC_BALSA)
    private String balsa;

    @NfeObjeto(id = "X03", tag = "transporta", descricao = NfeConsts.DSC_TRANSP, ocorrencias = 0)
    private Transporta transporta;

    @NfeObjeto(id = "X11", tag = "retTransp", descricao = NfeConsts.DSC_RETTRANSP, ocorrencias = 0)
    private RetTransp retTransp;

    @NfeObjeto(id = "X18", tag = "veicTransp", descricao = NfeConsts.DSC_VEICTRANSP, ocorrencias = 0)
    private Veiculo veicTransp;

    @NfeObjetoList(id = "X22", tag = "reboque", descricao = NfeConsts.DSC_GREBOQUE, ocorrenciaMinima = 0, ocorrenciaMaxima = 5)
    private List<Veiculo> reboque;

    @NfeObjetoList(id = "X26", tag = "vol", descricao = NfeConsts.DSC_GVOLUMES, ocorrenciaMinima = 0, ocorrenciaMaxima = 5000)
    private List<Vol> vol;

    public TNFe.InfNFe.Transp build() {
        TNFe.InfNFe.Transp transp = new TNFe.InfNFe.Transp();
        if (this.getModFrete() != null) {
            transp.setModFrete(this.getModFrete().getValue().toString());
        }
        if (this.getTransporta() != null) {
            transp.setTransporta(this.getTransporta().build());
        }
        if (this.getRetTransp() != null) {
            transp.setRetTransp(this.getRetTransp().build());
        }
        if (this.getVeicTransp() != null) {
            transp.setVeicTransp(this.getVeicTransp().build());
        }
        if (this.getReboque() != null) {
            getReboque().forEach(e -> transp.getReboque().add(e.build()));
        }
        if (this.getVol() != null) {
            getVol().forEach(e -> transp.getVol().add(e.build()));
        }

        return transp;
    }

    public ModalidadeFrete getModFrete() {
        return modFrete;
    }

    public void setModFrete(ModalidadeFrete modFrete) {
        this.modFrete = modFrete;
    }

    public String getVagao() {
        return vagao;
    }

    public void setVagao(String vagao) {
        this.vagao = vagao;
    }

    public String getBalsa() {
        return balsa;
    }

    public void setBalsa(String balsa) {
        this.balsa = balsa;
    }

    public Transporta getTransporta() {
        return transporta;
    }

    public void setTransporta(Transporta transporta) {
        this.transporta = transporta;
    }

    public RetTransp getRetTransp() {
        return retTransp;
    }

    public void setRetTransp(RetTransp retTransp) {
        this.retTransp = retTransp;
    }

    public Veiculo getVeicTransp() {
        return veicTransp;
    }

    public void setVeicTransp(Veiculo veicTransp) {
        this.veicTransp = veicTransp;
    }

    public List<Veiculo> getReboque() {
        return reboque;
    }

    public void setReboque(List<Veiculo> reboque) {
        this.reboque = reboque;
    }

    public List<Vol> getVol() {
        return vol;
    }

    public void setVol(List<Vol> vol) {
        this.vol = vol;
    }
}
