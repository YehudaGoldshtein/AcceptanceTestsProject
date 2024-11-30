package interfaces;

public interface JobApplication {
    boolean postJobAd(String title, String content);
    boolean updateJobStatus(int jobId, String status);
    String searchJobAds(String criteria);
}
