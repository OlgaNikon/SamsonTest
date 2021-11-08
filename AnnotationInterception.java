package main.java.task02;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotationInterception implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
        TestMethodInfo info = method.getAnnotation(TestMethodInfo.class);
        System.out.println(info.priority() + " " + info.author() + " " + info.lastModified());
    }

}
