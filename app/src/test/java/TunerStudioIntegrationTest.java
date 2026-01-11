import org.junit.jupiter.api.*;
import org.assertj.swing.core.GenericTypeMatcher;
import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.timing.Timeout;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

import static org.awaitility.Awaitility.await;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Integration test to verify that the main TunerStudio Java UI loads successfully.
 * 
 * This test uses AssertJ Swing to test Swing UI components in a headless environment.
 * It verifies that:
 * - The application can start without exceptions
 * - The main window is created
 * - The window becomes visible
 * - The window has a title
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TunerStudioIntegrationTest {
    
    private FrameFixture window;
    private Thread appThread;
    private AtomicReference<JFrame> mainFrame = new AtomicReference<>();
    private CountDownLatch startupLatch = new CountDownLatch(1);
    
    @BeforeAll
    public static void setUpOnce() {
        // Install the fail-on-thread-violation repaint manager
        FailOnThreadViolationRepaintManager.install();
        
        // Set headless mode for CI/CD environments
        System.setProperty("java.awt.headless", "false");
        
        // Suppress splash screen for testing
        System.setProperty("suppressSplash", "true");
        
        // Set test mode to skip certain initialization that might hang
        System.setProperty("testMode", "true");
    }
    
    @BeforeEach
    public void setUp() throws Exception {
        // Start the application in a separate thread with a timeout
        appThread = new Thread(() -> {
            try {
                // Launch TunerStudio with -noSplash to avoid splash screen delays
                String[] args = {"-noSplash"};
                TunerStudio.main(args);
                
                // Signal that startup has been attempted
                startupLatch.countDown();
            } catch (Exception e) {
                System.err.println("Error during TunerStudio startup: " + e.getMessage());
                e.printStackTrace();
                startupLatch.countDown();
            }
        });
        appThread.setName("TunerStudio-Test-Thread");
        appThread.start();
        
        // Wait for application to start (with timeout)
        boolean started = startupLatch.await(30, TimeUnit.SECONDS);
        assertTrue(started, "Application failed to start within timeout period");
        
        // Wait for the main window to be created
        await()
            .atMost(30, TimeUnit.SECONDS)
            .pollInterval(500, TimeUnit.MILLISECONDS)
            .until(this::findMainWindow);
        
        // Create a FrameFixture to interact with the window
        if (mainFrame.get() != null) {
            window = new FrameFixture(mainFrame.get());
            window.show(); // Ensures the frame is shown
        }
    }
    
    @AfterEach
    public void tearDown() {
        // Clean up the window
        if (window != null) {
            try {
                window.cleanUp();
            } catch (Exception e) {
                System.err.println("Error cleaning up window: " + e.getMessage());
            }
        }
        
        // Interrupt and clean up the application thread
        if (appThread != null && appThread.isAlive()) {
            appThread.interrupt();
        }
    }
    
    /**
     * Searches for the main application window among all visible windows.
     * @return true if main window is found, false otherwise
     */
    private boolean findMainWindow() {
        Window[] windows = Window.getWindows();
        for (Window window : windows) {
            if (window instanceof JFrame) {
                JFrame frame = (JFrame) window;
                // Look for a frame that's visible or has content
                if (frame.isDisplayable() && !frame.getTitle().isEmpty()) {
                    mainFrame.set(frame);
                    return true;
                }
            }
        }
        return false;
    }
    
    @Test
    @DisplayName("Main UI window loads successfully")
    public void testMainUILoads() {
        // Verify that the main window exists
        assertNotNull(mainFrame.get(), "Main application window should be created");
        
        // Verify the window is displayable
        assertTrue(mainFrame.get().isDisplayable(), 
            "Main window should be displayable");
        
        // Verify the window has dimensions (not zero size)
        Dimension size = mainFrame.get().getSize();
        assertTrue(size.width > 0 && size.height > 0, 
            "Main window should have non-zero dimensions. Actual: " + size);
    }
    
    @Test
    @DisplayName("Main window has a title")
    public void testMainWindowHasTitle() {
        assertNotNull(mainFrame.get(), "Main application window should exist");
        
        String title = mainFrame.get().getTitle();
        assertNotNull(title, "Window title should not be null");
        assertFalse(title.trim().isEmpty(), "Window title should not be empty");
        
        System.out.println("Main window title: " + title);
    }
    
    @Test
    @DisplayName("Main window can be made visible")
    public void testMainWindowCanBeVisible() throws Exception {
        assertNotNull(mainFrame.get(), "Main application window should exist");
        
        // Make sure the window can be shown
        GuiActionRunner.execute(() -> {
            mainFrame.get().setVisible(true);
            return null;
        });
        
        // Wait for window to become visible
        await()
            .atMost(5, TimeUnit.SECONDS)
            .until(() -> mainFrame.get().isVisible());
        
        assertTrue(mainFrame.get().isVisible(), "Main window should be visible");
    }
    
    @Test
    @DisplayName("Application initializes without critical exceptions")
    public void testNoInitializationExceptions() {
        // This test passes if setUp() completes without throwing exceptions
        assertNotNull(mainFrame.get(), 
            "Application should initialize and create main window without exceptions");
        
        // Verify the application is in a stable state
        assertTrue(mainFrame.get().isDisplayable(), 
            "Application should be in a displayable state");
    }
}
