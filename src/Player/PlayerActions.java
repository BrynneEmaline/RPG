package Player;

public class PlayerActions {

    private int rememberCount = 1;
    private int dialogueCount;
        // how could I separate each of these actions into subclasses?
    // maybe each of these actions can be ones that have counts

    public void remember() {
            if (rememberCount == 1) {
              System.out.println("You take a deep breath in. Maybe if you try to act casual " +
                        "you can catch your memories off guard. Yes, be chill. \n" +
                        " “I don't even really care if I remember anything,” " +
                        "You think to yourself. “It’s no big deal.”\n" +
                        "You pause a moment, trying to embody this calm persona. " +
                       "You twiddle your thumbs in front of you. “Yep, all good over here,” you think. \n" +
                        "After a brief pause -\n" +
                        "…NOW! \n" +
                        "Suddenly you focus all your willpower on the void between your ears, " +
                        "begging to find even a shred of information. Nothing. " +
                        "Your devious plan did not appear to work." +
                        " All you’re left with is a dull headache.\n");
              rememberCount++;
            } else if (rememberCount == 2) {
                System.out.println("You’re really testing it now, buddy. " +
                        "You focus inward, willing yourself to remember something, anything." +
                        " A wave of nausea washes over you and you clench your fists. " +
                        "A feeling then, like you’re about to sneeze. " +
                        "Are you doing it? Is this remembering? " +
                        "You brace yourself for the wave of memories to flood in…\n" +
                        "…and promptly throw up all over the ground. \n" +
                        "Maybe that’s enough remembering for now. \n");
                rememberCount++;
            } else {
                System.out.println("Seriously? You smell like puke. Quit it. ");
            }
        }
    }
//
//
//// actions that need a counter:
//// -remember
//// -dialogue (counter for each NPC)
//
//
//// actions:
//// -choose a menu item
//// -examine item
//// -give/receive item
//// -look at inventory (list items, able to select which one to examine)
//
