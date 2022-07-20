package org.testt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Carinfo extends BaseClass {
	
	public Carinfo() {
	PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="(//div[@class='farefinder-option inactive'])[2]")
	private WebElement carbtn;
	
    @FindBy(xpath="//input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']")	
	private WebElement pickuplocation;
    
    

    @FindBy(xpath="//button[@class='btn btn-link dropoff-toggle-link btn-sm']")	
   	private WebElement extraopn;
    
  
	@FindBy(xpath="(//input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis'])[2]")	
   	private WebElement dropuplocation;
    
    
    @FindBy(xpath=" (//div[@class='picker__overlay picker__overlay--selectable'])[1]")	
  	private WebElement pickupdate;
	
    @FindBy(xpath=" //div[@class='bound bg-brand text-white']")	
  	private WebElement pickupdate1;
    
    @FindBy(xpath=" (//div[@class='day-availability__day'])[15]")	
  	private WebElement pickupdate2;
   

	@FindBy(xpath="(//select[@class='hw-input hw-input-icon hw-input-clock-icon hw-input-with-icon dropoff'])[1]")	
	private WebElement pickuptime;
	

	@FindBy(xpath="(//select[@class='hw-input hw-input-icon hw-input-clock-icon hw-input-with-icon dropoff'])[2]")	
	private WebElement droptime;
	
	
    
//	-------------------------------------------------------------------------------------------------------
    
	public WebElement getCarbtn() {
		return carbtn;
	}
    
    public WebElement getPickuplocation() {                      
		return pickuplocation;
	}

	public WebElement getDropuplocation() {
		return dropuplocation;
	}

	  
    public WebElement getExtraopn() {
		return extraopn;
	}
	
	public WebElement getPickupdate() {
		return pickupdate;
	}

	public WebElement getPickupdate1() {
		return pickupdate1;
	}

	public WebElement getPickupdate2() {
		return pickupdate2;
	}

	public WebElement getPickuptime() {
		return pickuptime;
	}
	public WebElement getDroptime() {
		return droptime;
	}
	
    
   
	

	public void Green() throws InterruptedException {
		
		buttonClick(getCarbtn());
		buttonClick(getPickuplocation());
		sendkeys(getPickuplocation(),"londan");
		buttonClick(getExtraopn());
		buttonClick(getDropuplocation());
		sendkeys(getDropuplocation(),"chennai");
		buttonClick(getPickupdate());
		buttonClick(getPickupdate1());
		buttonClick(getPickupdate2());
		SelectByIndex(getPickuptime(),3);
		SelectByIndex(getDroptime(),9);
		
		
	}

	
	
	
}


