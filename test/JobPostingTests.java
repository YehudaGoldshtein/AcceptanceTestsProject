
import interfaces.JobApplication;
import interfaces.MockJobApplication;
import org.junit.Test;
import static org.junit.Assert.*;

public class JobPostingTests {

        @Test
        public void testJobAdPosting() {
            JobApplication app = new MockJobApplication();
            boolean result = app.postJobAd("Software Engineer", "Exciting job!");

            assertTrue("Job ad should be published successfully", result);
        }


    // Mock function for testing
    private boolean postJobAd(String title, String content) {
        return title != null && !title.isEmpty() && content != null && !content.isEmpty();
    }
}
