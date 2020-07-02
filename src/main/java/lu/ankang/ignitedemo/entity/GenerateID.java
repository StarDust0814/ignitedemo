package lu.ankang.ignitedemo.entity;

public class GenerateID {
    private static int ID = 10;
    public static int getID(){
        ID++;
        return ID;
    }
}
