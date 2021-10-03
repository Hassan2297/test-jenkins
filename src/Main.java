/**
 * @author Hassan Wael
 */
public class Main {
    public static void main(String[] args){

//        MobileService mobileService = new MobileService();
//        BookService bookService = new BookService();
//
//        mobileService.createMobileItem(new Mobile("iphone",150));
//        bookService.createBookItem(new Book(50,"2343"));
//
//        ShoppingCartVisitor shoppingCartVisitor = new ShoppingCartVisitorImpl();
//
//        mobileService.accept(shoppingCartVisitor);
//        bookService.accept(shoppingCartVisitor);

        System.out.println("Hello Hassan Wael");

//        System.out.println(removeElement1(new int[]{2,2,2,2,2,2,2,2,2}, 2));
//        System.out.println(titleToNumber("FXSHRXW"));
//        int[] array = new int[]{0,0,1,1,1,2,2,3,3,4};
//
//        System.out.println(firstUniqChar("aabb"));

//        System.out.print(lengthOfLastWord("Hello World"));
//        findListOfMusic(new LinkedList<>(Arrays.asList(141,156,94,88,61,111)));
//        countDown(5);
//        int[] sum = new int[]{1,2,3,4,5,6,7,8,9,10};
//        ArrayList<Integer> result = quickSort(new ArrayList<>(Arrays.asList(3,5,2,1,4)));
//        System.out.println(isValid("){"));
//        creatLinkedList();

    }

//    public static int[] plusOne(int[] digits) {
//        for (int i = digits.length - 1; i >= 0; i--) {
//            if (digits[i] != 9) {
//                digits[i]++;
//                break;
//            } else {
//                digits[i] = 0;
//            }
//        }
//        if (digits[0] == 0) {
//            int[] result = new int[digits.length + 1];
//            result[0] = 1;
//            return result;
//        }
//        return digits;
//    }
//
//
//    public static int removeElement1(int[] nums, int val) {
//        int j = 0;
//        for(int i=0; i<nums.length; i++){
//            if(nums[i] != val){
//                nums[j] = nums[i];
//                j++;
//            }
//        }
//        return j;
//    }
//
//    public static int hammingWeight(long n) {
//        int count = 0;
//        for (int i = 0; i < 32; ++i) {
//            if (((n >>> i) & 1) == 1) {
//                ++count;
//            }
//        }
//        return count;
//    }
//
//    public static int singleNumber(int[] nums) {
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        int counter = 1;
//        for (int num : nums) {
//            if(hashMap.containsKey(num)){
//                int count  = hashMap.get(num) + 1;
//                hashMap.put(num, count);
//            } else {
//                hashMap.put(num, counter);
//            }
//        }
//
//        return hashMap.entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() == 1)
//                .map(Map.Entry::getKey)
//                .findFirst().get();
//    }
//
//    public static int majorityElement(int[] nums) {
//        if(nums.length == 1){
//            return nums[0];
//        }
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        int result = 0;
//        for(int num : nums){
//            if(hashMap.containsKey(num)) {
//                int count = hashMap.get(num) + 1;
//                if(count > (nums.length / 2)){
//                    result = num;
//                }
//                hashMap.put(num, count);
//            } else {
//                hashMap.put(num, 1);
//            }
//        }
//        return result;
//    }
//
//    public static int titleToNumber(String columnTitle) {
//        final int[] countLetter = {0};
//        int result = 0;
//        HashMap<Character, Integer> map = new HashMap<>() {
//            {
//                for (char ch = 'A'; ch <= 'Z'; ++ch){
//                    countLetter[0] = countLetter[0] + 1;
//                    put(ch, countLetter[0]);
//                }
//            }
//        };
//
//        for (int i = 0; i < columnTitle.length() - 1; i++) {
//            result = result + (map.get(columnTitle.charAt(i)) * 26);
//        }
//        result = result + map.get(columnTitle.charAt(columnTitle.length() - 1));
//        return result;
//    }
//
//    public static int binarySearch(int[] arr, int item){
//        int low = 0;
//        int high = arr.length - 1;
//        while (low <= high){
//            int mid = (low + high) / 2;
//            int guess = arr[mid];
//            if(guess == item)
//                return mid;
//            else if(guess > item)
//                high = mid - 1;
//            else low = mid + 1;
//        }
//        return 0;
//    }
//
//    public static int searchInsert(int[] nums, int target) {
//        int low = 0;
//        int high = nums.length - 1;
//        while (low <= high){
//            int mid = (low + high) / 2;
//            int guess = nums[mid];
//            if(guess == target)
//                return mid;
//            else if(guess > target)
//                high = mid - 1;
//            else low = mid + 1;
//        }
//        if(low < nums.length){
//            if(nums[low] > target){
//                return low;
//            }
//            return high + 1;
//        }
//        return nums.length;
//    }
//
//    public static List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        List<Integer> current = new ArrayList<>();
//        for (int num : nums) {
//            current.add(num);
//        }
//        permuteRecursive(result, current, new ArrayList<>());
//        System.out.println(result.size());
//        return result;
//    }
//
//    public static void permuteRecursive(List<List<Integer>> res, List<Integer> current, List<Integer> permutation) {
//        if (current.size() == 0) {
//            res.add(new ArrayList<>(permutation));
//            return;
//        }
//        for (int i = 0; i < current.size(); i++) {
//            int x = current.get(i);
//            current.remove(i);
//            permutation.add(x);
//            permuteRecursive(res, current, permutation);
//            permutation.remove(Integer.valueOf(x));
//            current.add(i, x);
//        }
//    }
//
//    public static int lengthOfLastWord(String s) {
//        int counter = 0;
//        for(int i=s.length() - 1; i > 0; i--){
//            if(s.charAt(i) == ' '){
//                break;
//            }
//            counter = counter + 1;
//        }
//        return counter;
//    }
//
//    public static int findSmallest(List<Integer> playCount){
//        // find smallest numberCount
//        int smallestCount = playCount.get(0);
//        int smallestIndex = 0;
//        for(int i=0; i < playCount.size(); i++){
//            if(playCount.get(i) < smallestCount){
//                smallestCount = playCount.get(i);
//                smallestIndex = i;
//            }
//        }
//        return smallestIndex;
//    }
//
//    public static void findListOfMusic(List<Integer> playCount){
//        List<Integer> results = new ArrayList<>();
//        for(int i=0; i<playCount.size(); i++){
//            int smallest = findSmallest(playCount);
//            results.add(playCount.get(smallest));
//            playCount.remove(smallest);
//        }
//        System.out.println(results.toString());
//    }
//
//    public static int countDown(int number){
//        System.out.println(number);
//        if(number <= 0){
//            return 0;
//        } else {
//            return countDown(number -1);
//        }
//    }
//
//    public static int factorial(int number){//3
//        if(number == 1){
//            return 1;
//        }
//        return number * factorial(number - 1);
//    }
//
//    public static int recursiveSum(int[] numbers, int size){
//        if(size == 0){
//            return 0;
//        } else if(size == 1){
//            return numbers[0];
//        }
//        return numbers[size - 1] + recursiveSum(numbers, size - 1);
//    }
//
//    public static int countItemsInArray(int size){
//        if(size == 0){
//            return 0;
//        }
//        return 1 + countItemsInArray(size -1 );
//    }
//
//    public static int maxNumInArr(int[] numbers, int size, int maxNum){
//        if(size == 0){
//            return maxNum;
//        }
//        if(maxNum < numbers[size -1]){
//            maxNum = numbers[size -1];
//        }
//        return maxNumInArr(numbers, size -1, maxNum);
//    }
//
//    public static int binarySearchRecursive(int[] numbers, int searchNum, int low, int high){
//        if(numbers.length == 0){
//            return 0;
//        }
//        int mid = (low + high)  / 2;
//        if(searchNum == numbers[mid]){
//            return numbers[mid];
//        } else if(searchNum > numbers[mid]){
//            low = mid + 1;
//        } else {
//            high = mid - 1;
//        }
//        return binarySearchRecursive(numbers, searchNum, low, high);
//    }
//
//    public static ArrayList<Integer> quickSort(ArrayList<Integer> numbers){
//        if(numbers.size() < 2){
//            return numbers;
//        }
//        int pivot = numbers.get(0);
//
//        ArrayList<Integer> greatArr = new ArrayList<>();
//        ArrayList<Integer> smallArr = new ArrayList<>();
//        for(int i=1; i<numbers.size(); i++){
//            if (numbers.get(i) > pivot) {
//                greatArr.add(numbers.get(i));
//            }
//        }
//        for(int i=1; i<numbers.size(); i++){
//            if (numbers.get(i) <= pivot) {
//                smallArr.add(numbers.get(i));
//            }
//        }
//
//        ArrayList<Integer> result = new ArrayList<>();
//        result.addAll(quickSort(smallArr));
//        result.add(pivot);
//        result.addAll(quickSort(greatArr));
//
//        return result;
//    }
//
//    public static String longestCommonPrefix(String[] strs) {
//        String mostPrefix = "";
//        if(strs.length == 0){
//            return "";
//        }
//        for (String str : strs) {
//            if (str.length() > mostPrefix.length()) {
//                mostPrefix = str;
//            }
//        }
//        for (String str : strs) {
//            if (str.equals(mostPrefix)) {
//                continue;
//            }
//            while (str.indexOf(mostPrefix) != 0) {
//                mostPrefix = mostPrefix.substring(0, mostPrefix.length() - 1);
//            }
//        }
//        return mostPrefix;
//    }
//
//    public static boolean isValid(String s) {
//        if(s.length() == 1){
//            return false;
//        }
//        Stack<Character> stack = new Stack<>();
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
//                stack.push(s.charAt(i));
//            } else if(s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']') {
//                char poped = 0;
//                if(!stack.empty()){
//                    poped = stack.pop();
//                    if(poped == '{' && s.charAt(i) != '}'){
//                        return false;
//                    } else if(poped == '(' && s.charAt(i) != ')'){
//                        return false;
//                    } else if(poped == '[' && s.charAt(i) != ']'){
//                        return false;
//                    }
//                } else {
//                    return false;
//                }
//            }
//        }
//        return stack.empty();
//    }
//
//    public static void creatLinkedList(){
//        /* Start with the empty list. */
//        LinkedList list = new LinkedList();
//
//        LinkedList.appendData(list, 1);
//        LinkedList.appendData(list, 2);
//        LinkedList.appendData(list, 3);
//        LinkedList.appendData(list, 5);
//        LinkedList.appendData(list, 6);
//        LinkedList.appendData(list, 7);
//        LinkedList.appendData(list, 8);
//        LinkedList.appendData(list, 10);
//
//        // Print the LinkedList
//        LinkedList.printList(list);
//    }
//
//    public static int removeDuplicates(int[] nums) {
//        if(nums.length == 0){
//            return 0;
//        }
//        int j = 0;
//        for(int i=0; i<nums.length - 1; i++){
//            if(nums[i] != nums[i+1]){
//                nums[j] = nums[i];
//                j++;
//            }
//        }
//        nums[j++] = nums[nums.length - 1];
//        return j;
//    }
//
//    public static int firstUniqChar(String s) {
//        HashMap<Character, Integer> hashMap = new HashMap<>();
//        for(int i=0; i<s.length(); i++){
//            if(hashMap.containsKey(s.charAt(i))){
//                int counter = hashMap.get(s.charAt(i)) + 1;
//                hashMap.put(s.charAt(i), counter);
//            } else {
//                hashMap.put(s.charAt(i), 1);
//            }
//        }
//
//        for(int i=0; i<s.length(); i++){
//            int counter = hashMap.get(s.charAt(i));
//            if(counter == 1){
//                return i;
//            }
//        }
//        return -1;
//    }
}
