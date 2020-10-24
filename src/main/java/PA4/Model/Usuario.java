package PA4.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

@Entity /* A anotação @Entity faz com que o JPA saiba que aquela classe deve ser manipulada por ele */
@Table(name="Usuario") /*define que esta classe possui uma tabela chamada usuario no banco de dados */
@Service
public class Usuario implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   
    @Column
    private int IDUser;
    @Column
    private String Name;
    @Column
    private double BirthDate;
    @Column
    private String Gender;
    @Column
    private String Email;
    @Column
    private String UserName;
    @Column
    private String Password;


    public int getIDUser() {
        return IDUser;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getUsername() {
        return UserName;
    }

    public void setUsername(String username) {
        this.UserName = username;
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

