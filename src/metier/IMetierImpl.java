package metier;

import deo.Ideo;

public class IMetierImpl implements IMetier {
    private Ideo dao;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
/* injecter dans la variable doa un objet d une classe qui implimente l'interface Ideo */
    public void setDao(Ideo dao) {
        this.dao = dao;
    }
}
