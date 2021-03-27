import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Main3 {
    //位数为偶数位的个数
//    public static int findNumbers(int[] nums) {
//        int result = 0;
//        for(int i = 0; i < nums.length; i++) {
//            int tmp = nums[i];
//            int count = 0;
//            while(tmp != 0) {
//                count++;
//                tmp /= 10;
//            }
//            if(count % 2 == 0) result++;
//        }
//        return result;
//    }

    //二进制链表转整数
//    public int size(ListNode head) {
//        int count = 0;
//        ListNode cur = head;
//        while(cur != null) {
//            count++;
//            cur = cur.next;
//        }
//        return count;
//    }
//    public int getDecimalValue(ListNode head) {
//        if(head == null) return 0;
//        int n = size(head) - 1;
//        ListNode cur = head;
//        int sum = 0;
//        while(cur != null) {
//            sum += cur.val * (int)Math.pow(2,n--);
//            cur = cur.next;
//        }
//        return sum;
//    }

    //将数字变成 0 的操作次数
    //public int numberOfSteps (int num) {
    //        int n = 0;
    //        while(num != 0) {
    //            if(num % 2 == 0) {
    //                num /= 2;
    //                n++;
    //            } else {
    //                num -= 1;
    //                n++;
    //            }
    //        }
    //        return n;
    //    }


    //在既定时间做作业的学生人数
//    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
//        if(startTime.length != endTime.length) return -1;
//        int  n = startTime.length;
//        int count = n;
//        for(int i = 0; i < n; i++) {
//            if(startTime[i] > queryTime || endTime[i] < queryTime) {
//                count--;
//            }
//        }
//        return count;
//    }

    //速算机器人
//    public int calculate(String s) {
//        int x = 1,y = 0;
//        for(int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if(c == 'A') {
//                x = 2 * x + y;
//            }else if(c == 'B') {
//                y = 2 * y + x;
//            }
//        }
//        return x + y;
//    }

    //上升下降字符串
//    public static String sortString(String s) {
//        StringBuilder sb = new StringBuilder();
//        int[] arr = new int[26];
//        for(int i = 0; i < s.length(); i++) {
//            arr[s.charAt(i) - 'a']++;
//        }
//        int n = s.length();
//        while(n > 0) {
//            for(int i = 0; i < 26; i++) {
//                if(arr[i] != 0) {
//                    sb.append((char)(i + 'a'));
//                    arr[i]--;
//                    n--;
//                }
//            }
//            for(int i = 25; i >= 0; i--) {
//                if(arr[i] != 0) {
//                    sb.append((char)(i + 'a'));
//                    arr[i]--;
//                    n--;
//                }
//            }
//        }
//        return sb.toString();
//    }

    //分割平衡字符串
//    public static int balancedStringSplit(String s) {
//        Stack<Character> sc = new Stack<>();
//        int n = s.length();
//        int i = 0;
//        int count = 0;
//        while(i < n) {
//            sc.push(s.charAt(i++));
//            while(!sc.isEmpty()) {
//                if(s.charAt(i) == 'L' && sc.peek() == 'R') {
//                    sc.pop();
//                } else if(s.charAt(i) == 'R' && sc.peek() == 'L') {
//                    sc.pop();
//                }else{
//                    sc.push(s.charAt(i));
//                }
//                i++;
//            }
//            count++;
//        }
//        return count;
//    }

    //最小高度数
//    public TreeNode sortedArrayToBST(int[] nums) {
//        return func(nums,0,nums.length);
//    }
//    public TreeNode func(int[] nums,int left,int right) {
//        if(left == right) return null;
//        int mid = (left + right) / 2;
//        TreeNode root = new TreeNode(nums[mid]);
//        root.left = func(nums,left,mid);
//        root.right = func(nums,mid + 1, right);
//        return root;
//    }


    //判断字符串的两半是否相似
//    public static boolean halvesAreAlike(String s) {
//        HashSet<Character> set = new HashSet<>();
//        String S = s.toUpperCase();
//        char[] c = {'A','E','I','O','U'};
//        for (char ch:c) {
//            set.add(ch);
//        }
//
//        int n = s.length();
//        int x = 0, y = 0;
//        String a = S.substring(0,n / 2);
//        String b = S.substring(n / 2,n);
//        for(int i = 0; i < n / 2; i++) {
//            if(set.contains(a.charAt(i))) x++;
//            if(set.contains(b.charAt(i))) y++;
//        }
//        return x == y;
//    }

    //二叉树的镜像
//    public TreeNode mirrorTree(TreeNode root) {
//        if(root == null) return null;
//        TreeNode tmp = mirrorTree(root.left);
//        root.left = mirrorTree(root.right);
//        root.right = tmp;
//        return root;
//    }

    //重新排列字符串
//    public String restoreString(String s, int[] indices) {
//        HashMap<Integer,Character> map = new HashMap<>();
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < indices.length; i++) {
//            map.put(indices[i],s.charAt(i));
//        }
//        Arrays.sort(indices);
//        for(int x : indices) {
//            sb.append(map.get(x));
//        }
//        return sb.toString();
//    }

    //数组中两元素的最大乘积
//    public int maxProduct(int[] nums) {
//        int max = 0;
//        for(int i= 0; i < nums.length - 1; i++) {
//            for(int j = i + 1; j < nums.length; j++) {
//                max = Math.max((nums[i] - 1) * (nums[j] - 1),max);
//            }
//        }
//        return max;
//    }
    public static void main(String[] args) {
//        int[] nums = {12,345,2,6,7896};
//        System.out.println(findNumbers(nums));
//        int n =(int)Math.pow(2,3);
//        System.out.println(n);
//        String s = "aaaabbbbcccc";
//        String str = sortString(s);
//        Stack<Character> s = new Stack<>();
//        s.isEmpty();
//        s.push()
//        String s = "RLLLLRRRLR";
//        System.out.println(balancedStringSplit(s));

//        String s = "textbook";
//        System.out.println(halvesAreAlike(s));


        HashMap<Integer,Integer> map = new HashMap<>();
    }
}
