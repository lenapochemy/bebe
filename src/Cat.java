public class Cat {
    public String name;
    public int id;
    public String owner;
//    public Color color;
  //  public String friend;

    public Cat(String name, int id, String owner){
        this.name=name;
        this.id = id;
        this.owner = owner;
    }

    public String getName(){
        return name;
    }
    public String getOwner(){
        return owner;
    }
    public int getId(){
        return id;
    }
}
