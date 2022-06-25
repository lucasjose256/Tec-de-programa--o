import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TranporterRoom extends Room{
    ArrayList<Room> room;
    //lista para inserir os quartos desejados
public TranporterRoom(ArrayList<Room> room){

    super("transporter");
    this.room=new ArrayList<Room>();
    this.room=room;
}

    public Room transporter_for_anotherRoom(){

            int index = ThreadLocalRandom.current().nextInt(room.size());   
           
            return room.get(index);
        
        
    }





}
