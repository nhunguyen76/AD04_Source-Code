package entities;

public class HoChanNuoi {
	
	private String maHo;
	private String tenChuHo;
	private String ngaySinh;
	private String diaChi;
	private String sdt;
	
	public HoChanNuoi() {
		super();
	}
	
	public HoChanNuoi(String maHo,String tenChuHo,String ngaySinh,String diaChi,String sdt) {
		this.maHo = maHo;
		this.tenChuHo = tenChuHo;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.sdt = sdt;
	}

	public String getMaHo() {
		return maHo;
	}

	public void setMaHo(String maHo) {
		this.maHo = maHo;
	}

	public String getTenChuHo() {
		return tenChuHo;
	}

	public void setTenChuHo(String tenChuHo) {
		this.tenChuHo = tenChuHo;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
}
