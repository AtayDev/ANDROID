package Models;

public class Employer {
    private String id;
    private String email;
    private String password;
    private String sex;
    private int age;
    private String telephone;
    private String fullName;

    public Employer() {
    }

    public Employer(String email, String password, String sex, int age, String telephone, String fullName) {
        this.email = email;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.telephone = telephone;
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
