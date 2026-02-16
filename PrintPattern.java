public class PrintPattern {
    public static void main(String[] args) {
        int n = 8;
        int k;
        int num1 = 3, num2 = 4;

        for(int i =0;i<6;i++)
        {
                k = num1 + num2;
                System.out.println(num1 + " " + num2 + " " + k);
                num2 ++;
                num1 =k;
            }
        }
    }

