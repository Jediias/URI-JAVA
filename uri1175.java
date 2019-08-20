import  java.util.Scanner ;
public  class  Main {

    public  static  void  main ( String [] args ) {
        Entrada do scanner =  novo  Scanner ( System . In);
        int n [] =  novo  int [ 20 ];
        
        para ( int i =  0 ; i < n . comprimento; i ++ ) {
            n [i] = entrada . nextInt ();
        }
        
        int indexFinal = n . comprimento -  1 ;
        para ( int i =  0 ; i < n . comprimento /  2 ; i ++ ) {
            int aux = n [i];
            n [i] = n [indexFinal];
            n [indexFinal] = aux;
            indexFinal - ;
        }
               
        para ( int i =  0 ; i < n . comprimento; i ++ ) {
            Sistema . fora . println ( " N [ "  + i +  " ] "  +  " = "  + n [i]);
        }
    }
}
