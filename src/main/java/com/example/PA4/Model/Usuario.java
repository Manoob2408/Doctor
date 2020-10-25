package com.example.PA4.Model;

import java.text.DateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Service;

@Entity /* A anotação @Entity faz com que o JPA saiba que aquela classe deve ser manipulada por ele */
@Table(name="Usuario") /*define que esta classe possui uma tabela chamada usuario no banco de dados */
@Service
public class Usuario{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="IDUser")
    private Long id;

    @Column(name="Name")
    @NotEmpty(message="* Por favor, insira seu nome")
    private String name;

    @Column(name="BirthDate")
    @NotEmpty(message="* Por favor, insira sua data de nascimento")
    private DateFormat birthdate;
    
    @Column(name="Gender")
    @NotEmpty(message="* Por favor, selecione uma opção")
    private String gender;

    @Email(message="* Por favor, insira um email válido")
    @NotEmpty(message=" * Por favor, insira seu email")
    @Column(name="Email")
    private String email;

    @Column(name="UserName")
    @NotEmpty(message=" * Por favor, insira um nome de usuário")
    private String username;

   @Column(name="Password")
    @NotEmpty(message=" * Por favor, insira uma senha")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateFormat getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(DateFormat birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


   
}

