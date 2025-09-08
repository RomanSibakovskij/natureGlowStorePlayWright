package app.web.e8740.natureglow.utilities;

import org.junit.jupiter.api.*;
import com.microsoft.playwright.*;

public class BaseTest {

    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext context;
    protected Page page;

    @BeforeEach
    void setUp() {
        playwright = Playwright.create();

        browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                .setHeadless(false) //true for CI; false for in-browser run
                .setArgs(java.util.List.of("--disable-search-engine-choice-screen")));

        context = browser.newContext(new Browser.NewContextOptions()
                .setViewportSize(1920, 1080)); // like maximize

        page = context.newPage();
        page.navigate("https://natureglow-740e8.web.app/");
    }

    @AfterEach
    void tearDown() {
        if (context != null) context.close();
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }

}
