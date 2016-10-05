package proxytool.api;

import android.view.View;

/**
 * Created by cry on 2016/9/21.
 */

public interface IProxy<T> {
    /**
     *
     * @param target 所在的类
     * @param root 查找 View 的地方
     */
    public void inject(final T target, View root);
}
