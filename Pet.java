public class Pet{
    private int food;
    private String name;
    private String status;
    private double max;
    private int friendship;

    public Pet(){
        food = 11;
        name = "swagman";
        status = "swag";
        max = 10;
        friendship = 0;
    }
    public Pet(int f, String n, String s, double m){
        food = f;
        name = n;
        status = s;
        max = m;
        friendship = 0;
    }

    public void print(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush();  //clears console
        if(status == "swag")
        System.out.println("B)");
        if(status == "happy")
        System.out.println(":)");
        if(status == "mild")
        System.out.println(":|");
        if(status == "sad")
        System.out.println(":(");
        if(status == "very sad")
        System.out.println(":C");
        if(status == "hungry")
        System.out.println(":P");

        System.out.println();
        System.out.println("Hunger Level: " + food);
        System.out.println(name + " is feeling " + status);
        System.out.println(name + " is "+(((max-food)/max)*100) + "% Hungry");
        System.out.println(name + " has a friendship of " + friendship);
    }

    public void updateStatus(){
        if(food >= max){status = "swag";}
        if(food < max && food > max-(max/5)){status = "happy";}
        if(food < max-(max/4) && food > max-2*(max/4)){status = "mild";}
        if(food < max-2*(max/4) && food > max-3*(max/4)){status = "sad";}
        if(food < max-3*(max/4) && food > max-4*(max/4)){status = "very sad";}
        if(food < 1){status = "hungry";}
    }

    public int getFood(){return food;}
    public void setFood(int f){food = f;}
    
    public String getName(){return name;}
    public void setName(String n){name = n;}

    public double getMax(){return max;}
    public void setMax(double m){max = m;}

    public int getFriendship(){return friendship;}
    public void setFriendship(int f){friendship = f;}
}