/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;

/**
 *
 * @author brave
 */
public class ThingsToDo extends BaseTest {
    
   @Test

    public void testThingstodo() throws Exception {

    driver.get("https://www.orbitz.com/");

    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Packages'])[2]/following::*[name()='svg'][1]")).click();

    driver.findElement(By.xpath("//div[@id='location-field-location-menu']/div/button")).click();

    driver.findElement(By.id("location-field-location")).clear();

    driver.findElement(By.id("location-field-location")).sendKeys("new york");

    driver.findElement(By.xpath("//div[@id='location-field-location-menu']/div[2]/ul/li/button/div/div[2]")).click();

    driver.findElement(By.id("d1-btn")).click();

    Thread.sleep(1000);

    driver.findElement(By.xpath("//form[@id='wizard-lx-pwa-1']/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[4]/button")).click();

    Thread.sleep(500);

    driver.findElement(By.xpath("//form[@id='wizard-lx-pwa-1']/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[7]/button")).click();

    Thread.sleep(500);

    driver.findElement(By.xpath("//form[@id='wizard-lx-pwa-1']/div/div[2]/div/div/div/div/div[2]/div/div[3]/button")).click();

    Thread.sleep(500);

    driver.findElement(By.xpath("//button[@type='submit']")).click();

     }
}
     