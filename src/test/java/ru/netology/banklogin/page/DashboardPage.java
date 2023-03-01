package ru.netology.banklogin.page;

public class DashboardPage {
    private SelenideElement heading = $("[data-test-id=dashboard]");

    public DashboardPage(){ heading.shouldBe(visible);}
}
