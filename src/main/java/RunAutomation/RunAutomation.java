package RunAutomation;

import NewCustomer.NewCustomer;

public class RunAutomation extends NewCustomer {
    public static void main(String[] args) {
        RunChrome();
        RunURL("http://demo.guru99.com");
        LoginPage();
        Login();
        NewCustomer();
        TC1();

    }

}
