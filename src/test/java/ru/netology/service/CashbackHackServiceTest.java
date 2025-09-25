package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100IfAmount900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn999IfAmount1() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfAmount0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 0;
        assertEquals(expected, actual);
    }
}