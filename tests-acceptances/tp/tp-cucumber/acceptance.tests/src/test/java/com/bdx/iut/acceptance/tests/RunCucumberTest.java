package com.bdx.iut.acceptance.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/features/"},strict = true)
public class RunCucumberTest { }
