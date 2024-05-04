package ru.netology.service;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void test900() {
        CashbackHackService service = new CashbackHackService();
        org.junit.Assert.assertEquals(service.remain(900), 100);

    }
    @org.junit.Test
    public void test999() {
        CashbackHackService service = new CashbackHackService();
        org.junit.Assert.assertEquals(service.remain(999), 1);

    }
    @org.junit.Test
    public void test1000() {
        CashbackHackService service = new CashbackHackService();
        org.junit.Assert.assertEquals(service.remain(1000), 0);

    }
    @org.junit.Test
    public void test0() {
        CashbackHackService service = new CashbackHackService();
        org.junit.Assert.assertEquals(service.remain(0), 1000);

    }
    @org.junit.Test
    public void test500() {
        CashbackHackService service = new CashbackHackService();
        org.junit.Assert.assertEquals(service.remain(500), 500);

    }
    @org.junit.Test
    public void test1001() {
        CashbackHackService service = new CashbackHackService();
        org.junit.Assert.assertEquals(service.remain(1001), 999);

    }
}