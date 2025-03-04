abstract class kaurav extends bharatvanshi{
    public void obey(){
        System.out.println(this.getClass().getSimpleName() + "is obediant .");
    }
    public void kind(){
        System.out.println(this.getClass().getSimpleName() + "is cruel .");
    }
}
class Dhuryodhan extends kaurav{
    
}
class Vikarn extends kaurav{
    public void obey(){
        System.out.println("vikran is obediant.");
    }
    public void kind(){
        System.out.println("vikran is kind.");
        
    }
}