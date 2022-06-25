public abstract class Animal {
        // Whether the fox is alive or not.
    protected boolean alive;
    // The fox's position.
    protected Location location;
    // The field occupied.
    protected Field field;
    
public Animal(Field field,Location location){

    this.alive=false;
    this.field=field;
    this.location=location;


}

protected boolean isAlive(){

  return alive;

}

protected Location getLocation(){
     
  return location;

}

protected void setLocation(Location location){

  this.location=location;

}

protected Field getField(){

return this.field;

}










}
