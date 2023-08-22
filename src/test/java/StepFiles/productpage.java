package StepFiles;

import FirstPage.productpagepo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class productpage {
    public WebDriver driver;
    public Actions act;
    public productpagepo product;
    public  productpage page1;
   // public ArrayList<String>alphabetic_order=new ArrayList<String>();

    @AfterMethod
    public void close(){
        driver.quit();
    }
    @BeforeMethod
    public void open() throws InterruptedException {
        driver=new ChromeDriver();
        product=new productpagepo(driver);
         act=new Actions(driver);
        driver.manage().window().maximize();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }
    /*@Test
    public  void arra(){
        product.setThirdtab();
        product.setThirdtabmoni();
        Assert.assertEquals(product.setCheck_text(),"Monitors");
        product.setCheckbox1();

        System.out.println(product.setarrayA_Z());
       // product.setNameatoz();
    }*/

    //destok side tab
  /*  @Test
    public void t_case1()
    {
        product.setDesktop();
        Assert.assertEquals(driver.getCurrentUrl(),"https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20");
    }*/
    //Main First tab(Desktop)
    @Test
    public void T_case11(){
        product.setFirsttab();
    }
    //sub menu pc
    @Test
    public void T_case11_1(){
        product.setFirsttab();
        product.setFirsttabpc();
    }
//sub menu mac
    @Test
    public void T_case11_2(){
        product.setFirsttab();
        product.setFirsttabmac();
    }
    //submenu show all desktop
    @Test
    public  void T_case11_3() {
    product.setFirsttab();
    product.setFirsttaball();
    }
    //second tab
    @Test
    public  void T_case21()
    {
        product.setSecondtab();
    }
    @Test
    public  void T_case21_1()
    {
       // product.setSecondtab();
        product.setSecondtabmac();
    }
    @Test
    //THIRD TAB
    public  void Task5()
    {
        // product.setSecondtab();
        product.setThirdtab();
    }

    @Test
    //THIRD TAB _ Choose Monitor
    public  void Task5_1()
    {
        product.setThirdtab();
        product.setThirdtabmoni();
        Assert.assertEquals(product.setCheck_text(),"Monitors");
    }
    @Test
    //THIRD TAB _Choose Monitor ans set ato z sort
    public  void Task5_2()
    {
        product.setThirdtab();
        product.setThirdtabmoni();
        Assert.assertEquals(product.setCheck_text(),"Monitors");
        product.setCheckbox1();
        product.setNameatoz();
        Assert.assertEquals(product.setText1(),"Apple Cinema 30\"");
    }
    //THIRD TAB _Choose Monitor ans set zto a sort
    @Test

    public  void Task5_3()
    {
        product.setThirdtab();
        product.setThirdtabmoni();
        Assert.assertEquals(product.setCheck_text(),"Monitors");
        product.setCheckbox1();
        product.setNameztoa();
        Assert.assertEquals(product.setText2(),"Samsung SyncMaster 941BW");
    }
    //THIRD TAB _Choose Monitor ans set hightolow sort
    @Test

    public  void Task5_4()
    {
        product.setThirdtab();
        product.setThirdtabmoni();
        Assert.assertEquals(product.setCheck_text(),"Monitors");
        product.setCheckbox1();
        product.setHightolow();
        Assert.assertEquals(product.setText2(),"Samsung SyncMaster 941BW");
    }
    //THIRD TAB _Choose Monitor ans set lowtohigh sort
    @Test

    public  void Task5_5()
    {
        product.setThirdtab();
        product.setThirdtabmoni();
        Assert.assertEquals(product.setCheck_text(),"Monitors");
        product.setCheckbox1();
        product.setLowtohigh();
        Assert.assertEquals(product.setText1(),"Apple Cinema 30\"");
    }
    //Model a-Z
    @Test

    public  void Task5_6()
    {
        product.setThirdtab();
        product.setThirdtabmoni();
        Assert.assertEquals(product.setCheck_text(),"Monitors");
        product.setCheckbox1();
        product.setModelatoz();
        Assert.assertEquals(product.setText1(),"Apple Cinema 30\"");
    }
//highest
    @Test
    public  void Task5_9()
    {
        product.setThirdtab();
        product.setThirdtabmoni();
        Assert.assertEquals(product.setCheck_text(),"Monitors");
        product.setCheckbox1();
        product.setHigh();
        Assert.assertEquals(product.setText2(),"Samsung SyncMaster 941BW");
    }
    //lowest
    @Test
    public  void Task5_8()
    {
        product.setThirdtab();
        product.setThirdtabmoni();
        Assert.assertEquals(product.setCheck_text(),"Monitors");
        product.setCheckbox1();
        product.setLow();
        Assert.assertEquals(product.setText1(),"Apple Cinema 30\"");
    }
   // Model zto a
    @Test
    public  void Task5_7()
    {
        product.setThirdtab();
        product.setThirdtabmoni();
        Assert.assertEquals(product.setCheck_text(),"Monitors");
        product.setCheckbox1();
        product.setModelztoa();
        Assert.assertEquals(product.setText2(),"Samsung SyncMaster 941BW");
        //Collections.sort();
    }
    //default option
@Test
    public void Task5_10()
{
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.MINUTES);
    product.setThirdtab();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.MINUTES);
    product.setThirdtabmoni();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.MINUTES);
    Assert.assertEquals(product.setCheck_text(),"Monitors");
    product.setCheckbox1();
    product.setFirstoption();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.MINUTES);
    Assert.assertEquals(product.setText1(),"Apple Cinema 30\"");
}
/*@Test
    public void Grid1()
{
    product.setGrid1();
    Assert.assertEquals();
}*/
    //CompareWindow
    @Test
    public void  Task8()throws InterruptedException {
        product.setThirdtab();
        product.setThirdtabmoni();
        Assert.assertEquals(product.setCheck_text(),"Monitors");
        product.setCheckbox1();
        product.setFirstoption();
        Assert.assertEquals(product.setText1(),"Apple Cinema 30\"");
       // product.setCart();
       // product.setWishlist();
        act.sendKeys(Keys.PAGE_DOWN);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        product.setAppleCompare();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        act.sendKeys(Keys.PAGE_DOWN);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        product.setSamsungCompare();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        product.setComparewindowopen();
    }
    //Wishlist
    @Test
    public void Task9()throws InterruptedException{
        product.setThirdtab();
        product.setThirdtabmoni();
        Assert.assertEquals(product.setCheck_text(),"Monitors");
        product.setCheckbox1();
        product.setFirstoption();
        Assert.assertEquals(product.setText1(),"Apple Cinema 30\"");
         product.setCart();
         product.setAppleWishlist();
         product.setWishlistwindow1();
         product.setUsername("samvishal@gmail.com");
         product.setPassword("samvishal");
         product.setLoginbutton();
         Thread.sleep(1000);
        Assert.assertEquals(product.setText11(),"Apple Cinema 30\"");
    }
    //Review
    @Test
    public void Task7()throws InterruptedException {
        product.setThirdtab();
        product.setThirdtabmoni();
        Assert.assertEquals(product.setCheck_text(), "Monitors");
        product.setCheckbox1();
        product.setFirstoption();
        Assert.assertEquals(product.setText1(), "Apple Cinema 30\"");
        product.setCart();
        product.setReviewbutton();

        act.sendKeys(Keys.PAGE_UP);
        product.setReviewname("Samvishal");
        product.setReview("The product is very good and the price is affordable");
        product.setRadiobutton();
        product.setConfirm();
        Assert.assertEquals(product.setText12(), "Thank you for your review. It has been submitted to the webmaster for approval.");
    }
    //SAMSUNG PRODUCT CLICKED AND CHECK WHETHER THE DETAILED PAGE OF THE PRODUCT IS DISPLAYED CORRECTLY
    @Test
        public void Task6()throws InterruptedException{
        product.setThirdtab();
        product.setThirdtabmoni();
        Assert.assertEquals(product.setCheck_text(),"Monitors");
        //Thread.sleep(1000);
        act.sendKeys(Keys.PAGE_DOWN);
        product.setSamsung();
        // Assert.assertEquals(product.setCheckSamsung(),"Samsung SyncMaster 941BW");
        Assert.assertEquals(product.setCheckSamsungcode(),"Product Code: Product 6");

    }
    @Test
    public  void SamsungWishlist()
    {
        product.setThirdtab();
        product.setThirdtabmoni();
        Assert.assertEquals(product.setCheck_text(),"Monitors");
        product.setSamsung();
        Assert.assertEquals(product.setCheckSamsung(),"Samsung SyncMaster 941BW");
        product.setSamsungWishlist();
        product.setWishlistwindow1();//open wishlist window from the home tab
        product.setUsername("samvishal@gmail.com");
        product.setPassword("samvishal");
        product.setLoginbutton();
       // Thread.sleep(1000);
        Assert.assertEquals(product.setText13(),"Samsung SyncMaster 941BW");
       /* product.setSamsungWishlist_remove();//remove samsung from wishlist
        System.out.println(product.setWishlistRemove());
        Assert.assertEquals(product.setWishlistRemove(),"Success: You have modified your wish list!");//validating the remove button*/
    }
    /*@Test
    public void wishlist()throws InterruptedException{
        product.setWishlistwindow1();//open wishlist window from the home tab
        product.setUsername("samvishal@gmail.com");
        product.setPassword("samvishal");
        Thread.sleep(3000);
        product.setLoginbutton();
        Assert.assertEquals(driver.getCurrentUrl(),"https://naveenautomationlabs.com/opencart/index.php?route=account/wishlist");
        Thread.sleep(2000);
       // System.out.println(product.setWishlistempty());
       // String s= (String) product.setWishlistempty();
        if(product.setWishlistempty().equals("Your wish list is empty.") || product.setText13().equals("Samsung SyncMaster 941BW"))
        {
            product.setSamsungWishlist_continue();
            product.setThirdtab();
            product.setThirdtabmoni();
            Assert.assertEquals(product.setCheck_text(),"Monitors");
            product.setSamsung();
            Assert.assertEquals(product.setCheckSamsung(),"Samsung SyncMaster 941BW");
            product.setSamsungWishlist();
            product.setEmptywishlistopen();//open wishlist
            //product.setWishlistwindow1();//open wishlist window from the home tab
            //product.setUsername("samvishal@gmail.com");
           // product.setPassword("samvishal");
           // product.setLoginbutton();
            // Thread.sleep(1000);
            //Assert.assertEquals(product.setText13(),"Samsung SyncMaster 941BW");
        }
        else {
            product.setSamsungWishlist_remove();//remove samsung from wishlist
            System.out.println(product.setWishlistRemove());
            Assert.assertEquals(product.setWishlistRemove(),"Success: You have modified your wish list!");//validating the remove button
        }

      // Assert.assertEquals(s,s.compareTo(""));*/

    //}
}
