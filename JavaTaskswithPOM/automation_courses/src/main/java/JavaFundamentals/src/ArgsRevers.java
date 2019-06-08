public class ArgsRevers{

    public static void main (String []args){
       args=new String[4];
       args[0]="аптека";
       args[1]="фонарь";
       args[2]="улица";
       args[3]="ночь";


        for( int i = args.length-1  ; i >= 0 ; i--) {
            System.out.print( args[i]+ " ");
        }



    }
}
