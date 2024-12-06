import java.util.*;

public class AptInf {
    private final String nazvanie;
    private final List<AptLek> lekarstva;

    public AptInf(String nazvanie) {
        this.nazvanie = nazvanie;
        this.lekarstva = new ArrayList<>();
    }

    public void dobavitLekarstvo(AptLek lekarstvo) {
        lekarstva.add(lekarstvo);
    }
    public String poluchitInformatsiyu() {
        StringBuilder info = new StringBuilder("Аптека: " + nazvanie + "\nЛекарства:\n");
        for (AptLek lekarstvo : lekarstva) {
            info.append(lekarstvo.nazvanie()).append(" - ")
                    .append(lekarstvo.stoimost()).append(" руб.\n");
        }
        return info.toString();
    }
    public double samoeDorogoeLekarstvo() {
        double maxStoimost = 0;
        for (AptLek lekarstvo : lekarstva) {
            if (lekarstvo.stoimost() > maxStoimost) {
                maxStoimost = lekarstvo.stoimost();
            }
        }
        return maxStoimost;
    }
    public double obshchayaStoimost() {
        double total = 0;
        for (AptLek lekarstvo : lekarstva) {
            total += lekarstvo.stoimost();
        }
        return total;
    }
}