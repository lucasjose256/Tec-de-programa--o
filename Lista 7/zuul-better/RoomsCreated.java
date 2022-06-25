public class RoomsCreated {

   private Room outside,
    theatre, pub, lab, office;
    private Room currentRoom;
    private Parser parser;
    Item mouse,cadeira,becker,quadro,arvore;

    //No método construtor inicializamos os quartos e colocamos quais serão suas saídas
    public RoomsCreated (){
        parser = new Parser();

        //Inicializando os itens
        mouse=new Item("mouse",1);
        cadeira= new Item("cadeira", 9);
        becker=new Item("beacker",2);
        quadro=new Item("quadro",10);
        arvore=new Item("arvore",100);

        outside = new Room("outside the main entrance of the university",arvore);
        theatre = new Room("in a lecture theatre",cadeira);
        pub = new Room("in the campus pub",quadro);
        lab = new Room("in a computing lab",becker);
        office = new Room("in the computing admin office",mouse);


        // initialise room exits
        outside.setExit("east", theatre);
        outside.setExit("south", lab);
        outside.setExit("west", pub);

        theatre.setExit("west", outside);

        pub.setExit("east", outside);

        lab.setExit("north", outside);
        lab.setExit("east", office);

        office.setExit("west", lab);

        currentRoom = outside;  // start game outside


    }
    public Room getOutside(){

        return outside;
    }



    public boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) {
            printHelp();
        }
        else if (commandWord.equals("go")) {
            goRoom(command);
        }
        else if (commandWord.equals("quit")) {
            wantToQuit = quit(command);
        }
        // else command not recognised.
        return wantToQuit;
    }
    public void printHelp() 
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println();
        System.out.println("Your command words are:");
        parser.showCommands();
    
        //commandList.getCommandList();

    }

    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }
    
       

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        else {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
            System.out.println(currentRoom.seeItem());
        }
    }

    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }

 
    
}
