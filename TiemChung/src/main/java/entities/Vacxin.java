package entities;

public class Vacxin {
	private String maVX;
	private String tenVX;
	private int soLuong;
	private String donViTinh;
	private String chucNang;
	private String thanhPhan;
	private String cachDung;
	private String phanUngPhu;
	private String baoQuan;
	private String xuatXu;
	private String hinhAnh;
	private String chiDinh;
	private String chuY;
		
	public Vacxin() {
		super();
	}
	
	public Vacxin(String maVX, String tenVX, int soLuong,String donViTinh, 
				String chucNang, String thanhPhan,String cachDung, String phanUngPhu,
				String baoQuan, String xuatXu, String hinhAnh, String chiDinh, String chuY) {
		this.maVX = maVX;
		this.tenVX = tenVX;
		this.soLuong = soLuong;
		this.donViTinh = donViTinh;
		this.chucNang = chucNang;
		this.thanhPhan = thanhPhan;
		this.cachDung = cachDung;
		this.phanUngPhu = phanUngPhu;
		this.baoQuan = baoQuan;
		this.xuatXu = xuatXu;
		this.hinhAnh = hinhAnh;
		this.chiDinh = chiDinh;
		this.chuY = chuY;
	}

	public String getMaVX() {
		return maVX;
	}

	public void setMaVX(String maVX) {
		this.maVX = maVX;
	}

	public String getTenVX() {
		return tenVX;
	}

	public void setTenVX(String tenVX) {
		this.tenVX = tenVX;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getDonViTinh() {
		return donViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	public String getChucNang() {
		return chucNang;
	}

	public void setChucNang(String chucNang) {
		this.chucNang = chucNang;
	}

	public String getThanhPhan() {
		return thanhPhan;
	}

	public void setThanhPhan(String thanhPhan) {
		this.thanhPhan = thanhPhan;
	}

	public String getCachDung() {
		return cachDung;
	}

	public void setCachDung(String cachDung) {
		this.cachDung = cachDung;
	}

	public String getPhanUngPhu() {
		return phanUngPhu;
	}

	public void setPhanUngPhu(String phanUngPhu) {
		this.phanUngPhu = phanUngPhu;
	}

	public String getBaoQuan() {
		return baoQuan;
	}

	public void setBaoQuan(String baoQuan) {
		this.baoQuan = baoQuan;
	}

	public String getXuatXu() {
		return xuatXu;
	}

	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public String getChiDinh() {
		return chiDinh;
	}

	public void setChiDinh(String chiDinh) {
		this.chiDinh = chiDinh;
	}

	public String getChuY() {
		return chuY;
	}

	public void setChuY(String chuY) {
		this.chuY = chuY;
	}
	 
}
