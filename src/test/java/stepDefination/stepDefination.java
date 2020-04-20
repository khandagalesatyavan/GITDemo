package stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is On Netbankinng Loading Page$")
    public void user_is_on_netbankinng_loading_page() throws Throwable {
    //code navigate to login url
    	System.out.println("Navigate to login url");
    }

    @When("^User login into Application page with Userid and Password$")
    public void user_login_into_application_page_with_userid_and_password() throws Throwable {
        //code to login
    	System.out.println("Login to Succesfully");
    	
    }

    @Then("^Homepage is Papulated$")
    public void homepage_is_papulated() throws Throwable {
        //Home page validated
    	System.out.println("validated home page");
    }
    
    @When("^User login into Application page with \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void user_login_into_application_page_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }

    @Then("^Card Displayed are \"([^\"]*)\"$")
    public void card_Displayed_are(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg1);
    }


}