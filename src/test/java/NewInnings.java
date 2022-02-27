//public class NewInnings {
//
//    public static void main(String[] args) {
//
//    }
//
//    public void aa(){
//
       // int arr[] = {1,2,2,9,3,2};
//   19
//1
//
//        1+2         2+3
//            3+2     5
//
//
//        0 1 0 0 3 5 4
//        i                j
//        0 +1          4            i<j
//        1+0            4           i<j
//        1 +0           4           i<j
//         1+3           4           i=j
//         i+1 ==j-1
//         return i+1;
//
//        {-7, 1, 5, 2, -4, 3, 0};
//        String str = "javaconceptoftheday";
//   //     o/p  =     oftheday ,cepto
//
//       // String s = "pwwkew"
//       p - 1
//       w - 3
//       k - 1
//       e  -1
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
public class NewInnings {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};

        int sum=0;
        for(int  i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
        int sum_l=0;
        int sum_r=0;

        for(int  i=1;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                sum_l=sum_l + arr[j];
            }


            System.out.print("sum_l " + sum_l);

            sum_r = (sum - arr[i]-sum_l);
            System.out.print("sum_r " + sum_r);
            System.out.println("");
            if(sum_l == sum_r)
            {
                System.out.println("index is" + i);
                break;
            }
            if(sum_l != sum_r)
            {
                sum_l=0;
                sum_r=0;
            }
        }


    }

}