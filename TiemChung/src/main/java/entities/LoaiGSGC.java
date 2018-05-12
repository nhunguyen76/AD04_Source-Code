package entities;

public class LoaiGSGC {
	private String maGSGC;
	private String tenLoai;
	private String mtSong;
	private String canNangTB;
	private String soNamSongTB;
	
	public LoaiGSGC() {
		super();
	}
	
	public LoaiGSGC(String maGSGC,String tenLoai,String mtSong,
			String canNangTB,String soNamSongTB) {
		this.maGSGC = maGSGC;
		this.tenLoai = tenLoai;
		this.mtSong = mtSong;
		this.canNangTB = canNangTB;
		this.soNamSongTB = soNamSongTB;
	}
	
	
	public String getMaGSGC() {
		return maGSGC;
	}

	public String getTenLoai() {
		return tenLoai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	public String getMtSong() {
		return mtSong;
	}
	public void setMtSong(String mtSong) {
		this.mtSong = mtSong;
	}
	public String getCanNangTB() {
		return canNangTB;
	}
	public void setCanNangTB(String canNangTB) {
		this.canNangTB = canNangTB;
	}
	public String getSoNamSongTB() {
		return soNamSongTB;
	}
	public void setSoNamSongTB(String soNamSongTB) {
		this.soNamSongTB = soNamSongTB;
	}
	public void setMaGSGC(String maGSGC) {
		this.maGSGC = maGSGC;
	}
	
	
}
