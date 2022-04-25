package com.company;

public class BlueRayCollection {
    private Node head = null;

    public int size;
   public void add(String title, String director , int release, double cost){
       Node newNode = new Node(new BlueRayDisk(title , director, release, cost ));
       if (head == null) {
           head = newNode;
       }
       else {
           Node curNode = head;
           while (curNode.next != null) {
               curNode = curNode.next;
           }

           curNode.next = newNode;
       }
       ++size;
   }


    public void show_all() {
        if (head == null) {
            System.out.println("No Disks Avaibleble!");
            return;
        }
        else {
            Node curNode = head;
            while (curNode != null) {
                System.out.println(curNode.disk.toString());
                curNode = curNode.next;
            }
        }
    }
}

