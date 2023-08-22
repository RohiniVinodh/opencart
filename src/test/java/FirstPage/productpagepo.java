package FirstPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class productpagepo {
    public WebDriver driver;

    public productpagepo(WebDriver newdriver){
      driver=newdriver;
      PageFactory.initElements(driver,this);
    }
    @FindBy(how=How.XPATH,using="//a[text()=\"Desktops (13)\"]")
    @CacheLookup
    WebElement desktop;

    public void setDesktop(){
        desktop.click();
    }

    @FindBy(how=How.XPATH,using="//a[@href=\"https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20\"]")
    @CacheLookup
    WebElement Firsttab;

    public void setFirsttab() {
        Firsttab.click();
    }

    @FindBy(how=How.XPATH,using="//a[@href=\"https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20_26\"]")
    @CacheLookup
    WebElement Firsttabpc;

    public void setFirsttabpc() {
        Firsttabpc.click();
    }

    @FindBy(how=How.XPATH,using="//a[@href=\"https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20_27\"]")
    @CacheLookup
    WebElement Firsttabmac;

    public void setFirsttabmac() {
        Firsttabmac.click();
    }
    @FindBy(how=How.XPATH,using="//a[@class='see-all']")
    @CacheLookup
    WebElement Firsttaball;

    public void setFirsttaball() {
        Firsttaball.click();
    }

    @FindBy(how=How.XPATH,using="//a[@class='dropdown-toggle']")
    @CacheLookup
    WebElement Secondtab;

    public void setSecondtab() {
        Secondtab.click();
    }
    @FindBy(how=How.XPATH,using="//a[text()=\"Macs (0)\"]")
    @CacheLookup
    WebElement Secondtabmac;

    public void setSecondtabmac() {
        Secondtab.click();
    }


    @FindBy(how=How.XPATH,using="//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25']")
    @CacheLookup
    WebElement third;

    public void setThirdtab() {
        third.click();
    }

    @FindBy(how=How.XPATH,using="//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25_28']")
    @CacheLookup
    WebElement thirdmoni;

    public void setThirdtabmoni() {
        thirdmoni.click();
    }


    @FindBy(how=How.XPATH,using="//h2[text()=\"Monitors\"]")
    @CacheLookup
    WebElement check_text;

    public String setCheck_text() {
       return check_text.getText();
    }


    @FindBy(how=How.XPATH,using="//select[@id='input-sort']")
    @CacheLookup
    WebElement checkbox1;

    public void setCheckbox1() {
         checkbox1.click();
    }
    //Name A-Z
    @FindBy(how=How.XPATH,using="//option[@value='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25_28&sort=pd.name&order=ASC']")
    @CacheLookup
    WebElement nameatoz;

    public void setNameatoz() {
        nameatoz.click();
    }
    //Name Z-A
    @FindBy(how=How.XPATH,using="//option[@value='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25_28&sort=pd.name&order=DESC']")
    @CacheLookup
    WebElement nameztoa;

    public void setNameztoa() {
        nameztoa.click();
    }

    //high to low
    @FindBy(how=How.XPATH,using="//option[@value='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25_28&sort=p.price&order=DESC']")
    @CacheLookup
    WebElement hightolow;

    public void setHightolow() {
        hightolow.click();
    }
    //lowto high
    @FindBy(how=How.XPATH,using="//option[@value='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25_28&sort=p.price&order=ASC']")
       @CacheLookup
        WebElement lowtohigh;

        public void setLowtohigh() {
            lowtohigh.click();
        }
        //model A-Z
        @FindBy(how=How.XPATH,using="//option[@value='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25_28&sort=p.model&order=ASC']")
        @CacheLookup
        WebElement modelatoz;

    public void setModelatoz() {
        modelatoz.click();
    }

    //MOdel Z-a
    @FindBy(how=How.XPATH,using="//option[@value='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25_28&sort=p.model&order=DESC']")
    @CacheLookup
    WebElement modelztoa;

    public void setModelztoa() {
        modelztoa.click();
    }
    //Highest
    @FindBy(how=How.XPATH,using="//option[@value='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25_28&sort=rating&order=DESC']")
    @CacheLookup
    WebElement high;

    public void setHigh() {
        high.click();
    }
    //Lowest
    @FindBy(how=How.XPATH,using="//option[@value='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25_28&sort=rating&order=ASC']")
    @CacheLookup
    WebElement low;

    public void setLow() {
        low.click();
    }

//text apple
@FindBy(how=How.XPATH,using="//a[text()='Apple Cinema 30\"']")
@CacheLookup
WebElement text1;

    public String setText1() {
       return text1.getText();
    }
//text samsung

    @FindBy(how=How.XPATH,using="//a[text()='Samsung SyncMaster 941BW']")
    @CacheLookup
    WebElement text2;

    public String setText2() {
        return text2.getText();
    }
    @FindBy(how=How.XPATH,using="//option[text()='Default']")
    @CacheLookup
    WebElement firstoption;

    public void setFirstoption() {

        firstoption.click();
    }


   /* @FindBy(how=How.XPATH,using="//button[@id='list-view']")
    @CacheLookup
    WebElement grid1;
    public void setGrid1(){
        grid1.click();
    }*/

    @FindBy(how=How.XPATH,using="//button[@class='btn btn-default']/i[@class='fa fa-heart']")
    @CacheLookup
    WebElement applewishlist;
    public void setAppleWishlist(){
        applewishlist.click();
    }

    @FindBy(how=How.XPATH,using="//div[@class='button-group']//span[@class='hidden-xs hidden-sm hidden-md'][1]")
    @CacheLookup
    WebElement cart;
    public void setCart(){
        cart.click();
    }

    @FindBy(how=How.XPATH,using="//div[@class='btn-group']//i[@class='fa fa-exchange']")
    @CacheLookup
    WebElement compare;
    public void setCompare(){
        compare.click();
    }

    @FindBy(how=How.XPATH,using="//*[text()='Apple Cinema 30\"']")
    @CacheLookup
    WebElement comparewindowtext;
    public String setComparewindowtext(){
        return comparewindowtext.getText();
    }
    @FindBy(how=How.XPATH,using="//a[text()='product comparison']")
    @CacheLookup
    WebElement comparewindowopen;
    public void setComparewindowopen(){
         comparewindowopen.click();
    }
    @FindBy(how=How.XPATH,using="(//i[@class='fa fa-exchange'])[2]")
    @CacheLookup
    WebElement samsungcompare;
    public void setSamsungCompare(){
        samsungcompare.click();
    }

@FindBy(how=How.XPATH,using="//button[@type='button']//i[@class='fa fa-exchange']")
@CacheLookup
WebElement Applecompare;
    public void setAppleCompare(){
        Applecompare.click();
    }
//open wishlist window
    @FindBy(how=How.XPATH,using="(//span[@class='hidden-xs hidden-sm hidden-md'])[4]")
    @CacheLookup
    WebElement wishlitwindow1;
    public void setWishlistwindow1(){
        wishlitwindow1.click();
    }

    @FindBy(how=How.XPATH,using="//input[@id='input-email']")
    @CacheLookup
    WebElement username;
    public void setUsername(String uname){
        username.sendKeys(uname);
    }

    @FindBy(how=How.XPATH,using="//input[@id='input-password']")
    @CacheLookup
    WebElement password;
    public void setPassword(String pswd){
        password.sendKeys(pswd);
    }

    @FindBy(how=How.XPATH,using="//input[@type='submit']")
    @CacheLookup
    WebElement loginbutton;
    public void setLoginbutton(){
        loginbutton.click();
    }
    //To check Apple is in Wishlist
    @FindBy(how=How.XPATH,using="//td//a[text()='Apple Cinema 30\"']")
    @CacheLookup
    WebElement text11;

    public String setText11() {
        return text11.getText();
    }
   // (//div[@class='button-group'])[2]/button[3]
//Write aReview Without Login
    @FindBy(how=How.XPATH,using="//input[@id='input-name']")
    @CacheLookup
    WebElement reviewname;
    public void setReviewname(String uname){
        reviewname.sendKeys(uname);
    }
    @FindBy(how=How.XPATH,using="//textarea[@id='input-review']")
    @CacheLookup
    WebElement review;
    public void setReview(String rview){
        review.sendKeys(rview);
    }

    @FindBy(how=How.XPATH,using=" //a[text()='Write a review']")
    @CacheLookup
    WebElement reviewbutton;
    public void setReviewbutton(){
        reviewbutton.click();
    }
    @FindBy(how=How.XPATH,using=" //button[@id='button-review']")
    @CacheLookup
    WebElement confirmbutton;
    public void setConfirm(){
        confirmbutton.click();
    }

    //radio button
    @FindBy(how=How.XPATH,using=" //input[@value='3']")
    @CacheLookup
    WebElement radiobutton;
    public void setRadiobutton(){
        radiobutton.click();
    }
//ReviewSuccess
    @FindBy(how=How.XPATH,using="//div[@class='alert alert-success alert-dismissible']")
    @CacheLookup
    WebElement text12;

    public String setText12() {
        return text12.getText();
    }
    //Samsung

    @FindBy(how=How.XPATH,using="//a[text()='Samsung SyncMaster 941BW']")
    @CacheLookup
    WebElement samsung;
    public void setSamsung(){
        samsung.click();
    }
    //Check Samsung
    @FindBy(how=How.XPATH,using="//h1[text()='Samsung SyncMaster 941BW']")
    @CacheLookup
    WebElement checksamsung;
    public String setCheckSamsung(){
       return checksamsung.getText();
    }
    //Samsung product code
    @FindBy(how=How.XPATH,using="//li[text()='Product Code: Product 6']")
    @CacheLookup
    WebElement checksamsungcode;
    public String setCheckSamsungcode(){
        return checksamsungcode.getText();
    }
    //Samsung Wishlist
    @FindBy(how=How.XPATH,using="//button[@data-original-title='Add to Wish List']")
    @CacheLookup
    WebElement samsungwishlist;
    public void setSamsungWishlist(){
        samsungwishlist.click();
    }
    //To check Samsung is in Wishlist
    @FindBy(how=How.XPATH,using="//td//a[text()='Samsung SyncMaster 941BW']")
    @CacheLookup
    WebElement text13;

    public String setText13() {
        return text13.getText();
    }
    //Sorting array list
   /* @FindBy(how=How.XPATH,using="//p[@class='price']")
    @CacheLookup
    WebElement arrayA_Z;
    public String setarrayA_Z(){

        String v= String.valueOf(new ArrayList<String>());
        for(int i=0;i<=v.lastIndexOf(v);i++) {
            v = arrayA_Z.getText();

        }
        return String.valueOf(v.indexOf(1));
    }*/
    //Wishlist remove
    @FindBy(how=How.XPATH,using="//i[@class='fa fa-times']")
    @CacheLookup
    WebElement samsungwishlist_remove;
    public void setSamsungWishlist_remove(){
        samsungwishlist_remove.click();
    }
    //Wishlist remove Success Message
    @FindBy(how=How.XPATH,using="//div[@class='alert alert-success alert-dismissible']")
    @CacheLookup
    WebElement wishlistremove;

    public CharSequence setWishlistRemove() {
            //return wishlistremove.getText().replace("×","");
        return wishlistremove.getText().subSequence(0,42);

    }
    //wishlist empty
    @FindBy(how=How.XPATH,using="//div[@id='content']//p")
    @CacheLookup
    WebElement wishlistempty;

    public CharSequence setWishlistempty() {
        return wishlistempty.getText();

    }
    //continue button in wishlist
    @FindBy(how=How.XPATH,using="//a[text()='Continue']")
    @CacheLookup
    WebElement samsungwishlist_continue;
    public void setSamsungWishlist_continue(){
        samsungwishlist_continue.click();
    }
    @FindBy(how=How.XPATH,using="(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/wishlist'])[2]")
    @CacheLookup
    WebElement emptywishlistopen;
    public void setEmptywishlistopen(){
        emptywishlistopen.click();
    }

}
