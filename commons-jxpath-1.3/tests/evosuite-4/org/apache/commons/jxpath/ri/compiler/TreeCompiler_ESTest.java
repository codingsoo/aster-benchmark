
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.TreeCompiler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TreeCompiler_ESTest extends TreeCompiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Step[] stepArray0 = new Step[6];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationEqual coreOperationEqual0 = (CoreOperationEqual)treeCompiler0.equal(locationPath0, stepArray0[4]);
      assertEquals("=", coreOperationEqual0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationUnion0;
      CoreOperationGreaterThan coreOperationGreaterThan0 = (CoreOperationGreaterThan)treeCompiler0.greaterThan(expressionArray0[3], expressionArray0[1]);
      assertEquals(">", coreOperationGreaterThan0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      Step step0 = new Step(1162, nodeTypeTest0, (Expression[]) null);
      Step step1 = new Step(91, nodeTypeTest0, (Expression[]) null);
      // Undeclared exception!
      try { 
        treeCompiler0.greaterThan(step0, step1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Constant constant0 = (Constant)treeCompiler0.number("793");
      assertFalse(constant0.computeContextDependent());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      CoreOperationNotEqual coreOperationNotEqual0 = (CoreOperationNotEqual)treeCompiler0.notEqual((Object) null, (Object) null);
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[8];
      ExtensionFunction extensionFunction0 = (ExtensionFunction)treeCompiler0.function((Object) null, objectArray0);
      assertTrue(extensionFunction0.computeContextDependent());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Step[] stepArray0 = new Step[8];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        treeCompiler0.variableReference(stepArray0[0]);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step$MockitoMock$842867028 cannot be cast to org.apache.commons.jxpath.ri.QName
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) treeCompiler0;
      // Undeclared exception!
      try { 
        treeCompiler0.union(objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[6];
      objectArray0[1] = (Object) "793";
      // Undeclared exception!
      try { 
        treeCompiler0.sum(objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) treeCompiler0;
      // Undeclared exception!
      try { 
        treeCompiler0.or(objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        treeCompiler0.number("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      QName qName0 = new QName(")kr'r", ")kr'r");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "o/I&,|VQ%l`-'.8%;_v");
      Step step0 = new Step((-979), nodeNameTest0, (Expression[]) null);
      // Undeclared exception!
      try { 
        treeCompiler0.nodeNameTest(step0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.QName
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Expression[] expressionArray0 = new Expression[3];
      Step[] stepArray0 = new Step[2];
      Object object0 = treeCompiler0.or(stepArray0);
      Object object1 = treeCompiler0.lessThanOrEqual(expressionArray0[0], object0);
      Object object2 = treeCompiler0.step(615, stepArray0[1], (Object[]) null);
      // Undeclared exception!
      try { 
        treeCompiler0.multiply(object2, object1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        treeCompiler0.mod(treeCompiler0, (Object) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      QName qName0 = new QName("Expression context [");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "name");
      Expression[] expressionArray0 = new Expression[9];
      Step step0 = new Step(45, nodeNameTest0, expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.minus((Object) step0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) treeCompiler0;
      // Undeclared exception!
      try { 
        treeCompiler0.locationPath(true, objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Step
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.and((Object[]) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      Expression[] expressionArray0 = new Expression[9];
      Step step0 = new Step(0, nodeTypeTest0, expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.lessThanOrEqual(object0, step0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[0];
      Object object0 = treeCompiler0.function((-388), objectArray0);
      Step step0 = new Step(2614, (NodeTest) null, (Expression[]) null);
      // Undeclared exception!
      try { 
        treeCompiler0.lessThan(object0, step0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.nodeTypeTest(36);
      // Undeclared exception!
      try { 
        treeCompiler0.greaterThanOrEqual((Object) null, object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.NodeTypeTest cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) treeCompiler0;
      // Undeclared exception!
      try { 
        treeCompiler0.function(0, objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Expression[] expressionArray0 = new Expression[2];
      Object object0 = treeCompiler0.variableReference((Object) null);
      Object[] objectArray0 = new Object[2];
      objectArray0[1] = (Object) treeCompiler0;
      // Undeclared exception!
      try { 
        treeCompiler0.expressionPath(object0, expressionArray0, objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Step
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Expression[] expressionArray0 = new Expression[9];
      Step[] stepArray0 = new Step[6];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      stepArray0[4] = step0;
      Object object0 = treeCompiler0.and(expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.equal(stepArray0[4], object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step$MockitoMock$842867028 cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) treeCompiler0;
      // Undeclared exception!
      try { 
        treeCompiler0.and(objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      QName qName0 = new QName("x+XV", "x+XV");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[1];
      Object object0 = treeCompiler0.locationPath(false, expressionArray0);
      Step step0 = new Step(1108, nodeNameTest0, expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.equal(object0, step0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      CoreOperationEqual coreOperationEqual0 = (CoreOperationEqual)treeCompiler0.equal((Object) null, (Object) null);
      assertEquals("=", coreOperationEqual0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      LocationPath locationPath0 = (LocationPath)treeCompiler0.locationPath(true, (Object[]) null);
      assertTrue(locationPath0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.sum((Object[]) null);
      CoreOperationMultiply coreOperationMultiply0 = (CoreOperationMultiply)treeCompiler0.multiply(object0, (Object) null);
      assertEquals("*", coreOperationMultiply0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.qname("(NLs^W9~3", (String) null);
      assertEquals("(NLs^W9~3:null", object0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(894);
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = new Step((-354), nodeTypeTest0, expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.function((Object) step0, (Object[]) expressionArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.QName
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      CoreOperationLessThan coreOperationLessThan0 = (CoreOperationLessThan)treeCompiler0.lessThan((Object) null, (Object) null);
      assertEquals("<", coreOperationLessThan0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      QName qName0 = new QName("", "");
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        treeCompiler0.step(13, qName0, objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to org.apache.commons.jxpath.ri.compiler.NodeTest
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      NodeNameTest nodeNameTest0 = (NodeNameTest)treeCompiler0.nodeNameTest((Object) null);
      assertNull(nodeNameTest0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[2];
      Object object0 = treeCompiler0.or(objectArray0);
      Object object1 = treeCompiler0.greaterThanOrEqual(object0, object0);
      CoreOperationNegate coreOperationNegate0 = (CoreOperationNegate)treeCompiler0.minus(object1);
      assertEquals("-", coreOperationNegate0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[0];
      LocationPath locationPath0 = (LocationPath)treeCompiler0.locationPath(true, objectArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = (CoreOperationGreaterThan)treeCompiler0.greaterThan(locationPath0, locationPath0);
      treeCompiler0.divide(coreOperationGreaterThan0, (Object) null);
      assertTrue(locationPath0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[0];
      Object object0 = treeCompiler0.and(objectArray0);
      CoreOperationSubtract coreOperationSubtract0 = (CoreOperationSubtract)treeCompiler0.minus(object0, object0);
      assertEquals("-", coreOperationSubtract0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.literal((String) null);
      CoreOperationMod coreOperationMod0 = (CoreOperationMod)treeCompiler0.mod((Object) null, object0);
      assertEquals("mod", coreOperationMod0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        treeCompiler0.number((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Expression[] expressionArray0 = new Expression[2];
      Object object0 = treeCompiler0.variableReference((Object) null);
      Object object1 = treeCompiler0.expressionPath(object0, expressionArray0, expressionArray0);
      assertNotNull(object1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.processingInstructionTest((String) null);
      // Undeclared exception!
      try { 
        treeCompiler0.notEqual((Object) null, object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.nodeTypeTest(0);
      // Undeclared exception!
      try { 
        treeCompiler0.minus((Object) null, object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.NodeTypeTest cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      QName qName0 = new QName("81dLB");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "81dLB");
      Step[] stepArray0 = new Step[3];
      // Undeclared exception!
      try { 
        treeCompiler0.divide(stepArray0[0], nodeNameTest0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.NodeNameTest cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[0];
      CoreOperationUnion coreOperationUnion0 = (CoreOperationUnion)treeCompiler0.union(objectArray0);
      assertEquals("|", coreOperationUnion0.getSymbol());
  }
}
