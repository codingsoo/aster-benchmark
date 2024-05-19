
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
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreFunction_ESTest extends CoreFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction((-1278), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionConcat((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(1858, (Expression[]) null);
      QName qName0 = new QName((String) null, (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeNameTest0, true);
      AncestorContext ancestorContext0 = new AncestorContext(precedingOrFollowingContext0, true, nodeNameTest0);
      coreFunction0.functionPosition(ancestorContext0);
      assertEquals(1858, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Long long0 = new Long(0);
      Constant constant0 = new Constant(long0);
      expressionArray0[0] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      Object object0 = coreFunction0.functionNumber(nodeSetContext0);
      assertEquals(0L, object0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-985), (Expression[]) null);
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "JXPath: found  ");
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      coreFunction0.functionStringLength(parentContext0);
      assertEquals((-985), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(650, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionStringLength((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) coreFunction0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(",", ",");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        coreFunction0.functionString(initialContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNumber(nodeSetContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(906, expressionArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(906);
      ChildContext childContext0 = new ChildContext(nodeSetContext0, nodeTypeTest0, false, false);
      // Undeclared exception!
      try { 
        coreFunction0.functionName(childContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-1), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLocalName((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-2375), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionID((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionContains((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-1), (Expression[]) null);
      String string0 = coreFunction0.getFunctionName();
      assertEquals("unknownFunction-1()", string0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      int int0 = coreFunction0.getFunctionCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction((-1416), expressionArray0);
      int int0 = coreFunction0.getFunctionCode();
      assertEquals((-1416), int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(589, expressionArray0);
      coreFunction0.getArg3();
      assertEquals(589, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Constant constant0 = new Constant((Number) null);
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(locationPath0, constant0);
      expressionArray0[2] = (Expression) coreOperationMod0;
      CoreFunction coreFunction0 = new CoreFunction(7, expressionArray0);
      Expression expression0 = coreFunction0.getArg3();
      assertEquals(7, coreFunction0.getFunctionCode());
      assertNotNull(expression0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(2816, expressionArray0);
      coreFunction0.getArg2();
      assertEquals(2816, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(expressionArray0[0], expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationLessThan0;
      CoreFunction coreFunction0 = new CoreFunction(2816, expressionArray0);
      Expression expression0 = coreFunction0.getArg2();
      assertNotNull(expression0);
      assertEquals(2816, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreFunction coreFunction0 = new CoreFunction(5, expressionArray0);
      coreFunction0.getArg1();
      assertEquals(5, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("lS@^ab0nnu\"v\"#+", "lS@^ab0nnu\"v\"#+");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(variableReference0, variableReference0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationSubtract0, variableReference0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(nameAttributeTest0, coreOperationSubtract0);
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      CoreFunction coreFunction0 = new CoreFunction((-2512), expressionArray0);
      coreFunction0.getArg1();
      assertEquals((-2512), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(1702, (Expression[]) null);
      coreFunction0.functionNull((EvalContext) null);
      assertEquals(1702, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Step[] stepArray0 = new Step[7];
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[1], expressionArray0, stepArray0);
      expressionArray0[3] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction((-1781), expressionArray0);
      // Undeclared exception!
      coreFunction0.toString();
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[2] = (Expression) coreOperationUnion0;
      CoreFunction coreFunction0 = new CoreFunction((-1781), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(3027, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.getArg3();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(245, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.getArg2();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.getArg1();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      QName qName0 = new QName("{object of type ");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(638, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionTrue(namespaceContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction638()(null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[5];
      QName qName0 = new QName("string");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(29, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      expressionArray0[1] = (Expression) locationPath0;
      CoreFunction coreFunction0 = new CoreFunction(29, expressionArray0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, (NodeTest) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionTrue(namespaceContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-2198), (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionTranslate((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-2198()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual((Expression) null, expressionArray0[2]);
      expressionArray0[6] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreFunction coreFunction0 = new CoreFunction((-556), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionTranslate((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual((Expression) null, (Expression) null);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      CoreFunction coreFunction0 = new CoreFunction(3388, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSum((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationAdd0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(expressionArray0[0], coreOperationAdd0);
      expressionArray0[1] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(expressionArray0[1], coreOperationAdd0);
      expressionArray0[2] = (Expression) coreOperationMultiply0;
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationAdd0, coreOperationGreaterThanOrEqual0);
      expressionArray0[3] = (Expression) coreOperationEqual0;
      QName qName0 = new QName("Cannot set property ", "");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[4] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(234, expressionArray0);
      Step[] stepArray0 = new Step[5];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(3);
      Step step0 = new Step(13, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = stepArray0[0];
      stepArray0[4] = stepArray0[3];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, expressionArray0, stepArray0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeTypeTest0);
      EvalContext evalContext0 = expressionPath0.evalSteps(parentContext0);
      SelfContext selfContext0 = new SelfContext(evalContext0, nodeTypeTest0);
      // Undeclared exception!
      coreFunction0.functionSubstringBefore(selfContext0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(2, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstringBefore((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: position(null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      QName qName0 = new QName("Incorrect number of arguments: ");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[2] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(13, expressionArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(",PD[");
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, processingInstructionTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(descendantContext0, processingInstructionTest0, true);
      ParentContext parentContext0 = new ParentContext(precedingOrFollowingContext0, processingInstructionTest0);
      // Undeclared exception!
      coreFunction0.functionSubstringAfter(parentContext0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationAdd0;
      CoreFunction coreFunction0 = new CoreFunction(178, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstring((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(6, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionString((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      Step[] stepArray0 = new Step[3];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("X2t7mcP&4");
      Step step0 = new Step(14, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      expressionArray0[0] = (Expression) locationPath0;
      CoreFunction coreFunction0 = new CoreFunction(119, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionStartsWith((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationAnd0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationAnd0);
      expressionArray0[1] = (Expression) coreOperationNegate0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[2] = (Expression) coreOperationAdd0;
      Step[] stepArray0 = new Step[4];
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[2], expressionArray0, stepArray0);
      expressionArray0[3] = (Expression) expressionPath0;
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(expressionPath0, coreOperationAdd0);
      expressionArray0[4] = (Expression) coreOperationDivide0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      // Undeclared exception!
      coreFunction0.functionNumber(rootContext0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNull((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction0()(null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual((Expression) null, (Expression) null);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNull((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(expressionArray0[0], expressionArray0[0]);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual((Expression) null, coreOperationSubtract0);
      expressionArray0[5] = (Expression) coreOperationEqual0;
      CoreFunction coreFunction0 = new CoreFunction((-2756), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNot((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationUnion0;
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(expressionArray0[0], expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationLessThanOrEqual0;
      CoreFunction coreFunction0 = new CoreFunction((-585), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNormalizeSpace((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-585()(org.apache.commons.jxpath.ri.compiler.CoreOperationUnion@0000000001 | (org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual@0000000002), org.apache.commons.jxpath.ri.compiler.CoreOperationUnion@0000000001 <= org.apache.commons.jxpath.ri.compiler.CoreOperationUnion@0000000001)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      QName qName0 = new QName("", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreFunction coreFunction0 = new CoreFunction(161, expressionArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, false);
      AttributeContext attributeContext0 = new AttributeContext(precedingOrFollowingContext0, processingInstructionTest0);
      PredicateContext predicateContext0 = new PredicateContext(attributeContext0, variableReference0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNormalizeSpace(predicateContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      QName qName0 = new QName("']");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction((-305), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNamespaceURI((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(5613, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNamespaceURI((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction((-615), expressionArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(18);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLocalName(namespaceContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction((-618), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLast((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-618()(null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction((-545), expressionArray0);
      QName qName0 = new QName("y8qO6Z", "unknownFunction");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLast(selfContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SelfContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(41, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionLang((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction41()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("?i/");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(36, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLang((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan((Expression) null, (Expression) null);
      expressionArray0[0] = (Expression) coreOperationLessThan0;
      CoreFunction coreFunction0 = new CoreFunction((-796), expressionArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(", ");
      ParentContext parentContext0 = new ParentContext((EvalContext) null, processingInstructionTest0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(parentContext0, basicNodeSet0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLang(nodeSetContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(5250, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionKey((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction5250()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan((Expression) null, (Expression) null);
      Expression[] expressionArray0 = new Expression[5];
      expressionArray0[0] = (Expression) coreOperationLessThan0;
      CoreFunction coreFunction0 = new CoreFunction(9, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionKey((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      QName qName0 = new QName("number", "substring-after");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[7] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(9, expressionArray0);
      EvalContext[] evalContextArray0 = new EvalContext[1];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      // Undeclared exception!
      coreFunction0.functionID(unionContext0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("2um>;5<.");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      CoreFunction coreFunction0 = new CoreFunction((-2233), expressionArray0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionID(attributeContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction((-100), expressionArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NamespaceContext namespaceContext0 = new NamespaceContext(nodeSetContext0, (NodeTest) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionFloor(namespaceContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-100()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(3, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionFloor((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(4085, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionFalse((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction4085()(null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationAnd0;
      CoreFunction coreFunction0 = new CoreFunction(10, expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, expressionArray0[0]);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("|sW4 g] ,$^l}{{#N");
      SelfContext selfContext0 = new SelfContext(predicateContext0, processingInstructionTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionFalse(selfContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(3, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionCount((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(13, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionContains((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: substring-after()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("n/}Fs:0C:{\"d", "!f/j>");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(414, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionContains((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("$i~", "$i~");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[3] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction((-2028), expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, expressionArray0[2]);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      NamespaceContext namespaceContext0 = new NamespaceContext(predicateContext0, nodeTypeTest0);
      // Undeclared exception!
      coreFunction0.functionBoolean(namespaceContext0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan((Expression) null, (Expression) null);
      Expression[] expressionArray0 = new Expression[5];
      expressionArray0[0] = (Expression) coreOperationLessThan0;
      CoreFunction coreFunction0 = new CoreFunction(9, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionBoolean((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(22, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, (Step[]) null);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(expressionPath0, coreOperationAnd0);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      CoreFunction coreFunction0 = new CoreFunction(3, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeContextDependent();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction(2, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(6, expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) coreFunction0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.setValue("8O,$D)A6=HV\"Vrs=U$", (Expression) coreFunction0, (Object) "sDuL$AY_(FKD");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath 8O,$D)A6=HV\"Vrs=U$; Cannot set value for xpath: 8O,$D)A6=HV\"Vrs=U$
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction((-1781), expressionArray0);
      String string0 = coreFunction0.toString();
      assertEquals("unknownFunction-1781()(null, null, null, null)", string0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-472), (Expression[]) null);
      String string0 = coreFunction0.toString();
      assertEquals("unknownFunction-472()()", string0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      coreFunction0.getArgumentCount();
      assertEquals(1, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(10, (Expression[]) null);
      coreFunction0.getArgumentCount();
      assertEquals(10, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(28, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionNumber((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      Constant constant0 = new Constant((String) null);
      expressionArray0[0] = (Expression) constant0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationNegate0;
      expressionArray0[2] = (Expression) coreOperationNegate0;
      CoreFunction coreFunction0 = new CoreFunction(2636, expressionArray0);
      Object object0 = coreFunction0.functionTranslate((EvalContext) null);
      assertEquals(2636, coreFunction0.getFunctionCode());
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(178, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionStringLength((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction178()(null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      Constant constant0 = new Constant((String) null);
      expressionArray0[0] = (Expression) constant0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(expressionArray0[0]);
      Expression[] expressionArray1 = new Expression[5];
      expressionArray1[0] = (Expression) coreOperationNegate0;
      expressionArray1[1] = (Expression) coreOperationNegate0;
      expressionArray1[2] = (Expression) constant0;
      expressionArray1[3] = (Expression) coreOperationNegate0;
      expressionArray1[4] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction((-1278), expressionArray1);
      Object object0 = coreFunction0.functionConcat((EvalContext) null);
      assertEquals("000", object0);
      assertEquals((-1278), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction((-2471), expressionArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2471));
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionConcat(attributeContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-2471()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(10, (Expression[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("@*X3}/jm)hIC");
      ParentContext parentContext0 = new ParentContext((EvalContext) null, processingInstructionTest0);
      SelfContext selfContext0 = new SelfContext(parentContext0, processingInstructionTest0);
      coreFunction0.functionString(selfContext0);
      assertEquals(10, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction((-1736), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionString((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-1736()(null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionName((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[10];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLocalName((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction0()(null, null, null, null, null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Float float0 = new Float((double) 1315);
      Constant constant0 = new Constant(float0);
      expressionArray0[0] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction(1315, expressionArray0);
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName((String) null, (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = stepArray0[0];
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[0], expressionArray0, stepArray0);
      EvalContext evalContext0 = expressionPath0.evalSteps((EvalContext) null);
      coreFunction0.functionNamespaceURI(evalContext0);
      assertEquals(1315, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreFunction coreFunction0 = new CoreFunction((-305), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNamespaceURI((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-305()(null, null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(2814, (Expression[]) null);
      EvalContext[] evalContextArray0 = new EvalContext[5];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeSet nodeSet0 = unionContext0.getNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, nodeSet0);
      Object object0 = coreFunction0.functionLast(nodeSetContext0);
      assertEquals(1, nodeSetContext0.getPosition());
      assertEquals(0.0, object0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreFunction coreFunction0 = new CoreFunction((-556), expressionArray0);
      coreFunction0.computeValue((EvalContext) null);
      assertEquals((-556), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(5, expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) coreFunction0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.removePath("", (Expression) coreFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath ; Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(2, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.iteratePointers((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(1, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.compute((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(1045, (Expression[]) null);
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertFalse(boolean0);
      assertEquals(1045, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(18, expressionArray0);
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(6, expressionArray0);
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(5, expressionArray0);
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(1, (Expression[]) null);
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("?i/");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(36, expressionArray0);
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertEquals(36, coreFunction0.getFunctionCode());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(29, expressionArray0);
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertFalse(boolean0);
      assertEquals(29, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(30, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstring((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: format-number()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(29, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSum((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: key()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(28, (Expression[]) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(jXPathContextReferenceImpl0).getLocale();
      doReturn((NamespaceResolver) null, (NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.JAPAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, jXPathContextReferenceImpl0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContext0, qName0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl1.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        coreFunction0.functionRound(evalContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction28()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction(27, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.compute((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: round(null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(22, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: lang()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(20, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNot((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: true()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(17, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: translate()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreFunction coreFunction0 = new CoreFunction(13, expressionArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(",PD[");
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, processingInstructionTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(descendantContext0, processingInstructionTest0, true);
      ParentContext parentContext0 = new ParentContext(precedingOrFollowingContext0, processingInstructionTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstringAfter(parentContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: substring-after(null, null, null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(12, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionCount((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: substring-before()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(10, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.compute((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: starts-with()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreFunction coreFunction0 = new CoreFunction(9, expressionArray0);
      EvalContext[] evalContextArray0 = new EvalContext[1];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionID(unionContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: concat(null, null, null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(8, expressionArray0);
      QName qName0 = new QName("ZzD3");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeNameTest0, false, true);
      // Undeclared exception!
      try { 
        coreFunction0.functionPosition(childContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: string(null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction(7, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNot((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: name(null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(6, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionCeiling((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: namespace-uri()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(5, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionStartsWith((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: local-name()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(3, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: count()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionBoolean((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: last(null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(29, expressionArray0);
      coreFunction0.functionTrue((EvalContext) null);
      assertEquals(29, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.getArg1();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.getArg2();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.getArg3();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionPosition((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(18, expressionArray0);
      UnionContext unionContext0 = new UnionContext((EvalContext) null, (EvalContext[]) null);
      DescendantContext descendantContext0 = new DescendantContext(unionContext0, true, (NodeTest) null);
      coreFunction0.functionFalse(descendantContext0);
      assertEquals(18, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(18, expressionArray0);
      int int0 = coreFunction0.getFunctionCode();
      assertEquals(18, int0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(28, (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      
      coreFunction0.compute((EvalContext) null);
      assertEquals(28, coreFunction0.getFunctionCode());
  }
}
