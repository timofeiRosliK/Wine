import entity.Country;
import entity.Wine;
import service.WineService;

import java.time.LocalDate;

public class WineMain {
    public static void main(String[] args) {
        Wine wine = new Wine("Bosca", "Anna de Federica", Country.IBIZA,
                LocalDate.of(2017,3,6), "delicious");
        WineService wineService = new WineService();
        double years = wineService.countDays(LocalDate.now(), wine);
        System.out.println("years = " + years);

    }
}
