package Day5;

public class Pgm22 {
    public static void main(String[] args) {
        int [][] m1 = {{1, 2, 3}, {4, 15, 6}, {7, 8, 9}};
        int [][] m2 = {{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        int [][] sum =new int[3][3];
        int [][] pro = new int[3][3];
        System.out.println("sum:\n");
        for(int i= 0; i<3; i++){
            for(int j=0; j<3; j++){
                sum[i][j] = m1[i][j]+m2[i][j];
                System.out.print(sum[i][j]+"  ");
            }
            System.out.println();

        }
        for (int i = 0; i < 3; i++){
            for(int j =0; j<3; j++){
                for(int k=0; k<3; k++){
                    pro[i][k]=m1[i][j]*m2[j][k];
                }
            }
        }
        System.out.println("pro:\n");
        for(int i= 0; i<3; i++){
            for(int j=0; j<3; j++){
                
                System.out.print(pro[i][j]+"  ");
            }
            System.out.println();

        }

    }
}
