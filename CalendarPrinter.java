public class CalendarPrinter {
  public static void main (String[] args) {
    int d = 0;
    String x = "";
    while (d < 31) {
      if (d == 1)
      x = " ";
      else if (d == 7)
      x = " - NO SCHOOL (LABOR DAY)";
      else if (d == 25)
      x = " - END OF THE MARKING PERIOD";
      else if (d == 5 || d == 6|| d == 12 || d == 13|| d == 19 || d == 20|| d == 26 || d == 27)
      x = " – WEEKEND";
      else
      x = " ";
      d++;
      System.out.println("September " + d + x );
    }
  }
}