package vertexOOP.lesson6.classwork;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by vertex0002 on 07.09.2017.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface CodingTime {

    String run() default "run";
    String go() default  "go";
}
