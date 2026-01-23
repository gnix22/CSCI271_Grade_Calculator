class TryLinkedList2 {
  public static void main(String[] args) {
    list_node mylist = null;
    list_node tmp = null;
    for (int i = 0; i < 3; ++i) { // NEW: Creating nodes using a loop
      list_node node = new list_node(i + 1);
      if (mylist == null) { // first node
        mylist = node;
        tmp = node;
      } else { // other nodes
        tmp.link = node;
        tmp = tmp.link;
      }
    }
    // print out my list
    printList(mylist);
  }
  static void printList(list_node list) {
    while (list != null) {
      System.out.println(list.element);
      list = list.link;
    }
  }
}
