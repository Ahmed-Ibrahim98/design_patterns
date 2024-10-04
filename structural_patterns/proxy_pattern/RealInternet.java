package structural_patterns.proxy_pattern;

public class RealInternet implements Internet{
    @Override
    public void connectTo(String host) {
        System.out.println("Opened Connection to " + host);
    }
}
