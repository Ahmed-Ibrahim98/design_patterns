package structural_patterns.proxy_pattern;

public class ProxyPatternDemo {
    public static void main(String[] args){
        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("banned.com");
    }
}
