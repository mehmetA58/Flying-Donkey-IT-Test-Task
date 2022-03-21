package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestTrello {
    APIRequests apiRequests = new APIRequests();


    @Given("Send request for create {string} board")
    public void sendRequestForCreateBoard(String boardName) {
        apiRequests.createNewBoard(boardName);
    }
    @Then("Send request for create {string} card and {string}")
    public void sendRequestForCreateCardAnd(String cardName, String cardName1) {
        apiRequests.createNewCard(cardName);
        apiRequests.createNewCard(cardName1);
    }

    @Given("Send request for update {string} board")
    public void sendRequestForUpdateBoard(String UpdateName) throws InterruptedException {
        Thread.sleep(3000);
        apiRequests.updateCard(UpdateName);
    }

    @And("Send request for delete card")
    public void sendRequestForDeleteCard() {
        apiRequests.deleteCard1();
        apiRequests.deleteCard2();
    }


    @Given("Send request for delete board")
    public void sendRequestForDeleteBoard() {
        apiRequests.deleteBoard();
    }


}
