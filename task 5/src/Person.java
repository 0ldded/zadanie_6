public class Person
{
    private String name, phone, email;

    Person (String name, String phone, String email)
    {
        this.email = email;
        this.name = name;
        this.phone = phone;

    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    void sentToNumber(String number)
    {
        System.out.println(name +" "+ phone + " отправил сообщение на данный телефон " + number );
    }
    void sentToEmail(String mail)
    {
        System.out.println(name +" "+ email + " отправил сообщение на данную почту " + mail);
    }
    @Override
    public String toString() {
        return "name='" + name + ' ' +
                ", phone='" + phone + ' ' +
                ", email='" + email;
    }
}
