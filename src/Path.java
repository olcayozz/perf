public class Path {
	private int uzunluk;
	private String Anoktasi;
	private String Bnoktasi;
	public int getUzunluk() {
		return uzunluk;
	}
	public void setUzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}
	public String getAnoktasi() {
		return Anoktasi;
	}
	public void setAnoktasi(String anoktasi) {
		Anoktasi = anoktasi;
	}
	public String getBnoktasi() {
		return Bnoktasi;
	}
	public void setBnoktasi(String bnoktasi) {
		Bnoktasi = bnoktasi;
	}
	public Path(int uzunluk, String Anoktasi, String Bnoktasi)
	{
		this.uzunluk = uzunluk;
		this.Anoktasi = Anoktasi;
		this.Bnoktasi = Bnoktasi;
	}
}
