package registration;

public class registration {

	private String name;
	private String mailid;
	private String mobileno;
	private String totprice;
	public registration(String name, String mailid, String mobileno, String totprice) {
		super();
		this.name = name;
		this.mailid = mailid;
		this.mobileno = mobileno;
		this.totprice = totprice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mailid == null) ? 0 : mailid.hashCode());
		result = prime * result + ((mobileno == null) ? 0 : mobileno.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((totprice == null) ? 0 : totprice.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		registration other = (registration) obj;
		if (mailid == null) {
			if (other.mailid != null)
				return false;
		} else if (!mailid.equals(other.mailid))
			return false;
		if (mobileno == null) {
			if (other.mobileno != null)
				return false;
		} else if (!mobileno.equals(other.mobileno))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (totprice == null) {
			if (other.totprice != null)
				return false;
		} else if (!totprice.equals(other.totprice))
			return false; 
		return true;
	}
	@Override
	public String toString() {
		return "registration [name=" + name + ", mailid=" + mailid + ", mobileno=" + mobileno + ", totprice=" + totprice
				+ "]";
	}
	
}
