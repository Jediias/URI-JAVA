import  java.util.Locale ;
import  java.util.Scanner ;

/ **
 * Criado por $ {ZafrullahSyed} em 23.04.2016.
 * /
 classe  pública URI_1173 {
    public  static  void  main ( String [] args ) {
        Localidade . setDefault ( localidade . EUA );

        Scanner sc =  new  Scanner ( Sistema . Em);
        int num = sc . nextInt ();
        if (num > =  50 ) {
            retorno ;
        } mais {
            Sistema . fora . println ( " N [] = "  + num);
            para ( int i =  2 ; i <=  10 ; i ++ ) {
                num = num *  2 ;
                Sistema . fora . println ( " N [ "  + i +  " ] = "  + num);
            }
        }
    }
}
