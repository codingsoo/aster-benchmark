
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
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Step_ESTest extends Step_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(3204, nodeTypeTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("UNKNOWN::UNKNOWN()", string0);
      assertEquals(3204, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(2, nodeNameTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2638));
      Step step0 = new Step(1, nodeTypeTest0, (Expression[]) null);
      step0.getPredicates();
      assertEquals(1, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(".");
      Expression[] expressionArray0 = new Expression[4];
      Step step0 = new Step(3201, processingInstructionTest0, expressionArray0);
      step0.getPredicates();
      assertEquals(3201, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2638));
      Step step0 = new Step(1, nodeTypeTest0, (Expression[]) null);
      step0.getNodeTest();
      assertEquals(1, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<GXV3zSf <[4>3Uj");
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(0, processingInstructionTest0, expressionArray0);
      int int0 = step0.getAxis();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName(".", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[6];
      Step step0 = new Step((-1178), nodeNameTest0, expressionArray0);
      int int0 = step0.getAxis();
      assertEquals((-1178), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan((Expression) null, (Expression) null);
      expressionArray0[0] = (Expression) coreOperationLessThan0;
      Step step0 = new Step(13, (NodeTest) null, expressionArray0);
      // Undeclared exception!
      try { 
        step0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationAnd0, coreOperationAnd0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationLessThan0, coreOperationAnd0);
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      Step step0 = new Step(6, processingInstructionTest0, expressionArray0);
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
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2638));
      Step step0 = new Step(1, nodeTypeTest0, (Expression[]) null);
      int int0 = step0.getAxis();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("descendant-or-self");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "dYSOh;?54RR");
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(13, nodeNameTest0, expressionArray0);
      step0.getPredicates();
      assertEquals(13, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = Step.axisToString((-1931));
      assertEquals("UNKNOWN", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(91);
      Step step0 = new Step(12, nodeTypeTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("preceding-sibling::UNKNOWN()[null][null]", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = Step.axisToString(11);
      assertEquals("following-sibling", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = Step.axisToString(10);
      assertEquals("ancestor-or-self", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = Step.axisToString(9);
      assertEquals("descendant", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = Step.axisToString(8);
      assertEquals("following", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = Step.axisToString(7);
      assertEquals("preceding", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = Step.axisToString(6);
      assertEquals("namespace", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = Step.axisToString(5);
      assertEquals("attribute", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = Step.axisToString(4);
      assertEquals("ancestor", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = Step.axisToString(2);
      assertEquals("child", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(13);
      Expression[] expressionArray0 = new Expression[9];
      Step step0 = new Step(13, nodeTypeTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("descendant-or-self::UNKNOWN()[null][null][null][null][null][null][null][null][null]", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Step[] stepArray0 = new Step[8];
      Step step0 = new Step(3, (NodeTest) null, expressionArray0);
      stepArray0[2] = step0;
      String string0 = stepArray0[2].toString();
      assertEquals("parent::null[null]", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Expression[] expressionArray0 = new Expression[9];
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals(".[null][null][null][null][null][null][null][null][null]", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("\"");
      Step step0 = new Step(1, processingInstructionTest0, (Expression[]) null);
      String string0 = step0.toString();
      assertEquals("self::processing-instruction('\"')", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(93);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("self::UNKNOWN()", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2638));
      Step step0 = new Step(5, nodeTypeTest0, (Expression[]) null);
      String string0 = step0.toString();
      assertEquals("@UNKNOWN()", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(30);
      Step step0 = new Step(3, nodeTypeTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("parent::UNKNOWN()[null]", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("49.5UnsZ8/X");
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("49.5UnsZ8/X", "");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      Step step0 = new Step((-7), processingInstructionTest0, expressionArray0);
      boolean boolean0 = step0.isContextDependent();
      assertEquals((-7), step0.getAxis());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QName qName0 = new QName("", "2>.{M");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "2>.{M");
      Expression[] expressionArray0 = new Expression[4];
      Short short0 = new Short((short)3);
      Constant constant0 = new Constant(short0);
      expressionArray0[0] = (Expression) constant0;
      Step step0 = new Step(7, nodeNameTest0, expressionArray0);
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
  public void test35()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(2, (NodeTest) null, expressionArray0);
      boolean boolean0 = step0.isContextDependent();
      assertFalse(boolean0);
      assertEquals(2, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2638));
      Step step0 = new Step(1, nodeTypeTest0, (Expression[]) null);
      boolean boolean0 = step0.isContextDependent();
      assertEquals(1, step0.getAxis());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(2, (NodeTest) null, expressionArray0);
      step0.getNodeTest();
      assertEquals(2, step0.getAxis());
  }
}
