abstract class Sportsperson{
    String name;
    int age;
    public Sportsperson(String name,int age){
        this.name=name;
        this.age=age;
    }
    public abstract void printStats();
    public void displayinfo(){
        System.out.println("Name= "+this.name+" Age= "+this.age);
    }
}
class FootballPlayer extends Sportsperson{
    int goals;
    public FootballPlayer(String name,int age,int goals){
        super(name,age);
        this.goals=goals;
    }
    public void printStats(){
        System.out.println("Goals= "+this.goals);
    }
}
class Stats{
    public static void main(String[]args){
        FootballPlayer fp =new FootballPlayer("Chiristin",25,194);
        fp.displayinfo();
        fp.printStats();
    }
}
