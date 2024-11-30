package interfaces;

public class MockJobApplication implements JobApplication{

    @Override
    public boolean postJobAd(String title, String content) {
        return false;
    }

    @Override
    public boolean updateJobStatus(int jobId, String status) {
        return false;
    }

    @Override
    public String searchJobAds(String criteria) {
        return "";
    }
}
