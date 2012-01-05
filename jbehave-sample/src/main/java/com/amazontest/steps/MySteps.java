package com.amazontest.steps;

import com.mypackage.MyList;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class MySteps {

    private MyList list;

    @Given("an empty list")
    public void anEmptyList() {
        list = new MyList();
    }

    @When("I add a number $number")
    public void addNumber(int number) {
        list.add(number);
    }

    @Then("size becomes $size and the list contains $number")
    public void sizeValidation(int size, int number) {
        assertEquals(size, list.size());
        assertTrue(list.contains(number));
    }

    @When("I remove number $number")
    public void remove(int number) {
        list.remove(number);
    }

    @Then("the list is empty")
    public void listIsEmpty() {
        assertTrue(list.isEmpty());
    }
}
