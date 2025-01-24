package deo;

public class DaoImpl  implements Ideo{
    @Override
    public double getData() {
        /*
        se connecter a la BD pour recuperer la temperature
         */
        double temp=Math.random()*40;
        return temp;
    }
}
