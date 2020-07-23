package javatojavascript;

import java.util.Arrays;

public class StringSplitter{

    private String exampleJavaProject;
    private String[] splitExampleJavaProject;

    public StringSplitter(String exampleJavaProject) {
        this.exampleJavaProject = exampleJavaProject;
    }

    public String getExampleJavaProject() {
        return exampleJavaProject;
    }

    public void setExampleJavaProject(String exampleJavaProject) {
        this.exampleJavaProject = exampleJavaProject;
    }

    public String[] getSplitExampleJavaProject() {
        return splitExampleJavaProject;
    }

    public void setSplitExampleJavaProject(String exampleJavaProject) {
        this.splitExampleJavaProject = exampleJavaProject.split("\\n");
    }

    @Override
    public String toString() {
        return "StringSplitter{" +
                "exampleJavaProject='" + exampleJavaProject + '\'' +
                ", splitExampleJavaProject=" + Arrays.toString(splitExampleJavaProject) +
                ", exampleJavaProject='" + exampleJavaProject + '\'' +
                ", splitExampleJavaProject=" + Arrays.toString(splitExampleJavaProject) +
                '}';
    }

}
