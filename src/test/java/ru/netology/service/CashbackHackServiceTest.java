package ru.netology.service;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {


    @org.junit.Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldReturn999IfAmountIs1001() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldReturn1IfAmountIs999() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(expected, actual);

    }


    @Test
    public void shouldReturn0IfAmountIs1000_API() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturn999IfAmountIs1001_API() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturn1IfAmountIs999_API() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(expected, actual);

    }
}