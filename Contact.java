// Program made by Daniel Boktor on April 20 2023
// This is a contact class to be used with the contactTester file.
public class Contact {
    private String name;
    private String relation;
    private String birthday;
    private String phone;
    private String email;
    public Contact(String n,String r, String b, String p, String e ){
        name = n;
        relation = r;
        birthday = b;
        phone = p;
        email = e;
    }

    public String toString(){
        return (String.format("%-12s %-12s %-8s %-12s %-15s", name, relation, birthday, phone, email));
    }
    public String getName(){
        return this.name;
    }
    public String getRelation(){
        return this.relation;
    }
    public int getBirthday(){
        return Integer.parseInt(this.birthday);
    }
    public String getPhone(){
        return (this.phone);
    }
    public String getEmail(){
        return this.email;
    }
}