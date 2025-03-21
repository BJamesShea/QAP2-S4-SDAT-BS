package com.keyin.QAP2.model;



public class Member {
    private String memberName;
    private String memberAddress;
    private String memberEmail;
    private String memberPhone;
    private String membershipStartDate;
    private String membershipDuration;

    public Member(String memberName, String memberAddress, String memberEmail, String memberPhone, String membershipStartDate, String membershipDuration) {
        this.memberName = memberName;
        this.memberAddress = memberAddress;
        this.memberEmail = memberEmail;
        this.memberPhone = memberPhone;
        this.membershipStartDate = membershipStartDate;
        this.membershipDuration = membershipDuration;
    }

    // Getters
    public String getMemberName() {
        return memberName;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public String getMembershipStartDate() {
        return membershipStartDate;
    }
    public String getMembershipDuration() {
        return membershipDuration;
    }

    //Setters

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }
    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }
    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }
    public void setMembershipStartDate(String membershipStartDate) {
        this.membershipStartDate = membershipStartDate;
    }
    public void setMembershipDuration(String membershipDuration) {
        this.membershipDuration = membershipDuration;
    }


}
