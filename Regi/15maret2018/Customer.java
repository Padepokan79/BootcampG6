package TheDiscountSystem;

public class Customer {
	
	// Variable
	private String name;
    private boolean member = false;
    private String memberType;

    // Constructor
    public Customer(String name) {
        this.name = name;
    }
    
    // Method
    public String toString() {
        return "\nCustomer Name = " + name + ", Member Type = " + memberType;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
}