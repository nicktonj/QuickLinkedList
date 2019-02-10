/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x35h693
 */
public class LinkedList 
{
    private Node first;
    private Node last;
    private int size;
    
    public LinkedList()
    {
        first = null;
        last = null;
        size = 0;
    }
    
    public boolean ifEmpty()
    {
        if(first == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void addItem(String name)
    {
        Node newNode = new Node(name, null);
        size++;
        if(first == null)
        {
            first = newNode;
            last = first;
        }
        else
        {
            last.setNext(newNode);
            last = newNode;
        }
    }
    
    public void print()
    {
        System.out.println("List Contents:");
        if(size == 0)
        {
            System.out.println("NO LIST AVAILABLE");
        }
        else if(first.getNext() == null)
        {
            System.out.println(first.getName());
        }
        else
        {
            Node tempNode = first;
            System.out.println(first.getName());
            tempNode = first.getNext();
            while(tempNode.getNext() != null)
            {
                System.out.println(tempNode.getName());
                tempNode = tempNode.getNext();
            }
            System.out.println(tempNode.getName());
            System.out.println("--------------------");
        }
    }
    
    public void delete(int num)
    {
        if (num == 1)
        {
            first = first.getNext();
            size--;
        }
        if (num == size)
        {
            Node sNode = first;
            Node tNode = first;
            while (sNode != last)
            {
                tNode = sNode;
                sNode = sNode.getNext();
            }
            last = tNode;
            last.setNext(null);
            size --;
        }
        Node pointer = first;
        num = num - 1 ;
        for (int counter = 1; counter < size - 1; counter++)
        {
        if (counter == num)
            {
                Node tmpNode = pointer.getNext();
                tmpNode = tmpNode.getNext();
                pointer.setNext(tmpNode);
            }
        pointer = pointer.getNext();
        }
        size-- ;
    }
    
    public void clearAll()
    {
        first = null;
        size = 0;
    }
}
