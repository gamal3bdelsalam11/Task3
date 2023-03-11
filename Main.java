public class Main {
    public static void main(String[] args) {
        if (Job.recruiting== true){
            System.out.println("lucy");
        }
        else {
            System.out.println("un lucy");
        }
        Programmer pro =new Programmer();
        pro.setName("Gamal");
        System.out.println(pro.getName());
        pro.setAge(20);
        System.out.println( "Employee age:"+" "+pro.getAge());
        if (Job.recruiting==true){
            System.out.println("lucy");
        }
        else {
            System.out.println("un lucy");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
    //A static variable belongs to the class not to an instance of the class.
    // To access a static variable from another class i use this code class name.varible name=new value;
    //we make the two varible in the programmer class private to make them accesible in programmer class only
    //then i use set and get method to assign a value for this two varible and we can change the value with every new employee
    //
}