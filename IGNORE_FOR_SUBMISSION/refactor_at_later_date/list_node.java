// will hopefully be used in the sort of grades for robustness, pending I figure out how to do what I wanted to...
class list_node {
    int element;
    list_node link;
    // create a list node with element=0 and a null pointer
    list_node() {
        this.element = 0;
        this.link = null;        
    }
    // Create a list node and initialize the element to E (the supplied parameter argument) and a null pointer
    list_node(int e) {
        this.element = e;
        this.link = null;        
    }
    // Create a list node with the supplied integer element and link it to the supplied list_node
    list_node(int e, list_node link) {
        this.element = e;
        this.link = link;        
    }
}
