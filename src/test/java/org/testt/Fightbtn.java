package org.testt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fightbtn extends BaseClass {
	public Fightbtn() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@class='farefinder-option-icons large'])[3]")
	private WebElement btnFlight;
	
	@FindBy(xpath="(//input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis'])[1]")
	private WebElement txtFrom;
	
	@FindBy(xpath="(//input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis'])[2]")
	private WebElement txtto;
	
	@FindBy(xpath="(//div[@class='picker__overlay picker__overlay--selectable'])[1]")
	private WebElement dateclk;
	
	
	@FindBy(xpath="//div[@class='bound bg-brand text-white']")
	private WebElement srtDate;
	
	@FindBy(xpath="(//div[@class='day-availability__day'])[34]")
	private WebElement endDate;
	

	@FindBy(xpath="(//div[@class='picker__overlay picker__overlay--selectable'])[3]")
	private WebElement Adult;
	
	@FindBy(xpath="(//span[@class='SVGIcon SVGIcon--16px flex-center'])[2]")
	private WebElement Adultcalculate;
	
	@FindBy(xpath="(//span[@class='SVGIcon SVGIcon--16px flex-center'])[4]")
	private WebElement childcalculate;
	
	@FindBy(xpath="//button[@class='btn btn-primary hw-btn hw-btn-block']")
	private WebElement findflight;
	
	@FindBy(xpath="//a[@class='hw-tab active']")
	private WebElement retrunclk;
	
//	--------------------------------------------------------------------------------------
	
	public WebElement getRetrunclk() {
		return retrunclk;
	}

	public void setRetrunclk(WebElement retrunclk) {
		this.retrunclk = retrunclk;
	}

	public WebElement getFindflight() {
		return findflight;
	}

	public WebElement getAdultcalculate() {
		return Adultcalculate;
	}

	public WebElement getChildcalculate() {
		return childcalculate;
	}

	public WebElement getDateclk() {
		return dateclk;
	}

	public WebElement getSrtDate() {
		return srtDate;
	}

	public WebElement getEndDate() {
		return endDate;
	}

	public WebElement getAdult() {
		return Adult;
	}

	public WebElement getTxtto() {
		return txtto;
	}

	public WebElement getTxtFrom() {
		return txtFrom;
	}

	public WebElement getBtnFlight() {
		return btnFlight;
	}
	
	public void Jana() throws InterruptedException {
		buttonClick(getBtnFlight());
		sendkeys(getTxtFrom(), "londan");
		sendkeys(getTxtto(), "chennai");
		buttonClick(getDateclk());
		buttonClick(getSrtDate());
		buttonClick(getEndDate());
		buttonClick(getAdult());
		buttonClick(getAdultcalculate());;
		buttonClick(getAdultcalculate());
		buttonClick(getChildcalculate());
		buttonClick(getChildcalculate());
		Thread.sleep(3000);	buttonClick(getRetrunclk());
//		buttonClick(getFindflight());
		
		
		
	}
	

	}
