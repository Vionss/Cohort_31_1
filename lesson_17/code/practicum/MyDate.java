package practicum;

public class MyDate {
    int day;
    int month;
    int year;

    public String dateToString() {
        System.out.println("--- dateToStringWithObject ---- ");
        if (month < 0 || month > 12) {
            return "error";
        }

        String[] months = {"", " Январь", " Февраль", " Март", " Апрель", " Май", " Июнь", " Июль", " Август", " Сентябрь", " Октябрь", " Ноябрь", " Декабрь"};
        return (day < 10 ? "0" : "") + day + " " + months[month] + " " + year;
    }
}
