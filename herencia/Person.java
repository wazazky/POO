public class Person
{
    String name;
    int age;
    String id_Number;
    String social_number;

    //Constructor
    public Person (String name, int age, String id_number, String social_number)
    {
        setName(name);
        setAge(age);
        setIdNumber(id_Number);
        setSocialNumber(social_number);
    }// Fin del constructor

    // inicio de los setters & getters
    //SETTERS
    void setName(String name){this.name = name;}
    void setAge(int age){this.age = age;}
    void setIdNumber(String id_Number){this.id_Number = id_Number;}
    void setSocialNumber(String social_number){this.social_number = social_number;}
    //GETTERS
    String getName(String name){return name;}
    int getAge(int age){return age;}
    String getIdNumber(String id_Number){return id_Number;}
    String getSocialNumber(String social_number){return social_number;}

}// Fin de la clase Person