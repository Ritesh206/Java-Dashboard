public class CheckingDiagonalMatrix {
    public static void main(String[] args) {
        int arr[][]={
                {1 , 0 , 0},
                {0 , 1 , 0},
                {0 , 0 , 1}
        };
        int flag = 0;
        for (int i = 0; i<3 ; i++)
        {
            for(int j = 0; j<3 ;j++)
            {
               if (arr[i][j] == 0)
               {
                   flag = 1;
                   break;
               } else if (arr[i][j]!= 0) {
                   flag = 1;
                   break;
               }
            }
        }
        if(flag != 0)
            System.out.println("It is a Diagonal Matrix");
        else
            System.out.println("It is not a Diagonal Matrix");
    }
}
