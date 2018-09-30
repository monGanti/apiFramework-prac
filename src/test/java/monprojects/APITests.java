package monprojects;

import org.testng.annotations.Test;

public class APITests {

    @Test (groups = { "smoke"})
    public void postJira(){
        System.out.println("post Jira");

    }

    @Test (groups = { "reg"})
    public void deleteTwitter(){
        System.out.println("Delete Twitter");

    }
}
