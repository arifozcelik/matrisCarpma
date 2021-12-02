package kitapSonuOrnekleri;

public class matrisCarpma {
    public static void main(String[] args) {
        int sa, su, k;
        int A[][] = { {3,5,9} , {4,6,1} , {1,8,2} };
        int B[][] = { {1,0,3} , {4,5,7} , {2,3,6} };
        int C[][] = new int[3][3];
        for (sa=0;sa<3;sa++)
        {
            for (su = 0; su<3;su++)
            {
                C[sa][su] = 0;
                for (k = 0; k<3; k++)
                {
                    C[sa][su] += A[sa][k] * B[k][su];
                } //for k sonu
                System.out.printf("%3d", C[sa][su]);
            }//FOR SU SONU
            System.out.printf("\n");
        }//for sa sonu
    }
}
