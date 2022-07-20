package org.testt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotal extends BaseClass{
	public Hotal() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@data-bdd='farefinder-option-hotels']")
	private WebElement hotalbtn;
	
	@FindBy(xpath="//input[@data-bdd='farefinder-hotel-destination-input']")
	private WebElement hotaltxt;
	
	@FindBy(xpath="(//div[@class='picker__overlay picker__overlay--selectable'])[1]")
	private WebElement dateclick;
	
	@FindBy(xpath="(//div[@class='day-availability__day'])[10]")
    private WebElement 	startdate;
	
	@FindBy(xpath="(//div[@class='day-availability__day'])[15]")
    private WebElement enddate;
	
	@FindBy(xpath="((//div[@class='picker__overlay picker__overlay--selectable'])[3]")
    private WebElement guestbtn;
	
	
	public WebElement getDateclick() {
		return dateclick;
	}

	public void setDateclick(WebElement dateclick) {
		this.dateclick = dateclick;
	}

	public WebElement getStartdate() {
		return startdate;
	}

	public void setStartdate(WebElement startdate) {
		this.startdate = startdate;
	}

	public WebElement getEnddate() {
		return enddate;
	}

	public void setEnddate(WebElement enddate) {
		this.enddate = enddate;
	}

	public WebElement getGuestbtn() {
		return guestbtn;
	}

	public void setGuestbtn(WebElement guestbtn) {
		this.guestbtn = guestbtn;
	}


	public WebElement getHotaltxt() {
		return hotaltxt;
	}

	public WebElement getHotalbtn() {
		return hotalbtn;	
	}
	
	public void hadrine() throws InterruptedException {
		buttonClick(getHotalbtn());
		sendkeys(getHotaltxt(),"chennai");
		buttonClick(getDateclick());
		buttonClick(getStartdate());
		buttonClick(getEnddate());
		buttonClick(getGuestbtn());
		

	}
}
