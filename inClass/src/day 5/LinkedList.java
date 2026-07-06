/*
public class LinkedList<T>{

    Node root;
    public LinkedList{
        root = null;
    }

    public void add(T element){
        if(root == null){
            root = new Node<>(element);
        }else {
            Node lasNode = findLast();
            lasNode.setNext(new Node(element));

        }
    }

    private Node findLast(){
        if(root == null){
            return null;
        }
        Node lasNode = root;
        while(lasNode.getNext() != null){
            lasNode = lasNode.getNext();
        }
        return lasNode;
    }

    public Object get(int index){
        Node currentNode = root;

        for(int i = 0;i< index;i++){
            currentNode = currentNode.getNext();
        }
        return currentNode.getValue();
    }


}
*/
