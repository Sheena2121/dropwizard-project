package com.everydaylabs;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ssDropWizardTestApplication extends Application<ssDropWizardTestConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ssDropWizardTestApplication().run(args);
    }

    @Override
    public String getName() {
        return "ssDropWizardTest";
    }

    @Override
    public void initialize(final Bootstrap<ssDropWizardTestConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ssDropWizardTestConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
