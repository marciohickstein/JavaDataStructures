/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.datastructures;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author marcio
 */
public class NodeNGTest {
    
    public NodeNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Teste de método getData, da classe Node.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");

        Node<Integer> node1 = new Node<>(100);
        assertEquals(node1.getData().intValue(), 100);

        Node<Boolean> node2 = new Node<>(true);
        assertEquals(node2.getData().booleanValue(), true);

        Node<String> node3 = new Node<>("abc");
        assertEquals(node3.getData(), "abc");

        Node<Double> node5 = new Node<>(100.10);
        assertEquals(node5.getData(), 100.10);
    }

    /**
     * Teste de método setData, da classe Node.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        Integer dataOne = 100;
        Integer dataTwo = 100;
        Integer dataThree = 200;
        Node<Integer> nodeOne = new Node<>();
        Node<Integer> nodeTwo = new Node<>();
        Node<Integer> nodeThree = new Node<>();
        nodeOne.setData(dataOne);
        nodeTwo.setData(dataTwo);
        nodeThree.setData(dataThree);
        assertTrue(nodeOne.equals(nodeTwo), "Test 100 == 100");
        assertFalse(nodeOne.equals(nodeThree), "Test 100 != 200");
        assertFalse(nodeTwo.equals(nodeThree), "Test 100 != 200");
        assertNull(nodeTwo.getNext(), "Is null?!");
    }

    /**
     * Teste de método getNext, da classe Node.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        Node<String> node1 = new Node<>();
        Node<String> node2 = new Node<>();
        
        node1.setData("NODE_01");
        node2.setData("NODE_02");
        
        assertNull(node1.getNext(), "Test node 1 is NULL");

        node1.setNext(node2);
        assertNotNull(node1.getNext(), "Testing (node1.getNext() == 'not null') but return 'null' !");
    }

    /**
     * Teste de método setNext, da classe Node.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        Node<Integer> node = new Node<>(1);
        node.setNext(new Node<>(2));
        Integer value = (Integer)node.getNext().getData();
        assertEquals(value.intValue(), 2, "setNext with value 2 but doenst return the same!");
    }

    /**
     * Teste de método equals, da classe Node.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Node<Integer> node1 = new Node<>(100);
        Node<Integer> node2 = new Node<>(100);
        Node<String> node3 = new Node<>("abc");
        Node<String> node4 = new Node<>("abc");
        Node<Double> node5 = new Node<>(100.10);
        
        
        assertTrue(node1.equals(node2));
        assertFalse(node3.equals(node2));
        assertTrue(node3.equals(node4));
        assertFalse(node5.equals(node1));
        assertFalse(node1.equals(node5));
    }
    
}
