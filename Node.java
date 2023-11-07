public class Node {

    public String data;// a variable data that has datatype string stores data for the node 
    private Node next;//Node is used like datatype for next,where next will holds links to others node,
    private Node previous;


    public Node(String Data){
        this.data = Data;
        this.next = null;
    }

    public void setNextNode(Node node){
        this.next = node;// set this instance variable "next" to the instance of the class "Node"
    }

    public void setPreviousNode(Node node){
        this.previous = node;
    }

    public Node getNextNode(){
        return this.next;
    }

    public Node getPreviousNode(){
        return this.previous;
    }
    public static void main(String[] args){
        Node nodeOne = new Node("I am a Node!");
        Node SecondNode = new Node("I am the second Node!");
        System.out.println("the instance of the class 'node'"+ SecondNode);
        nodeOne.setNextNode(SecondNode);// sets "next" of the nodeOne to the "secondNode" instance of the class "Node" 
        System.out.println(nodeOne.data);
        System.out.println(nodeOne.next);//via calling setNextNode setting "next" to the instance "secondNode",that's why it prints value stores in the next i.e address of the instance "secondNode"
        System.out.println(nodeOne.next.data);// Print out nodeOne's next node's data
        System.out.println(nodeOne.getNextNode());//print out  next 
        System.out.println(nodeOne.getNextNode().data);// Print out nodeOne's next node's data

    }
    
}