package 接口test;

import javax.annotation.processing.SupportedSourceVersion;

public abstract class teacher extends person {
    public teacher() {
    }

    public teacher(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
