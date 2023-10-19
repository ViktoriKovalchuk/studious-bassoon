public class pro {
    public static void main(String[] args) throws Exception {
        System.out.println("\tStart");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://demo.opencart.com/");
        Thread.sleep(2000); 
        System.out.println("\tdemo.opencart.com opened, title = " + driver.getTitle());
        //
        driver.findElement(By.cssSelector("button.navbar-toggler.collapsed")).click();
        Thread.sleep(2000); 
        System.out.println("\tbutton.navbar-toggler.collapsed clicked ");
        //
        driver.findElement(By.cssSelector("div.dropdown-menu.show")).click();
        Thread.sleep(2000); 
        System.out.println("\tdiv.dropdown-menu.show clicked");
        //
        driver.findElement(By.cssSelector("div.d-block.d-sm-block.d-lg-none"));
        Thread.sleep(2000); 
        System.out.println("\tdiv.d-block.d-sm-block.d-lg-none clicked");
        //
        driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
        Thread.sleep(2000);
        System.out.println("\ta.btn.btn-primary clicked");
        //
        Thread.sleep(4000); \
        driver.quit();
        //
        System.out.println("\tDone");
    }
}