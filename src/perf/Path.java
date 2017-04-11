package perf;

public class Path {
	private int uzunluk;
	private String Anoktasi;
	private String Bnoktasi;
	private int capacity;
	private int flow;
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
	public Path(int uzunluk, String Anoktasi, String Bnoktasi,int capacity,  int flow)
	{
		this.uzunluk = uzunluk;
		this.Anoktasi = Anoktasi;
		this.Bnoktasi = Bnoktasi;
		this.capacity = capacity;
		this.flow = flow;
	}
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getFlow() {
		return flow;
	}

	public void setFlow(int flow) {
		this.flow = flow;
	}
}
