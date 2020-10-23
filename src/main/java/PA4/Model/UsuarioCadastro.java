package PA4.Model;

//import java.sql.Connection; //Nao tirar essa caralha
//import java.sql.DriverManager;
//import java.sql.SQLException;


public class UsuarioCadastro {
    private int IDUser;
    private String Name;
    private double BirthDate;
    private String Gender;
    private String Email;
    private String Username;
    private String Password;
    private String Allergies;

    public int getIDUser() {
        return IDUser;
    }

    public String getAllergies() {
        return Allergies;
    }

    public void setAllergies(String allergies) {
        this.Allergies = allergies;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public double getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(double birthDate) {
        this.BirthDate = birthDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setIDUser(int iDUser) {
        this.IDUser = iDUser;
    }

}

