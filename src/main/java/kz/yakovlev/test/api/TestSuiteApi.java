package kz.yakovlev.test.api;

import kz.yakovlev.test.api.test.TestChangeStatus;
import kz.yakovlev.test.api.test.TestCreateTask;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestCreateTask.class,
        TestChangeStatus.class
})
public class TestSuiteApi {
}
