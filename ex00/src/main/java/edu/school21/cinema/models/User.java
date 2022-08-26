package edu.school21.cinema.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String firstName;

    @Column(name = "last_name", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String lastName;

    @Column(name = "email", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String email;

    @Column(name = "phone_number", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String phoneNumber;

    @Column(name = "password", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String password;
}