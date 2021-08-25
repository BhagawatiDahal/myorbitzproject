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
public class AirportTransportation extends BaseTest {
    
 

    @Test
  public void testAirportTransportation() throws Exception {
    driver.get("https://www.orbitz.com/");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Flights'])[2]/following::*[name()='svg'][1]")).click();
    driver.findElement(By.xpath("//ul[@id='uitk-tabs-button-container']/div/li[2]/a/span")).click();
    driver.findElement(By.xpath("//div[@id='location-field-location-menu']/div/button")).click();
    driver.findElement(By.id("location-field-location")).clear();
    driver.findElement(By.id("location-field-location")).sendKeys("New");
    driver.findElement(By.xpath("//div[@id='location-field-location-menu']/div[2]/ul/li[3]/button/div/div/span/strong")).click();
    driver.findElement(By.xpath("//div[@id='location-field-hotelName-menu']/div/button")).click();
    driver.findElement(By.id("location-field-hotelName")).clear();
    driver.findElement(By.id("location-field-hotelName")).sendKeys("New");
    driver.findElement(By.xpath("//div[@id='location-field-hotelName-menu']/div[2]/ul/li/button/div/div/span/strong")).click();
    driver.findElement(By.xpath("//div[@id='location-field-hotelName-menu']/div/button")).click();
    
    //driver.findElement(By.xpath("//div[@id='location-field-hotelName-menu']")).click();
    driver.findElement(By.id("d1-btn")).click();
    driver.findElement(By.xpath("//div[@id='Airport-transportation']/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[6]/button")).click();
    driver.findElement(By.xpath("//div[@id='Airport-transportation']/div/div[2]/div/div/div/div/div[2]/div/div[3]/button")).click();
    driver.findElement(By.xpath("//div[@id='Airport-transportation']/div/div[3]/div/select")).click();
    new Select(driver.findElement(By.xpath("//div[@id='Airport-transportation']/div/div[3]/div/select"))).selectByVisibleText("9:30 am");
   driver.findElement(By.xpath("//button[@type='submit']")).click();
   //driver.findElement(By.xpath("//div[@id='app-layer-base']/main/div/div[2]/div/section/div/section/div[2]/button")).click();
  }
}