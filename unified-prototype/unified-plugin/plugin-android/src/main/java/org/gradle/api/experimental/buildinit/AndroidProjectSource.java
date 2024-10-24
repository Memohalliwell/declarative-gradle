package org.gradle.api.experimental.buildinit;

import org.gradle.buildinit.projectspecs.InitProjectGenerator;
import org.gradle.buildinit.projectspecs.InitProjectSource;
import org.gradle.buildinit.projectspecs.InitProjectSpec;

import java.util.List;

/**
 * A {@link InitProjectSource} of project specifications for Android projects.
 */
@SuppressWarnings("UnstableApiUsage")
public final class AndroidProjectSource implements InitProjectSource {
    @Override
    public List<InitProjectSpec> getProjectSpecs() {
        return List.of(
            new StaticProjectSpec("android-application", "Declarative Android Application Project"),
            new StaticProjectSpec("android-application-basic-activity", "Declarative Android Application Project with Basic Activity"),
            new StaticProjectSpec("android-application-empty-activity", "Declarative Android Application Project with Empty Activity")
        );
    }
