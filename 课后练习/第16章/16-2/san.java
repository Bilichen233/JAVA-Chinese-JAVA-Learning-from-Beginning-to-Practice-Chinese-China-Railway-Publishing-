import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
@interface LogHistory {
  Log[] value();
}
@Repeatable(LogHistory.class)
@interface Log {
  String date();
  String comments();
}

@Log(date = "02/01/2018", comments = "A")
@Log(date = "01/22/2018", comments = "B")
public class san {
  public static void main(String[] args) {
    Class<san> mainClass = san.class;

    Log[] annList = mainClass.getAnnotationsByType(Log.class);
    for (Log log : annList) {
      System.out.println("Date=" + log.date() + ", Comments=" + log.comments());
    }

    Class<LogHistory> containingAnnClass = LogHistory.class;
    LogHistory logs = mainClass.getAnnotation(containingAnnClass);

    for (Log log : logs.value()) {
      System.out.println("Date=" + log.date() + ", Comments=" + log.comments());
    }
  }
}