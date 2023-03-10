package model;
import java.time.LocalDate;
public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected LocalDate birthDate;
    protected char sex;

    public Person(String firstName, String lastName, LocalDate birthDate, char sex){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.sex = sex;
    }

    public boolean isMale(){
//        if (sex == 'm'){
//            return true;
//        }
//        return false;

        return sex == 'm' || sex == 'M';
    }

    public void speak(){
        System.out.println("Ciao sono " + firstName);
        if (isMale()){
            System.out.println("Parliamo di calcio?");
        } else{
            System.out.println("Parliamo di makeup?");
        }
    }

    public String getName(){
        return this.firstName;
    }

    public String getFullName(){
        return String.format("%s %s", firstName, lastName);
    }

    public abstract void work();

    public void sleep(){
        System.out.println("zzz");
    }
}

