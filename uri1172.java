import  java.util.Scanner ;

/ **
 * Criado por $ {ZafrullahSyed} em 08.02.2016.
 * /
 classe  pública URI_1172 {
    public  static  void  main ( String [] args ) {

        Scanner sc =  new  Scanner ( Sistema . Em);
        int [] X  =  novo  int [ 10 ];
        int pos;

        para ( int i =  0 ; i <  X . comprimento; i ++ ) {
            X [i] = sc . nextInt ();
            pos = i;
            if ( X [i] <=  0 ) {
                X [i] =  1 ;
            }
            Sistema . fora . println ( " X [ "  + pos +  " ] "  +  "  "  +  " = "  +  "  "  +  X [i]);
        }
    }
}
