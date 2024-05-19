
/*
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */


package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Step_ESTest extends Step_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1206));
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(2527, nodeTypeTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("UNKNOWN::UNKNOWN()", string0);
      assertEquals(2527, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("3WEb", "/");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step((-464), nodeNameTest0, (Expression[]) null);
      step0.getPredicates();
      assertEquals((-464), step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-3211));
      Expression[] expressionArray0 = new Expression[8];
      Step step0 = new Step((-3211), nodeTypeTest0, expressionArray0);
      step0.getPredicates();
      assertEquals((-3211), step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step((-707), (NodeTest) null, expressionArray0);
      step0.getNodeTest();
      assertEquals((-707), step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Expression[] expressionArray0 = new Expression[5];
      Step step0 = new Step(0, processingInstructionTest0, expressionArray0);
      int int0 = step0.getAxis();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step((-707), (NodeTest) null, expressionArray0);
      int int0 = step0.getAxis();
      assertEquals((-707), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(20);
      Expression[] expressionArray0 = new Expression[4];
      QName qName0 = new QName("b?tscK", "Cannot remove an object that is not some other object's property or a collection element");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      Step[] stepArray0 = new Step[6];
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        stepArray0[0].toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("", "preceding");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, " reported success creating object for path: ");
      Expression[] expressionArray0 = new Expression[7];
      CoreFunction coreFunction0 = new CoreFunction(6, expressionArray0);
      expressionArray0[0] = (Expression) coreFunction0;
      Step step0 = new Step(7, nodeNameTest0, expressionArray0);
      // Undeclared exception!
      try { 
        step0.isContextDependent();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = Step.axisToString(9);
      assertEquals("descendant", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = Step.axisToString(3);
      assertEquals("parent", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = Step.axisToString(1);
      assertEquals("self", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = Step.axisToString(13);
      assertEquals("descendant-or-self", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = Step.axisToString(12);
      assertEquals("preceding-sibling", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(3, (NodeTest) null, expressionArray0);
      int int0 = step0.getAxis();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(3, (NodeTest) null, expressionArray0);
      step0.getPredicates();
      assertEquals(3, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = Step.axisToString((-1046));
      assertEquals("UNKNOWN", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = Step.axisToString(11);
      assertEquals("following-sibling", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = Step.axisToString(10);
      assertEquals("ancestor-or-self", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = Step.axisToString(8);
      assertEquals("following", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = Step.axisToString(7);
      assertEquals("preceding", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = Step.axisToString(6);
      assertEquals("namespace", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = Step.axisToString(5);
      assertEquals("attribute", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = Step.axisToString(4);
      assertEquals("ancestor", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = Step.axisToString(2);
      assertEquals("child", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "<=");
      Step step0 = new Step(13, nodeNameTest0, (Expression[]) null);
      // Undeclared exception!
      try { 
        step0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.NodeNameTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(13);
      Step step0 = new Step(13, nodeTypeTest0, (Expression[]) null);
      String string0 = step0.toString();
      assertEquals("descendant-or-self::UNKNOWN()", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(3);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(3, nodeTypeTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("parent::comment()", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals(".", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("a'N", "a'N");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(1, nodeNameTest0, (Expression[]) null);
      String string0 = step0.toString();
      assertEquals("self::a'N:a'N", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName("UNKNOWN", "namespace");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[5];
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("@UNKNOWN:namespace[null][null][null][null][null]", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      Expression[] expressionArray0 = new Expression[8];
      Step step0 = new Step(2, nodeTypeTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("text()[null][null][null][null][null][null][null][null]", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(20);
      Expression[] expressionArray0 = new Expression[4];
      QName qName0 = new QName("b?tscK", "Cannot remove an object that is not some other object's property or a collection element");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      boolean boolean0 = step0.isContextDependent();
      assertEquals(1, step0.getAxis());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      QName qName0 = new QName("rC/t>5j+k/tD?D");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      Step step0 = new Step(64, (NodeTest) null, expressionArray0);
      // Undeclared exception!
      try { 
        step0.isContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Step", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      boolean boolean0 = step0.isContextDependent();
      assertEquals(1, step0.getAxis());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QName qName0 = new QName("D=;#");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "D=;#");
      Step step0 = new Step(4356, nodeNameTest0, (Expression[]) null);
      boolean boolean0 = step0.isContextDependent();
      assertEquals(4356, step0.getAxis());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      step0.getNodeTest();
      assertEquals(1, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(3, (NodeTest) null, expressionArray0);
      String string0 = step0.toString();
      assertEquals("parent::null", string0);
  }
}
