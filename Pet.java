public class Pet{
    private int food;
    private String name;
    private String status;
    public Pet(){
        food = 11;
        name = "swagman";
        status = "swag";
    }
    public Pet(int f, String n, String s){
        food = f;
        name = n;
        status = s;
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
        System.out.println(name + " is "+(((10.0-food)/10.0)*100) + "% Hungry");
    }

    public void updateStatus(){
        if(food >= 10){status = "swag";}
        if(food < 10 && food > 8){status = "happy";}
        if(food < 8 && food > 6){status = "mild";}
        if(food < 6 && food > 4){status = "sad";}
        if(food < 4 && food > 2){status = "very sad";}
        if(food < 2){status = "hungry";}
        
    }
    public int getFood(){return food;}
    public void setFood(int f){food = f;}
    
    public String getName(){return name;}
    public void setName(String n){name = n;}
}