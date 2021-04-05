package com.roshka.sifen.model.de;

import com.roshka.sifen.exceptions.SifenException;
import com.roshka.sifen.model.SifenObjectBase;
import com.roshka.sifen.model.SifenObjectFactory;
import com.roshka.sifen.model.de.types.TiCondOpe;
import com.roshka.sifen.util.ResponseUtil;
import org.w3c.dom.Node;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TgCamCond extends SifenObjectBase {
    private TiCondOpe iCondOpe;
    private List<TgPaConEIni> gPaCondEIniList;
    private TgPagCred gPagCred;

    public void setupSOAPElements(SOAPElement gDtipDE) throws SOAPException {
        SOAPElement gCamCond = gDtipDE.addChildElement("gCamCond");
        gCamCond.addChildElement("iCondOpe").setTextContent(String.valueOf(this.iCondOpe.getVal()));
        gCamCond.addChildElement("dDCondOpe").setTextContent(this.iCondOpe.getDescripcion());

        if (gPaCondEIniList != null || this.iCondOpe.getVal() == 1 || this.gPagCred.getdMonEnt() != null) {
            for (TgPaConEIni gPaConEIni : Objects.requireNonNull(gPaCondEIniList)) {
                gPaConEIni.setupSOAPElements(gCamCond);
            }
        }

        if (this.iCondOpe.getVal() == 2)
            this.gPagCred.setupSOAPElements(gCamCond);
    }

    @Override
    public void setValueFromChildNode(Node value) throws SifenException {
        switch (value.getLocalName()) {
            case "iCondOpe":
                this.iCondOpe = TiCondOpe.getByVal(Short.parseShort(ResponseUtil.getTextValue(value)));
                break;
            case "gPaConEIni":
                if (this.gPaCondEIniList == null) {
                    this.gPaCondEIniList = new ArrayList<>();
                }
                this.gPaCondEIniList.add(SifenObjectFactory.getFromNode(value, TgPaConEIni.class));
                break;
            case "gPagCred":
                this.gPagCred = SifenObjectFactory.getFromNode(value, TgPagCred.class);
                break;
        }
    }

    public TiCondOpe getiCondOpe() {
        return iCondOpe;
    }

    public void setiCondOpe(TiCondOpe iCondOpe) {
        this.iCondOpe = iCondOpe;
    }

    public TgPagCred getgPagCred() {
        return gPagCred;
    }

    public void setgPagCred(TgPagCred gPagCred) {
        this.gPagCred = gPagCred;
    }

    public List<TgPaConEIni> getgPaCondEIniList() {
        return gPaCondEIniList;
    }

    public void setgPaCondEIniList(List<TgPaConEIni> gPaCondEIniList) {
        this.gPaCondEIniList = gPaCondEIniList;
    }
}
