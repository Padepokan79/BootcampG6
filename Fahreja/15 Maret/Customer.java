public class Customer {
	private String nama ;
	private boolean member;
	private String memberType;
	
	public Customer(String nama){
		this.nama = nama;
	}
	String getNama() {
		return nama;
	}
	boolean isMember() {
		return member;
	}
	public void setMember(boolean member) {
		this.member = member;
	}
	
	String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	
	public String keterangan() {
		return "Nama : "+ nama +" Status member : "+member+ " Tipe member "+memberType;
	}
}
