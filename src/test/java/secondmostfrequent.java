import java.util.*;
import java.util.regex.Pattern;

public class secondmostfrequent {

    public static void main(String[] args) {
        sortwithSpecificOrder();
        reverseWthSpace();
        findDuplicate();
        arrange(new long[]{1, 0},2);
        primeNumber();
        spaceString("abcd");
        //reverseString("hello whats up , i am fne");
//        reversewithspaceintact();
//        removeduplicatechars();
//        anagram();
//        stringPalindrome("madam");
//        System.out.println(stringPalindrome("nikhil"));
//        countWords();
//        twoSum();
        //reversewithsameorderofspace();
//        threesum();
//        segregatezeroandone();
//        largestNumberInArray();
//        replaceSubstring();
//        reverseWordsInString();
//        reverseString();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        String str = "DevLabsAlliance";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int value = map.get(arr[i]);
                map.put(arr[i], value + 1);
                System.out.println(arr[i]);
                break;
            }
        }
        System.out.println("hello");
        System.out.println(map);
    }


    public static void reverseString() {
        String s = "Learn Lead And Succeed in DevLabsAlliance";
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(s);
        String reverse = new String(arr);
        System.out.println(reverse);
        reverse.equals(s);
        System.out.println(reverse.equals(s));
    }

    public static void reverseWordsInString() {
        String str[] = "I work at Educative".split(" ");

        String rev = "";
        for (int i = str.length - 1; i >= 0; i--) {
            rev = rev + str[i] + " ";
        }

        System.out.println(rev);
    }

    public static void replaceSubstring() {
        String str = "Learn, Lead and Succeed in DevLabsAlliance in europe";
        String tobereplacedwth = "no";
        String newStr = "";
        String[] strarray = str.split("in");
        System.out.println(strarray);
        for (int i = 0; i < strarray.length; i++) {
            if (i == 0) {
                newStr = newStr + strarray[i];
            } else {
                newStr = newStr + " " + tobereplacedwth + " " + strarray[i];
            }
        }
        System.out.println(newStr);

    }

    public static void largestNumberInArray() {
        int[] arr = {28, 3, 15, 9, 17, 4, 23, 2};
        int maxValue = 0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > maxValue) {
                maxValue = arr[index];
            }
        }
        System.out.println(maxValue);

    }

    public static void segregatezeroandone() {
        int[] arr = {1, 0, 1, 0, 0, 1, 1, 1, 0};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
                arr[i] = 1;
            }
        }
        System.out.println(count);
        for (int i = arr.length - count; i < arr.length; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void threesum() {
        int[] arr = {1, 5, 2, 8, 0, 3, 6, 7, 5};
        Arrays.sort(arr);
        int targetsum = 8;
        List<Integer[]> triplets = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int currentsum = arr[i] + arr[left] + arr[right];
                if (currentsum == targetsum) {
                    Integer[] newtriplet = {arr[i], arr[left], arr[right]};
                    triplets.add(newtriplet);
                    left++;
                    right--;
                } else if (currentsum < targetsum) {
                    left++;
                } else if (currentsum > targetsum) {
                    right--;
                }
            }

        }
        triplets.forEach((x) -> {
            for (int i = 0; i < x.length; i++) {
                System.out.println(x[i]);
            }
        });
        System.out.println("done");
    }

    public static void twoSum() {
        int target = 10;
        int[] arr = {3, 5, -4, 8, 11, 1, -1, 6};
        HashMap map = new HashMap();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                System.out.println("nik");
                System.out.println(map);
                System.out.println(target - arr[i]);
                System.out.println(arr[i]);

            } else {
                map.put(arr[i], true);
            }
        }
        System.out.println(map);
    }

    public static void countWords() {
        HashMap<String, Integer> map = new HashMap();
        String str = "Training Training course and certification course in DevlabsAlliance";
        Pattern p = Pattern.compile("\\s");
        String[] strarr = p.split(str);
        //String [] strarr = str.split("");
        for (int i = 0; i < strarr.length; i++) {
            if (map.containsKey(strarr[i])) {
                int count = map.get(strarr[i]);
                map.put(strarr[i], ++count);
            } else {
                map.put(strarr[i], 1);
            }
        }
        System.out.println(map);

    }

    public static Object stringPalindrome(String original) {
        //String original = "nitin",
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }

    public static void anagram() {
        String ana = "cat";
        String expectedAnagram = "act";
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int chara = (int) ch[i];
            System.out.println(chara + "character" + ch[i]);
        }
        for (int i = 0; i < str.length(); i++) {
            int chara = str.charAt(i);
            System.out.println(chara + "character" + ch[i]);
        }
        if (ana.hashCode() == expectedAnagram.hashCode()) {
            System.out.println("mygod");
        }
        Map map1 = putinmap("cat");
        Map map2 = putinmap("act");
        if (map1.equals(map2)) {
            System.out.println("solution by hashmap");
        }

    }

    public static Map putinmap(String str) {
        HashMap<Character, Integer> map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) map.put(str.charAt(i), 1);
            else {
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), count++);
            }
        }
        return map;
    }

    public static void removeduplicatechars() {
        LinkedHashSet set = new LinkedHashSet<>();
        String str = "Nikhil Is a Good boy";
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        System.out.println(set);
    }

    public static void reversewithspaceintact() {
        String original = "Nikhil Is a Good boy";
        char[] array = original.toCharArray();
        char[] finalarray = new char[array.length];
        String reverse = "";
        for (int i = 0; i >= array.length; i++) {
            if (array[i] == ' ') {
                finalarray[i] = ' ';
            }
        }
        int j = 0;
        for (int i = array.length - 1; i >= 0; i++) {
            if (!(finalarray[i] == ' ')) {
                finalarray[j] = array[i];
                j++;
            }
        }
    }

    static void reverseString(String input) {

        char[] inputArray = input.toCharArray();
        char[] result = new char[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }

        int j = result.length - 1;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != ' ') {
                if (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        System.out.println(input + " --> " + String.valueOf(result));
    }


    boolean isPalindrome(int input) {
        int reversed = reverse(input);
        return input == reversed;
    }

    private int reverse(int input) {
        int lastDigit, sum = 0, temp;
        temp = input;
        while (temp > 0) {
            lastDigit = temp % 10;
            sum = (sum * 10) + lastDigit;
            temp = temp / 10;
        }
        return sum;
    }


    public boolean check(int input) {
        int temp, digit, sumOfPower = 0;
        temp = input;
        int digits = countDigit(input);
        while (temp != 0) {
            digit = temp % 10;
            System.out.println("Current Digit is " + digit);
            sumOfPower = sumOfPower + (int) Math.pow(digit, digits);
            System.out.println("Current sumOfPower is " + sumOfPower);
            temp /= 10;
        }
        return sumOfPower == input;
    }

    static int countDigit(long n) {
        return (int) Math.floor(Math.log10(n) + 1);
    }

    public static int getNthFib(int n) {
        if (n <= 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return getNthFib(n - 1) + getNthFib(n - 2);
    }

    public static void factorial(String args[]) {
        int i, fact = 1;
        int number = 5;//It is the number to calculate factorial
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }



    static ArrayList<String> spaceString(String str) {
        // Your code here
        ArrayList<String> strList = new ArrayList<>();
        String temp = "";
        for (int i = 0;i< str.length() - 1; i++) {
            int j =i+1;
            temp = str.substring(i,j) + " "+ str.substring(str.length()-i-1);
         strList.add(temp);
        }
        System.out.println(strList);
        return strList;
    }


    public static void primeNumber(){
        int n =98;
        for(int i=2;i<(int)Math.sqrt(n)+1;i++){
            if(n%i==0){
                System.out.println("it is not prime");
                return;
            }
        }
        System.out.println("it is a prime number ");

        System.out.println("For Loop:");
//        for (Map.Entry me : hmap.entrySet()) {
//            System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
//        }
    }
    static void arrange(long arr[], int n)
    {
        // your code here
        for(int i=0; i<n;i++)
        {
            arr[i] = arr[(int) arr[i]] ;
        }    //
    }


    public static void findDuplicate(){
        Map<Character, Integer> map = new HashMap<>();
        String str = "aaaabbbccc";
        char [] array = str.toCharArray();
        for (int i = 0; i <array.length; i++) {
            if(map.containsKey(array[i])){
                int value = map.get(array[i]);
                map.put(array[i],++value);
            }
            else{
                map.put(array[i],1);
            }
        }
        for(Map.Entry<Character,Integer> e : map.entrySet() ){
            if(e.getValue()>1){
                System.out.println(e.getKey() +" "+e.getValue());
            }
        }

    }

    public static void reverseWthSpace() {
        String str = "aaaabb bccc qa";
        char[] array = str.toCharArray();
        char [] newArray = new char[array.length];
        for (int i = 0; i <array.length ; i++) {
            if(array[i] == ' '){
                newArray[i] = array[i];
            }
        }
        int j =0;
        for (int i = array.length-1; i >=0 ; i--) {
            if(array[i]==' ' ){
                continue;
            }
            if(newArray[j]==' '){
                j++;
            }

                newArray[j] = array[i];
                j++;

        }
        for (int i = 0; i <newArray.length ; i++) {
            System.out.println(newArray[i]);
        }
    }

    private void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    public static void sortwithSpecificOrder(){
        int n = 5;
        char nuts[] = {'@', '%', '$', '#', '^'};
        char bolts[] = {'%', '@', '#', '$', '^'};
        List nutsList =  new ArrayList<Character>();
        List boltsList = new ArrayList();



//        List<Character> al =
//                new ArrayList<Character>(Arrays.asList(nuts));


        for (int i = 0; i <nuts.length ; i++) {
            nutsList.add(nuts[i]);
        }
        for (int i = 0; i <bolts.length ; i++) {
            boltsList.add(bolts[i]);
        }

        Collections.sort(nutsList,new StringComparator());
        for (int i = 0; i <nutsList.size() ; i++) {
            System.out.println(nutsList.get(i));
        }



    }

    private static class StringComparator implements Comparator<Character>{
    Map<Character, Integer> map = new HashMap<>();
    char [] array = {'!', '#', '$' ,'%', '&', '*', '@' ,'^', '~'};
        @Override
        public int compare(Character o1, Character o2) {
            if(map.isEmpty()){
                for (int i = 0; i <array.length ; i++) {
                    map.put(array[i],i);
                }
            }
//            return map.get(o1)-map.get(o2);
            if(map.get(o1)<map.get(o2)){
                return -1;
            }
            else if(map.get(o1)>map.get(o2)){
                return 1;
            }
            return 0;
        }
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList());
            }
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}




// public static void reversewithsameorderofspace(){
//        String reverse = "";
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//        scan.close();
//
//        ArrayList arrayList = new ArrayList<Integer>();
//     for (int i = 0; i <str.length() ; i++) {
//         if(str.charAt(i) == null ){
//         arrayList.add(i);
//         }
//     }
//     for (int i = 0; i <arr.length/2 ; i++)
//     {
//         if(arrayList.contains(i)){
//             reverse = reverse +"";
//         }
//         char temp;
//         temp = arr[i];
//         arr[i] = arr[arr.length-i-1];
//         arr[arr.length-i-1] =temp;
//     }
//     String nik = new String(reverse);
//     System.out.println(nik);
// }


