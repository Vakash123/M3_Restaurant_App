
package m3.billgenerator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Dhruva Kumar
 */
public class Maincourse extends Drinks{
    
        public double GetAmount(){
        drink = tea + coffee+sparkDrink+beer+rdwine+cider+cocktails+mocktails+gin+margerita+whiskey;
        
        maincourse = pizza+burger+ffries+noodles+chilops+chiwgs+chibct+paneer+honeychi+chimomo+chimajest ;
        
        totalofmd = drink + maincourse;
        return totalofmd;
    }
    
    private JFrame frame;
    
    public void iexitsystem(){
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "confirm if you want to exit", "HOT ON WHEELS RESTAURANT", 
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
    //=================PRICE===================
    public double ptea = 20;
    public double pcoffee=25;
    public double psparkDrink=30;
    public double pbeer=75;
    public double prdwine=150;
    public double pcider=125;
    public double pcocktails=90;
    public double pmocktails=190;
    public double pgin=270;
    public double pmargerita=165;
    public double pwhiskey=300;
    
    
    public double ppizza=300;
    public double pburger=150;
    public double pffries=120;
    public double pnoodles=90;
    public double pchilops=65;
    public double pchiwgs=250;
    public double pchibct=500;
    public double ppaneer=200;
    public double phoneychi=150;
    public double pchimomo=100;
    public double pchimajest=350;
    //=========================================
    
    public double mctax = 0.82;
    
    public Double cFindTax(double cAmount){
        double cFindTax = cAmount - (cAmount*mctax);
        return cFindTax;
    }
    
}
