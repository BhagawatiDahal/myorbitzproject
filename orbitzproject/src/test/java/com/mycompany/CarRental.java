/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import static com.mycompany.BaseTest.driver;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author brave
 */
public class CarRental extends BaseTest {
    
    
    @Test
  public void testOrbitzCarsRentalNewyork() throws Exception {
    driver.get("https://www.orbitz.com/");
      driver.manage().window().maximize();
       Thread.sleep(500);
      
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Flights'])[2]/following::*[name()='svg'][1]")).click();
    driver.findElement(By.xpath("//div[@id='location-field-locn-menu']/div/button")).click();
    driver.findElement(By.id("location-field-locn")).clear();
     Thread.sleep(500);
    
    driver.findElement(By.id("location-field-locn")).sendKeys("New York (JFK - John F. Kennedy Intl.)");
    driver.findElement(By.xpath("//div[@id='location-field-locn-menu']/div[2]/ul/li/button/div/div/span/strong")).click();
    Thread.sleep(500);
    //driver.findElement(By.id("wizard-car-pwa-1")).submit();
   driver.findElement(By.xpath("//div[@id='location-field-loc2-menu']/div/button")).click();
   driver.findElement(By.id("location-field-loc2")).clear();
   driver.findElement(By.id("location-field-loc2")).sendKeys("New York (JFK - John F. Kennedy Intl.)");
   //driver.findElement(By.id("wizard-car-pwa-1")).submit();
   driver.findElement(By.id("d1-btn")).click();
     Thread.sleep(500);
    driver.findElement(By.xpath("//div[@id='Rental-cars-transportation']/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr/td[4]/button")).click();
     Thread.sleep(500);
    driver.findElement(By.xpath("//div[@id='Rental-cars-transportation']/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/button")).click();
     Thread.sleep(500);
    driver.findElement(By.xpath("//div[@id='Rental-cars-transportation']/div[2]/div/div/div/div/div/div[2]/div/div[3]/button")).click();
     Thread.sleep(500);
    driver.findElement(By.xpath("//div[@id='Rental-cars-transportation']/div[2]/div[2]/div/select")).click();
    Thread.sleep(500);

    new Select(driver.findElement(By.xpath("//div[@id='Rental-cars-transportation']/div[2]/div[2]/div/select"))).selectByVisibleText("8:00 am");
    driver.findElement(By.xpath("//div[@id='Rental-cars-transportation']/div[2]/div[3]/div/select")).click();
    Thread.sleep(500);
    new Select(driver.findElement(By.xpath("//div[@id='Rental-cars-transportation']/div[2]/div[3]/div/select"))).selectByVisibleText("9:00 am");
    driver.findElement(By.xpath("//div[@id='Rental-cars-transportation']/div[2]/div[3]/div/select")).click();
    
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(10000);
   
}
}
