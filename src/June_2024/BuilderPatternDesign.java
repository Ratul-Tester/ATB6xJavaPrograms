package June_2024;

public class BuilderPatternDesign {
    public BuilderPatternDesign groundFloor(){
        System.out.println("Ground Floor is prepared");
        return this;
    }
    public BuilderPatternDesign firstFloor(String name, String color){
        System.out.println("First Floor is prepared "+"with name as "+ name+" And Color as " + color);
        return this;
    }
    public BuilderPatternDesign secondFloor(String name, String color){
        System.out.println("Second Floor is prepared "+"with name as "+ name+" And Color as " + color);
        return this;
    }

    public static void main (String[] args){
        BuilderPatternDesign bpd = new BuilderPatternDesign();
        bpd.groundFloor().firstFloor("FF", "RED").secondFloor("SF","Green");

    }
}
