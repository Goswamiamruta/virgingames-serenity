package com.virgingames.userinfo;

import com.virgingames.constants.Endpoint;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class UserSteps {
    @Step("Getting all users of Bingo")
    public ValidatableResponse getAllUsersOfBingo() {
        return SerenityRest.given().log().all()
                .when()
                .get(Endpoint.GET_ALL_USERS)
                .then();
    }

    @Step("Getting all users of Bingo with query parameters")
    public ValidatableResponse getUsersWithQueryParams() {
        return SerenityRest.given().log().ifValidationFails()
                .when()
                .queryParams("Currency","GBP")
                .get(Endpoint.GET_ALL_USERS)
                .then();
    }
}