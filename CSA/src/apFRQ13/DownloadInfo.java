package apFRQ13;

public class DownloadInfo {
	private String title;
	private int downloadTimes;
	
	public DownloadInfo(String title) {
		this.title = title;
		this.downloadTimes = 1;
				
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getDownloadTimes() {
		return this.downloadTimes;
	}
	
	public void IncrementTimesDownloaded() {
		this.downloadTimes ++;
	}
	
	public String toString() {
		return (title + " " + downloadTimes);
	}
	
	public static void main(String[] args) {
		DownloadInfo heyJude = new DownloadInfo("Hey Jude");
	}

}
