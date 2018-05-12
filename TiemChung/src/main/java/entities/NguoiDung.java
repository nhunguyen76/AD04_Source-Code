package entities;

public class NguoiDung {
	
  
  private String maDangNhap;
  private String password;
  private String role;
  
  public NguoiDung() {
    super();
  }
  public NguoiDung(String maDangNhap,String password,String role) {
    this.maDangNhap = maDangNhap;
    this.password = password;  
    this.role = role;
  }
	public String getMaDangNhap() {
		return maDangNhap;
	}
	public void setMaDangNhap(String maDangNhap) {
		this.maDangNhap = maDangNhap;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
  
  
  
}
