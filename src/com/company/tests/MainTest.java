package com.company.tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import com.company.console.Main;

public class MainTest {

    @Test
    public void solution1() {
        int actual  = Main.solution(new int[]{100, 1, 2, 3, 4, 5}, 4);
        assertEquals(1, actual);
    }

    @Test
    public void solution2() {
        int actual  = Main.solution(new int[]{1, 2, 3, 10, 6, 0}, 5);
        assertEquals(4, actual);
    }

    @Test
    public void solution3() {
        int actual  = Main.solution(new int[]{1, 2, 100, 4, 0}, 4);
        assertEquals(3, actual);
    }

    @Test
    public void solution4() {
        int actual  = Main.solution(new int[]{1, 2, 4, 5, -3, 7, -4, 9}, 2);
        assertEquals(6, actual);
    }

    @Test
    public void solution5() {
        int actual  = Main.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, -5, 12, 15, 93, -2}, 4);
        assertEquals(9, actual);
    }

    @Test
    public void solution6() {
        int actual  = Main.solution(new int[]{-1, 4, 5, 6, -2, 31, 7, 0, 30}, 2);
        assertEquals(4, actual);
    }

    @Test
    public void solution7() {
        int actual  = Main.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, -5, 12, 15, 93, -2}, 12);
        assertEquals(-1, actual);
    }

    @Test
    public void solution8() {
        int actual  = Main.solution(new int[]{10, -2, 6, 4}, 1);
        assertEquals(-1, actual);
    }

    @Test
    public void solution9() {
        int actual  = Main.solution(new int[]{-1, 15, 4, 6, -2, 31, -14, 0, 30}, 8);
        assertEquals(6, actual);
    }

    @Test
    public void solution10() {
        int actual  = Main.solution(new int[]{-3, 2, -5, 6, 8, 4, 1, 15, -2, 3, -4}, 3);
        assertEquals(6, actual);
    }
}