package RecursionProblems;

import java.util.ArrayList;
import java.util.List;

public class MergeLists {
    List<Integer> answer = new ArrayList<>();
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {


        if(list1!=null && list2!=null) {
            if(list1.val<list2.val){
                list1.next=mergeTwoLists(list1.next,list2);
                answer.add(list1.val);
                return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                answer.add(list2.val);
                return list2;
            }
        }
        if(list1==null)
            return list2;
        return list1;
    }

    public static void main(String[] args) {
        MergeLists ml = new MergeLists();
        System.out.println(ml.mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))),
                                            new ListNode(1, new ListNode(3, new ListNode(4)))));
    }
}

