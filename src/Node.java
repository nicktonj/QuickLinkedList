/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x35h693
 */
public class Node 
{
    private String name;
    private Node next;
    
    public Node()
    {
        name = "";
        next = null;
    }
    
    public Node(String nameOne,Node n)
    {
        name = nameOne;
        next = n;
    }
    
    public void setNext(Node n)
    {
        next = n;
    }
    
    public Node getNext()
    {
        return next;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
     return name;   
    }
}
