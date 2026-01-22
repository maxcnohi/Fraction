public class EstimatePI{
   public static void main (String [] args){
       Fraction Milu = new Fraction(355, 113);
        double EPSLILON = Math.abs(Math.PI - Milu.toDecimal()); 
       while(Math.abs(Math.PI-Milu.toDecimal())>=EPSLILON){
           if(Milu.toDecimal()<Math.PI){
               Milu.setNum(Milu.getNum()+1);
           }else{
               Milu.setDenom(Milu.getDenom()+1);
           }
       }
       System.out.println(Milu);
   }
}