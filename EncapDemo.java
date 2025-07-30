class EncapStudent {
    private String name;
    private int age;
    private String course;
    public void setName(String name){
          this.name = name;
    }
    public  void setAge(int age){
          this.age = age;
    }
    public void setCourse(String course){
          this.course = course;
    }
    public String getName(){
          return name;
    }
    public int getAge(){
          return age;
    }
    public String getCourse(){
          return course;
    }


    
}
public class EncapDemo{
    public static void main(String[] args) {
        EncapStudent obj = new EncapStudent();
        obj.setName("Arun");
        obj.setAge(23);
        obj.setCourse("Java");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getCourse());


    }
}
