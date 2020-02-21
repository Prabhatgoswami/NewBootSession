package Java_Assignment2;

import com.sun.security.auth.SolarisNumericUserPrincipal;
import jdk.nashorn.internal.parser.JSONParser;

public class MetalChair extends Chair {
    @Override
    public String ChairType() {
        String string="Metal Chair";
        return string;
    }

    @Override
    public void StressTest() {
        System.out.println("Stress Test for Metal chair is Approved...");

    }

    @Override
    public void FireTest() {
        System.out.println("Fire Test for Metal Chair is Approved...");
    }
}
