package Npcs;

public class Npc {
    private String npcName;
    private String npcDescription;
    private boolean canGiveItem;        // can switch based on state - linked to item's canCollect variable
    private boolean canGetItem;
    private String item;        // how will inventories for npc and user work?
                                // npc will only ever have two items at once max (if they have given item, they wont have inital item anymore)
                                // maybe inventory arrayList variable that can hold initial item and higher level item, add given item later

    private String npcState;

    public String dialogue() {
        return "dialogue";
    }
}

