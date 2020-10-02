package org.docx4j.convert.in.xhtml;

import org.docx4j.jaxb.Context;
import org.docx4j.model.styles.StyleUtil;
import org.docx4j.wml.PPr;
import org.docx4j.wml.RPr;

public class StyleUtilExtended extends StyleUtil {
    public static RPr clearStyle(RPr rPr) {
        if (rPr == null) {
            rPr = Context.getWmlObjectFactory().createRPr();
        }

        rPr.setLang(null);
        rPr.setRStyle(null);
        rPr.setRFonts(null);
        rPr.setB(null);
        rPr.setBCs(null);
        rPr.setI(null);
        rPr.setICs(null);
        rPr.setCaps(null);
        rPr.setSmallCaps(null);
        rPr.setStrike(null);
        rPr.setDstrike(null);
        rPr.setOutline(null);
        rPr.setShadow(null);
        rPr.setEmboss(null);
        rPr.setImprint(null);
        rPr.setSnapToGrid(null);
        rPr.setVanish(null);
        rPr.setColor(null);
        rPr.setSpacing(null);
        rPr.setW(null);
        rPr.setKern(null);
        rPr.setPosition(null);
        rPr.setSz(null);
        rPr.setSzCs(null);
        rPr.setHighlight(null);
        rPr.setU(null);
        rPr.setEffect(null);
        rPr.setBdr(null);
        rPr.setShd(null);
        rPr.setVertAlign(null);
        rPr.setRtl(null);
        rPr.setCs(null);
        rPr.setEm(null);
        rPr.setSpecVanish(null);
        rPr.setOMath(null);

        return rPr;
    }
    
    public static PPr clearStyle(PPr pPr) {
        if (pPr == null) {
            pPr = Context.getWmlObjectFactory().createPPr();
        }

        pPr.setKeepNext(null);
        pPr.setKeepLines(null);
        pPr.setPageBreakBefore(null);
        pPr.setFramePr(null);
        pPr.setWidowControl(null);
        pPr.setNumPr(null);
        pPr.setSuppressLineNumbers(null);
        pPr.setPBdr(null);
        pPr.setShd(null);
        pPr.setTabs(null);
        pPr.setSuppressAutoHyphens(null);
        pPr.setKinsoku(null);
        pPr.setWordWrap(null);
        pPr.setOverflowPunct(null);
        pPr.setTopLinePunct(null);
        pPr.setAutoSpaceDE(null);
        pPr.setAutoSpaceDN(null);
        pPr.setBidi(null);
        pPr.setAdjustRightInd(null);
        pPr.setSnapToGrid(null);

        pPr.setSpacing(null);

        pPr.setInd(null);

        pPr.setContextualSpacing(null);
        pPr.setMirrorIndents(null);
        pPr.setSuppressOverlap(null);
        pPr.setJc(null);
        pPr.setTextDirection(null);
        pPr.setTextAlignment(null);
        pPr.setTextboxTightWrap(null);
        pPr.setOutlineLvl(null);
        pPr.setCnfStyle(null);
        
        return pPr;
    }
}
