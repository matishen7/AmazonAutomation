package enums;

public enum Url {
    PRODUCT_SECTION("/gp/product"),
    BASEURL("https://www.amazon.com"),
    SIGNOUT("/gp/flex/sign-out.html"),
    BESTSELLERS_SECTION("/gp/bestsellers");
    String url;

    Url(String url){
        this.url = url;
    }

    public String getURL() {
        return url;
    }
}