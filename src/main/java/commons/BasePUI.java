package commons;

public class BasePUI {
    public static final String LOGOUT_NAV_LINK = "css=a[class = 'ico-logout']";

    public static final String DYNAMIC_NAV_LINK_BY_TEXT = "xpath=//div[@class='header-links']/ul/li/a[text()='%s']";

    public static final String DYNAMIC_NAV_LINK_BY_CLASS_NAME = "xpath=//div[@class='header-links']/ul/li/a[@class='%s']";


    public static final String BAR_NOTIFICATION_CLOSE_BUTTON = "xpath=//div[contains(@class,'bar-notification')]//span[@class='close']";

    public static final String BAR_NOTIFICATION_MESSAGE = "xpath=//div[contains(@class,'bar-notification')]//p";

    public static final String DYNAMIC_HEADER_MENU_BY_TEXT = "xpath=//div[@class='header-menu']/ul[@class='top-menu notmobile']/li/a[normalize-space() = '%s']";

    public static final String DYNAMIC_SUB_CATEGORY_ITEM_BY_TEXT = "xpath=//div[@class='sub-category-item']/h2/a[normalize-space() = '%s']";

    public static final String DYNAMIC_NAV_LINK_FOOTER_BY_TEXT ="xpath=//div[@class='footer']//div[contains(@class,'footer-block')]//a[text()='%s']";

    public static final String LOADING_ICON = "xpath=//div[contains(@class,'ajax-loading-block-window')]";
}
