package org.zstack.core.timeout;

import java.util.concurrent.TimeUnit;

/**
 * Created by frank on 2/17/2016.
 */
public interface TimeoutManager {
    Long getTimeout(Class clz);

    Long getTimeout(Class clz, long defaultTimeout);

    Long getTimeout(Class clz, String defaultTimeout);

    Long getTimeout(Class clz, TimeUnit tu);
}
