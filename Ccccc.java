public class Ccccc {
    public static void main(String[] args) {
       for (int i=1;i<=9;i++){
           for (int j=1;j<=9-i;j++){
               System.out.print(" ");
           }
           for (int j=1;j<=2*i-1;j++){
               System.out.print("*");
           }
           System.out.println();
       }
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 17 - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();奥术大师大所大所大所
        }

        for (int i=1;i<=5;i++){
            for (int j=1;j <= 5 - i;j++){
                System.out.print(" ");
            }
            for (int j=1;j <= 2 * i - 1;j++){
                if (j==1||j==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=1;i<=4;i++) {
             for (int j =1;j <= i;j++){
                 System.out.print(" ");
             }
             for (int j = 1; j <= 9 - 2 * i; j++){
                 if (j==1||j==9-2*i){
                     System.out.print("*");
                 }else{
                     System.out.print(" ");
                 }
             }
            System.out.println();
        }





















    }
}
