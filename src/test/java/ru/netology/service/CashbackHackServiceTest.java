package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void test900() {
        CashbackHackService service = new CashbackHackService();
        org.testng.Assert.assertEquals(service.remain(900), 100);

    }
    @org.testng.annotations.Test
    public void test999() {
        CashbackHackService service = new CashbackHackService();
        org.testng.Assert.assertEquals(service.remain(999), 1);

    }
    @org.testng.annotations.Test
    public void test1000() {
        CashbackHackService service = new CashbackHackService();
        org.testng.Assert.assertEquals(service.remain(1000), 0);

    }
    @org.testng.annotations.Test
    public void test0() {
        CashbackHackService service = new CashbackHackService();
        org.testng.Assert.assertEquals(service.remain(0), 1000);

    }
    @org.testng.annotations.Test
    public void test500() {
        CashbackHackService service = new CashbackHackService();
        org.testng.Assert.assertEquals(service.remain(500), 500);

    }
    @org.testng.annotations.Test
    public void test1001() {
        CashbackHackService service = new CashbackHackService();
        org.testng.Assert.assertEquals(service.remain(1001), 999);

    }
}