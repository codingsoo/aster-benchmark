
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
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.TreeCompiler;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TreeCompiler_ESTest extends TreeCompiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[2];
      Object[] objectArray1 = new Object[0];
      Object object0 = treeCompiler0.expressionPath((Object) null, objectArray0, objectArray1);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.literal("");
      Object object1 = treeCompiler0.and((Object[]) null);
      Object object2 = treeCompiler0.lessThan(object1, object0);
      CoreOperationNotEqual coreOperationNotEqual0 = (CoreOperationNotEqual)treeCompiler0.notEqual(object2, object0);
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.greaterThan((Object) null, (Object) null);
      CoreOperationMod coreOperationMod0 = (CoreOperationMod)treeCompiler0.mod((Object) null, object0);
      assertEquals("mod", coreOperationMod0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        treeCompiler0.multiply((Object) null, "+y}.\u0007z+! QuH");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.qname("Q16)9[d<RxqH", "");
      assertEquals("Q16)9[d<RxqH:", object0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      VariableReference variableReference0 = (VariableReference)treeCompiler0.variableReference((Object) null);
      assertFalse(variableReference0.isContextDependent());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[9];
      Object object0 = treeCompiler0.processingInstructionTest("10?Ut&!+y,4szq_R-");
      Step step0 = (Step)treeCompiler0.step((-6331), object0, objectArray0);
      assertEquals((-6331), step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      NodeNameTest nodeNameTest0 = (NodeNameTest)treeCompiler0.nodeNameTest((Object) null);
      assertNull(nodeNameTest0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[8];
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
  public void test09()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) treeCompiler0;
      // Undeclared exception!
      try { 
        treeCompiler0.sum(objectArray0);
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
      Object[] objectArray0 = new Object[2];
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
  public void test11()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        treeCompiler0.number("M)z4<:\"9?zN7BEJ");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        treeCompiler0.notEqual(object0, object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.and((Object[]) null);
      // Undeclared exception!
      try { 
        treeCompiler0.mod("", object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = new Object();
      Object[] objectArray0 = new Object[6];
      Object object1 = treeCompiler0.function((Object) null, objectArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.minus(object0, object1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        treeCompiler0.minus((Object) "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      Expression[] expressionArray0 = new Expression[0];
      Object object0 = treeCompiler0.sum(expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.lessThanOrEqual(object0, nodeTypeTest0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.NodeTypeTest cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.nodeTypeTest((-915));
      // Undeclared exception!
      try { 
        treeCompiler0.lessThan(object0, (Object) null);
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
      Step[] stepArray0 = new Step[9];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      stepArray0[8] = step0;
      // Undeclared exception!
      try { 
        treeCompiler0.greaterThanOrEqual((Object) null, stepArray0[8]);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step$MockitoMock$1905917989 cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.number("5");
      Object[] objectArray0 = new Object[0];
      Object object1 = treeCompiler0.expressionPath(object0, objectArray0, objectArray0);
      QName qName0 = new QName("5", "5");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step((-4438), nodeNameTest0, expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.greaterThan(object1, step0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[1];
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
  public void test22()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) treeCompiler0;
      // Undeclared exception!
      try { 
        treeCompiler0.expressionPath((Object) null, objectArray0, objectArray0);
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
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperation");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.compiler.CoreOperation");
      Expression[] expressionArray0 = new Expression[7];
      Step step0 = new Step(0, nodeNameTest0, expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.equal(step0, step0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Expression[] expressionArray0 = new Expression[3];
      Step step0 = new Step(0, (NodeTest) null, expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.divide(treeCompiler0, step0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[4];
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
  public void test26()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[1];
      Object object0 = treeCompiler0.locationPath(true, objectArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.equal(object0, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[0];
      LocationPath locationPath0 = (LocationPath)treeCompiler0.locationPath(false, objectArray0);
      treeCompiler0.equal(locationPath0, locationPath0);
      assertFalse(locationPath0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = (CoreOperationLessThanOrEqual)treeCompiler0.lessThanOrEqual((Object) null, (Object) null);
      assertEquals("<=", coreOperationLessThanOrEqual0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.mod((Object) null, (Object) null);
      CoreOperationEqual coreOperationEqual0 = (CoreOperationEqual)treeCompiler0.equal((Object) null, object0);
      assertEquals("=", coreOperationEqual0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      LocationPath locationPath0 = (LocationPath)treeCompiler0.locationPath(true, (Object[]) null);
      assertTrue(locationPath0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[16];
      // Undeclared exception!
      try { 
        treeCompiler0.step((-2835), "10?Ut&!+y,4szq_R-", objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.commons.jxpath.ri.compiler.NodeTest
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        treeCompiler0.nodeNameTest(treeCompiler0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.QName
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.lessThan((Object) null, (Object) null);
      CoreOperationNegate coreOperationNegate0 = (CoreOperationNegate)treeCompiler0.minus(object0);
      assertEquals("-", coreOperationNegate0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[16];
      CoreFunction coreFunction0 = (CoreFunction)treeCompiler0.function(14, objectArray0);
      treeCompiler0.minus((Object) null, (Object) coreFunction0);
      assertEquals(14, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[6];
      CoreFunction coreFunction0 = (CoreFunction)treeCompiler0.function(0, objectArray0);
      treeCompiler0.greaterThanOrEqual(coreFunction0, coreFunction0);
      assertEquals(0, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.literal((String) null);
      Object object1 = treeCompiler0.greaterThan(object0, object0);
      // Undeclared exception!
      try { 
        treeCompiler0.function(object1, (Object[]) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan cannot be cast to org.apache.commons.jxpath.ri.QName
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.and((Object[]) null);
      CoreOperationMultiply coreOperationMultiply0 = (CoreOperationMultiply)treeCompiler0.multiply(object0, object0);
      assertEquals("*", coreOperationMultiply0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        treeCompiler0.number((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[8];
      Object object0 = treeCompiler0.or(objectArray0);
      Object object1 = treeCompiler0.expressionPath(object0, objectArray0, objectArray0);
      assertNotNull(object1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        treeCompiler0.variableReference(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.jxpath.ri.QName
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[0];
      Object object0 = treeCompiler0.union(objectArray0);
      Object object1 = treeCompiler0.sum(objectArray0);
      CoreOperationDivide coreOperationDivide0 = (CoreOperationDivide)treeCompiler0.divide(object0, object1);
      assertEquals("div", coreOperationDivide0.getSymbol());
  }
}
