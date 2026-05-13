package Proxy.ex1.clase;

public class ProxySite implements ISite{

    protected ISite site;

    public ProxySite(ISite site) {
        this.site = site;
    }

    @Override
    public void printeaza() {
        if(site.getUrl().length()>7)
        {
            site.printeaza();
        }
        else{
            System.out.println("Site-ul are un URL incomplet");
        }
    }

    @Override
    public String getUrl() {
        return site.getUrl();
    }
}
