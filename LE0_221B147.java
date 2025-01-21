
class Juet{
    String name;
    int age;
    void setName(String name){
        this.name= name;
    }
    void setAge(int age){
        this.age= age;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
}


public class Main
{
	public static void main(String[] args) {
	    Juet Student= new Juet();
	    Student.setAge(20);
	    Student.setName("AJAY");
	    System.out.println("NAME :"+Student.getName()+ ' ' +"AGE :" +Student.getAge());
	    
	}
}