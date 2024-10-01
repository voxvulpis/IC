package br.unesp;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
    // @SuiteDisplayName("Vector Test Suite")
    // @SelectPackages("br.unesp")
    // @IncludeClassNamePatterns(".*Tests")
@SelectClasses({VectorEqualTest.class, VectorSizeTest.class})
public class VectorTest {
}
