public class SinglyLinkedList <T> implements InterfaceSinglyLinkedList{
    Node head;

    private class Node<T> {
        T data;
        Node next;

        public Node(T data){
            this.data = data;

            if (head == null){
                head = this;
            }
            //TODO: verlinkung implementieren!
            else {
                Node node = head;

                while (getNode() != null){
                     node.getNode();
                }

                node.next = this;
            }
        }

        public Node getNode(){
            return next;
        }

        public void setNext(Node node){
            this.next = node;
        }
    }

    @Override
    public void creatdNode( Object data ) {
        new Node(data);
    }

    @Override
    public void addHead( Object data ) {

    }

    @Override
    public void addTail( Object data ) {

    }

    @Override
    public void printNode( Object data ) {

    }

    @Override
    public void countNode() {

    }

    @Override
    public void deleteNode( Object data ) {

    }

    @Override
    public void deleteList() {

    }

    @Override
    public void searchStudent( Object data ) {

    }

    @Override
    public void sort1( Object data ) {

    }

    @Override
    public void sort2( Object data ) {

    }


}
