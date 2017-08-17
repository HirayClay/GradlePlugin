package pack.io.hiray.packer

import org.gradle.api.tasks.Input

/**
 * Created by CJJ on 2017/8/16.
 *
 * @author CJJ
 */

public class Element {

    private String name
    private String description

    public Element(name) {
        this.name = name
    }

    @Input
    def getDecription() {
        return description
    }


    @Input
    String getName() {
        return this.name
    }

    /**
     * if you want to omit the "=" for the property assignment in build.gradle file,
     * you need to write code below for each property
     */

    def name(String name) {
        this.name = name
    }

    def description(String description) {
        this.description = description
    }
}