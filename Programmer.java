public class Programmer extends Employee{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Programmer(){
        Job.recruiting=true;
    }
}
