package com.example;

import org.junit.Assert;

import org.junit.Test;

public class CalculadoraTeste {
    @Test
    public void deveSomarDoisValores() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(1, 2);
        Assert.assertTrue(resultado == 3);
    }

    @Test
    public void deveSubtrairDoisValores() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtrair(2, 2);
        Assert.assertTrue(resultado == 0);
    }

    @Test
    public void deveMultiplicarDoisValores() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(2, 2);
        Assert.assertTrue(resultado == 4);
    }

    @Test
    public void deveDividirDoisValores() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dividir(4, 2);
        Assert.assertTrue(resultado == 2);
    }

    @Test
    public void deveLancarExcecaoAoDividirPorZero() {
        Calculadora calculadora = new Calculadora();
        try {
            calculadora.dividir(4, 0);
            Assert.fail("Deveria ter lançado uma exceção");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
        }
    }
}
