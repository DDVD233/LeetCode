import java.math.BigInteger;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class L002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger sum = BigInteger.ZERO;
        String index = "1";
        while (l1 != null) {
            sum = sum.add(BigInteger.valueOf(l1.val).multiply(new BigInteger(index)));
            l1 = l1.next;
            index += "0";
        }

        index = "1";
        while (l2 != null) {
            sum = sum.add(BigInteger.valueOf(l2.val).multiply(new BigInteger(index)));
            l2 = l2.next;
            index += "0";
        }

        if (sum.equals(BigInteger.ZERO)) {
            return new ListNode(0);
        }
        return createNode(sum.toString());
    }

    public ListNode createNode(String n) {
        if (n.equals("")) {
            return null;
        } else {
            ListNode thisNode = new ListNode(Integer.parseInt(n.substring(n.length() - 1)));
            thisNode.next = createNode(n.substring(0, n.length() - 1));
            return thisNode;
        }
    }
}