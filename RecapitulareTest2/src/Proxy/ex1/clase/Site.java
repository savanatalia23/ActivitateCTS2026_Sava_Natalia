package Proxy.ex1.clase;

public class Site implements ISite{

    protected String url;

    public Site(String url) {
        this.url = url;
    }


    @Override
    public void printeaza() {
        System.out.println("Adresa URL la care v-ati conectat est: " + this.url);
    }

    @Override
    public String getUrl() {
        return this.url;
    }

}
