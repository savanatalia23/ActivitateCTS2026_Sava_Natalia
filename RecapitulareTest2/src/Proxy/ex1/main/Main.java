package Proxy.ex1.main;

import Proxy.ex1.clase.ISite;
import Proxy.ex1.clase.ProxySite;
import Proxy.ex1.clase.Site;

public class Main {
    static void main(String[] args) {
        ISite facebook = new Site("facebook.com");
        ISite facebook1 = new Site("fcom");

        facebook.printeaza();
        facebook1.printeaza();

        ProxySite facebookProxy = new ProxySite(facebook);
        ProxySite facebook1Proxy = new ProxySite(facebook1);

        facebookProxy.printeaza();
        facebook1Proxy.printeaza();
    }
}
