/* The PlayerLinkedListTest class
   Anderson, Franceschi
*/

public class PlayerLinkedListTest
{
  public static void main( String [ ] args )
  {
    Player p1 = new Player( 7,"Sarah","Mario" );
    Player p2 = new Player( 2,"Jin","Golf" );
    Player p3 = new Player( 5,"Ajay","Sonic" );
    Player p4 = new Player( 88, "Donna", "Life" );


    System.out.println("-------------------------------------------");
    System.out.println("Insert 4 players, one specifically in the 3rd position");
    System.out.println("-------------------------------------------");

    // construct empty PlayerLinkedList
    PlayerLinkedList players = new PlayerLinkedList( );
    System.out.println( "Number of items in the list: "
     + players.getNumberOfItems( ) + "\n" + players.toString( ) );

    players.insert( p1 );  // insert in empty list
    System.out.println( "Number of items in the list: "
     + players.getNumberOfItems( ) + "\n" + players.toString( ) );

    players.insert( p2 );  // insert in list of one item
    System.out.println( "Number of items in the list: "
     + players.getNumberOfItems( ) + "\n" + players.toString( ) );

    players.insert( p3 );  // insert in list of two items
    System.out.println( "Number of items in the list: "
     + players.getNumberOfItems( ) + "\n" + players.toString( ) );

    players.insertAtThirdPosition(p4); // insert in list of three items at third position
    System.out.println("Number of items in the list: " + players.getNumberOfItems() + "\n" + players.toString());


    System.out.println("-------------------------------------------");
    System.out.println("Attempt to insert a player into an empty list at 3rd position");
    System.out.println("Expectation is to just insert at first position");
    System.out.println("-------------------------------------------");

    // construct another empty PlayerLinkedList
    PlayerLinkedList players2 = new PlayerLinkedList();
    System.out.println("Number of items in the list: " + players2.getNumberOfItems() + "\n" + players2.toString());

    players2.insertAtThirdPosition(p4); // attempt to insert in empty list, at third position
    System.out.println("Number of items in the list: " + players2.getNumberOfItems() + "\n" + players2.toString());


    System.out.println("-------------------------------------------");
    System.out.println("Attempt to insert a player into a list with only one player, at 3rd position");
    System.out.println("Expectation is to not insert the new player");
    System.out.println("-------------------------------------------");


    // construct another empty PlayerLinkedList
    PlayerLinkedList players3 = new PlayerLinkedList();
    System.out.println("Number of items in the list: " + players3.getNumberOfItems() + "\n" + players3.toString());

    players3.insert( p1 );  // insert in empty list
    System.out.println( "Number of items in the list: "
     + players3.getNumberOfItems( ) + "\n" + players3.toString( ) );

    players3.insertAtThirdPosition(p4); // attempt to insert in a non empty list, with less than 2 items,  at third position
    System.out.println("Number of items in the list: " + players3.getNumberOfItems() + "\n" + players3.toString());


    System.out.println("-------------------------------------------");
    System.out.println("Deletion");
    System.out.println("-------------------------------------------");
    
    Player temp;     // will be assigned the deleted item
    try
    {
      temp = players.delete( 8 );      // unsuccessful
      System.out.println( "Player deleted: " + temp );
    }
    catch ( DataStructureException dse1 )
    {
      System.out.println( dse1.getMessage( ) + "\n" );
    }

    try
    {
      temp = players.peek( 2 );        // test peek
      System.out.println( "Player retrieved: " + temp );
      System.out.println( "Number of items in the list: "
       + players.getNumberOfItems( ) + "\n" + players.toString( ) );

      temp = players.delete( 2 );      // delete in the middle
      System.out.println( "Player deleted: " + temp );
      System.out.println( "Number of items in the list: "
       + players.getNumberOfItems( ) + "\n" + players.toString( ) );

      temp = players.delete( 88 );      // delete in the middle
      System.out.println( "Player deleted: " + temp );
      System.out.println( "Number of items in the list: "
       + players.getNumberOfItems( ) + "\n" + players.toString( ) );

      temp = players.delete( 7 );      // delete the last item
      System.out.println( "Player deleted: " + temp );
      System.out.println( "Number of items in the list: "
       + players.getNumberOfItems( ) + "\n" + players.toString( ) );

      temp = players.delete( 5 );      // delete the first item
      System.out.println( "Player deleted: " + temp );
      System.out.println( "Number of items in the list: "
       + players.getNumberOfItems( ) + "\n" + players.toString( ) );

      temp = players.delete( 7 );      // delete from empty list
      System.out.println( "Player deleted: " + temp );
      System.out.println( "Number of items in the list: "
       + players.getNumberOfItems( ) + "\n" + players.toString( ) );
    }
    catch ( DataStructureException dse2 )
    {
      System.out.println( dse2.getMessage( ) );
    }
  }
}
