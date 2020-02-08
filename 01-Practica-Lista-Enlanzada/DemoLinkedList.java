/*Add elements and remove duplicates
 * INPUT:
 * List1: [1,1,4,5,6,7,7]
 * List2: [1,2,2,5]
 *
 * Remove duplicates elements :
 * List1: [1,4,5,6,7]
 * List2: [1,2,5]
 *
 * Merge two sorted Lists : list1 + list2
 * list3 = [1,4,5,6,7]<->[1,2,5]
 * [1,1,2,4,5,5,6,7]
 *
 * Remove duplicates from sorted list
 * [1,1,2,4,5,5,6,7] -> [1,2,4,5,6,7]
 *
 * OUTPUT :
 * list3: [1,2,4,5,6,7]
 * ======================================================================================================================
 */

public class DemoLinkedList {

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.add(7);
        list1.add(4);
        list1.add(5);
        list1.add(1);
        list1.add(7);
        list1.add(1);
        list1.add(6);

        LinkedList list2 = new LinkedList();
        list2.add(2);
        list2.add(5);
        list2.add(1);
        list2.add(2);

        System.out.println("List1 :");
        list1.printList();
        Node head1 = list1.removeDuplicates(list1.getHead());
        list1.setHead(head1);
        list1.printList();

        System.out.print("List2");
        list2.printList();
        Node head2 =list2.removeDuplicates(list2.getHead());
        list2.setHead(head2);
        list2.printList();

        LinkedList list3 = new LinkedList();
        Node head3 = list3.mergeTwoLists(list1.getHead(), list2.getHead());
        list3.setHead(head3);

        System.out.println("List3");
        list3.printList();
        head3 = list3.removeDuplicates(list3.getHead());
        list3.setHead(head3);
        list3.printList();
    }

}
