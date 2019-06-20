package com.example.testproject;




import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "contact")
public class Contact {

    public ContactDetail getContactDetail() {
        return contactDetail;
    }

    public void setContactDetail(ContactDetail contactDetail) {
        this.contactDetail = contactDetail;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId ;

    @Column(name = "title")
    private String title ;

    @Column(name = "name")
    private String name ;

    @Column(name = "birthdate")
    private Date birthDate;

    @ManyToOne(cascade = CascadeType.ALL)
    private ContactDetail contactDetail;


    @Column(name = "isfavorite")
    private  boolean isFavorite;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}