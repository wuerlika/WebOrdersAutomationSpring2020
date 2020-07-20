package com.weborders.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.io.File;
import java.io.FileOutputStream;

public class BrowserUtils {
   public static void takeScreenShot() {
       TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
   }}