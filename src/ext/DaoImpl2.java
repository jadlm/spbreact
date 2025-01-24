package ext;

import deo.Ideo;

public class DaoImpl2 implements Ideo {
    @Override
    public double getData() {
        System.out.println("version Capteurs");
        double temp=6000;
        return temp;
    }
}
