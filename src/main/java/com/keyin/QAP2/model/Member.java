package com.keyin.QAP2.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String memberName;
    private String memberAddress;
    private String memberEmail;
    private String memberPhone;
    private LocalDate membershipStartDate;
    private int membershipDuration;

    @ManyToMany
    @JoinTable(
            name = "tournament_members",
            joinColumns = @JoinColumn(name = "member_id"),
            inverseJoinColumns = @JoinColumn(name = "tournament_id")
    )
    private Set<Tournament> tournaments = new HashSet<>();

    public Member() {
    }

    public Member(String memberName, String memberAddress, String memberEmail, String memberPhone, LocalDate membershipStartDate, int membershipDuration) {
        this.memberName = memberName;
        this.memberAddress = memberAddress;
        this.memberEmail = memberEmail;
        this.memberPhone = memberPhone;
        this.membershipStartDate = membershipStartDate;
        this.membershipDuration = membershipDuration;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMemberName() { return memberName; }
    public void setMemberName(String memberName) { this.memberName = memberName; }

    public String getMemberAddress() { return memberAddress; }
    public void setMemberAddress(String memberAddress) { this.memberAddress = memberAddress; }

    public String getMemberEmail() { return memberEmail; }
    public void setMemberEmail(String memberEmail) { this.memberEmail = memberEmail; }

    public String getMemberPhone() { return memberPhone; }
    public void setMemberPhone(String memberPhone) { this.memberPhone = memberPhone; }

    public LocalDate getMembershipStartDate() { return membershipStartDate; }
    public void setMembershipStartDate(LocalDate membershipStartDate) { this.membershipStartDate = membershipStartDate; }

    public int getMembershipDuration() { return membershipDuration; }
    public void setMembershipDuration(int membershipDuration) { this.membershipDuration = membershipDuration; }

    public Set<Tournament> getTournaments() { return tournaments; }
    public void setTournaments(Set<Tournament> tournaments) { this.tournaments = tournaments; }
}
