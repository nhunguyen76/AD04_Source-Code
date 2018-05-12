package entities;

public class GSGC_HCN {
	private String maGSGC_HCN;
	private String maHo;
	private int soLuong;
	private String maGSGC;
	private String tenGSGC;
	
	public GSGC_HCN() {
		super();
	}
	
	public GSGC_HCN(String maGSGC_HCN,String maHo,int soLuong,String maGSGC,String tenGSGC) {
		this.maGSGC_HCN = maGSGC_HCN;
		this.maHo = maHo;
		this.soLuong =  soLuong;
		this.maGSGC = maGSGC;
		this.tenGSGC = tenGSGC;
	}

	public String getMaGSGC_HCN() {
		return maGSGC_HCN;
	}

	public void setMaGSGC_HCN(String maGSGC_HCN) {
		this.maGSGC_HCN = maGSGC_HCN;
	}

	public String getMaHo() {
		return maHo;
	}

	public void setMaHo(String maHo) {
		this.maHo = maHo;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getMaGSGC() {
		return maGSGC;
	}

	public void setMaGSGC(String maGSGC) {
		this.maGSGC = maGSGC;
	}

	public String getTenGSGC() {
		return tenGSGC;
	}

	public void setTenGSGC(String tenGSGC) {
		this.tenGSGC = tenGSGC;
	}
	
}
