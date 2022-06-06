package lab_06;

public class Lab_6_4 {

    public static void main(String[] args) {
        String url = "https://google.com";
        if (url.contains("www.")){
            url = url.replaceAll("www.","");
        }
        System.out.println("Protocol: " + url.substring(0, url.indexOf(":")));
        System.out.println("Domain name: " + url.substring((url.indexOf("//")+2), url.indexOf(".")));
        System.out.println("Domain: " + url.substring(url.indexOf(".")));
    }

}
