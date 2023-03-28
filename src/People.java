public class People {
    private String name;
    private int age;



    public People(String andrey, int i) {
        checkINPUT(andrey, i);
    }

    private void checkINPUT(String name, int age){
        checkName(name);
        checkAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void checkName(String MyName){
        if(MyName.contains("@")) System.out.println("Error");
        else {
            setName(MyName);
        }
    }

    private void checkAge(int myAge){
        if((age > 100) || (age < 0)) System.out.println("Error");
        else setAge(myAge);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {

        return name + " " + age;
    }
}
