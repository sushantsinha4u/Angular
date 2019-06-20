package com.example.testproject;




import javax.persistence.*;

@Entity
@Table(name = "contactdetail")
public class ContactDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contactdetailid")
    private Integer contactDetailId ;



    @Column(name = "contactdetailtype")
    private String contactDetailType;

    @Column(name = "contactdetailcontent")
    private String contactDetailContent;



    public String getContactDetailType() {
        return contactDetailType;
    }

    public void setContactDetailType(String contactDetailType) {
        this.contactDetailType = contactDetailType;
    }

    public String getContactDetailContent() {
        return contactDetailContent;
    }

    public void setContactDetailContent(String contactDetailContent) {
        this.contactDetailContent = contactDetailContent;
    }

    public Integer getContactDetailId() {
        return contactDetailId;
    }

    public void setContactDetailId(Integer contactDetailId) {
        this.contactDetailId = contactDetailId;
    }
}