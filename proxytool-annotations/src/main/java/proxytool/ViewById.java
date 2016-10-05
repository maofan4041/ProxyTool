package proxytool;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by cry on 2016/9/21.
 */

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)
public @interface ViewById  {

    int value();
}
