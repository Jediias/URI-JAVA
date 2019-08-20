pacote  uri ;

import  java.util.Scanner ;

 classe  pública URI1174 {
    public  static  void  main ( String [] args ) {
        Scanner input =  new  Scanner ( System . In);
        double a [] =  novo  duplo [ 5 ];
        para ( int i = 0 ; i < a . comprimento; i ++ ) {
            a [i] = entrada . nextDouble ();
        }
        para ( int i = 0 ; i < a . comprimento; i ++ ) {
            if (a [i] <= 10 ) {
                Sistema . fora . println ( " A [ " + i + " ] = " + a [i]);
            }
        }
    }
}
