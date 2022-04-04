enum Level {
  PENDING, FAILED, PASSED;
}

@interface Review {
  Level status() default Level.PENDING;

  String comments() default "";
}

@Review(status = Level.PASSED)
public class si {

}