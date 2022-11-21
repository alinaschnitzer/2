package Pages;

public class PagesMain {
    public static void main(String[] args) {


   //     Page loginScreen = new Page("Login", 1,"www.legionIT.com/login");
//        loginScreen.pageId = 1;
//        loginScreen.pageName = "Login ";
//        loginScreen.URL = "www.legionIT.com/login";


//        loginScreen.openPage();
//        loginScreen.clickButton("Login");
//        loginScreen.closedPage();
//
//
//        Page aboutScreen = new Page();
//        System.out.println(aboutScreen.getPageId());
//        aboutScreen.setPageName("About");
//        aboutScreen.setURL("www.legionIT.com/about");
//
//        aboutScreen.openPage();
//        aboutScreen.clickButton("exit");
//        aboutScreen.closedPage();

//        LoginPage loginPage = new LoginPage();
//        loginPage.setPageName("Login Page");
//        loginPage.setURL("htpp///....");
//
//        loginPage.openPage();
//        loginPage.setUserName("name");
//        loginPage.setPassword("12345");
//        loginPage.populateCredentials();

//        Page page = new Page();
//        page.getDevelopers();

        LoginPage loginPage = new LoginPage();
        loginPage.setPageId(1);
        loginPage.setPageName("Login");
        loginPage.getDevelopers();

        AboutPage aboutPage = new AboutPage();
        aboutPage.getDevelopers();
    }
}



