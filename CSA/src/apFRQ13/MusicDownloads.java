package apFRQ13;

import java.util.ArrayList;
import java.util.List;

public class MusicDownloads {
	private List<DownloadInfo> downloadList;
	
	public MusicDownloads() {
		downloadList = new ArrayList<DownloadInfo>();
	}
	
	public DownloadInfo getDownloadInfo(String title) {
		for(DownloadInfo currentInfo: downloadList) {
			if(currentInfo.getTitle().equals(title))
				return currentInfo;
		}
			
		return null;
	}
	
	public void updateDownloads(List<String> titles) {
		for(String curTitle: titles) {
			DownloadInfo curInfo = this.getDownloadInfo(curTitle);
			if(curInfo.equals(null))
				this.downloadList.add(new DownloadInfo(curTitle));
			else
				curInfo.IncrementTimesDownloaded();
			
		}
	}
	

}
