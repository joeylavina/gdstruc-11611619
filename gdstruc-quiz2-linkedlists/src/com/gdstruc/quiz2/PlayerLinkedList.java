package com.gdstruc.quiz2;

public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }


    public void printList() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.println(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("Null");
    }

    public void printCount() {
        int i = 0;
        PlayerNode temp = head.getNextPlayer();
        temp = head;
        while(temp != null){
            i++;
            temp = temp.getNextPlayer();
        }

        System.out.println("Number of players: ");
        System.out.println(i);

    }


    public void remove(Player player){
        PlayerNode current = head;
        PlayerNode previous = null;
        PlayerNode tempPlayer = null;
        PlayerNode tempNextPlayer = null;

        if(current != null) {


            while(current.getNextPlayer() != null) {
                if (current.getPlayer() == player) {
                    tempNextPlayer = current.getNextPlayer();
                    current.setPlayer(tempNextPlayer.getPlayer());
                    current.setNextPlayer(tempNextPlayer.getNextPlayer());

                    break;
                }
                else
                {
                    if(current.getNextPlayer() != null) {
                        current = current.getNextPlayer();
                    }
                }
            }



        }
        else
        {
            return;

        }
    }

    public void removeHead() {
        PlayerNode current = head;
        PlayerNode previous = null;
        PlayerNode tempPlayer = null;
        PlayerNode tempNextPlayer = null;

        if (current != null) {

            tempNextPlayer = current.getNextPlayer();
            current.setPlayer(tempNextPlayer.getPlayer());
            current.setNextPlayer(tempNextPlayer.getNextPlayer());

        }
        else {
            return;
        }


    }
}
