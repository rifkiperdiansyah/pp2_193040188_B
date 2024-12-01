package model;

public class JenisMember {

        // Private attributes
        private String memberId;
        private String memberName;

    // Constructor
    public JenisMember(String memberId, String memberName, String memberType) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    // Getter for memberId
    public String getMemberId() {
        return memberId;
    }

    // Setter for memberId
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    // Getter for memberName
    public String getMemberName() {
        return memberName;
    }

    // Setter for memberName
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

}
