
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


package org.apache.commons.jxpath.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.net.URL;
import java.util.Enumeration;
import org.apache.commons.jxpath.xml.DOMParser;
import org.apache.commons.jxpath.xml.DocumentContainer;
import org.apache.commons.jxpath.xml.JDOMParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class XMLParser2_ESTest extends XMLParser2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDOMParser jDOMParser0 = new JDOMParser();
      jDOMParser0.setNamespaceAware(true);
      assertFalse(jDOMParser0.isCoalescing());
      assertTrue(jDOMParser0.isExpandEntityReferences());
      assertFalse(jDOMParser0.isIgnoringElementContentWhitespace());
      assertTrue(jDOMParser0.isNamespaceAware());
      assertFalse(jDOMParser0.isIgnoringComments());
      assertFalse(jDOMParser0.isValidating());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("\"wk39RY@!X", "");
      URL uRL0 = mockFile0.toURL();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "LfyC+)w4[c:6s;J{W");
      assertFalse(documentContainer0.isValidating());
      
      documentContainer0.setValidating(true);
      boolean boolean0 = documentContainer0.isValidating();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDOMParser jDOMParser0 = new JDOMParser();
      boolean boolean0 = jDOMParser0.isValidating();
      assertTrue(jDOMParser0.isExpandEntityReferences());
      assertFalse(boolean0);
      assertTrue(jDOMParser0.isNamespaceAware());
      assertFalse(jDOMParser0.isIgnoringElementContentWhitespace());
      assertFalse(jDOMParser0.isCoalescing());
      assertFalse(jDOMParser0.isIgnoringComments());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DOMParser dOMParser0 = new DOMParser();
      boolean boolean0 = dOMParser0.isNamespaceAware();
      assertFalse(dOMParser0.isCoalescing());
      assertTrue(dOMParser0.isExpandEntityReferences());
      assertTrue(boolean0);
      assertFalse(dOMParser0.isIgnoringElementContentWhitespace());
      assertFalse(dOMParser0.isValidating());
      assertFalse(dOMParser0.isIgnoringComments());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDOMParser jDOMParser0 = new JDOMParser();
      assertFalse(jDOMParser0.isIgnoringElementContentWhitespace());
      
      jDOMParser0.setIgnoringElementContentWhitespace(true);
      boolean boolean0 = jDOMParser0.isIgnoringElementContentWhitespace();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("\"wk39RY@!X", "");
      URL uRL0 = mockFile0.toURL();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "LfyC+)w4[c:6s;J{W");
      boolean boolean0 = documentContainer0.isIgnoringElementContentWhitespace();
      assertFalse(boolean0);
      assertFalse(documentContainer0.isValidating());
      assertFalse(documentContainer0.isIgnoringComments());
      assertFalse(documentContainer0.isCoalescing());
      assertTrue(documentContainer0.isNamespaceAware());
      assertTrue(documentContainer0.isExpandEntityReferences());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      assertFalse(documentContainer0.isIgnoringComments());
      
      documentContainer0.setIgnoringComments(true);
      boolean boolean0 = documentContainer0.isIgnoringComments();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("\"wk39RY@!X", "");
      URL uRL0 = mockFile0.toURL();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "LfyC+)w4[c:6s;J{W");
      boolean boolean0 = documentContainer0.isIgnoringComments();
      assertFalse(documentContainer0.isIgnoringElementContentWhitespace());
      assertFalse(documentContainer0.isValidating());
      assertFalse(boolean0);
      assertFalse(documentContainer0.isCoalescing());
      assertTrue(documentContainer0.isNamespaceAware());
      assertTrue(documentContainer0.isExpandEntityReferences());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDOMParser jDOMParser0 = new JDOMParser();
      boolean boolean0 = jDOMParser0.isExpandEntityReferences();
      assertFalse(jDOMParser0.isIgnoringComments());
      assertFalse(jDOMParser0.isValidating());
      assertFalse(jDOMParser0.isCoalescing());
      assertTrue(jDOMParser0.isNamespaceAware());
      assertTrue(boolean0);
      assertFalse(jDOMParser0.isIgnoringElementContentWhitespace());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DOMParser dOMParser0 = new DOMParser();
      assertTrue(dOMParser0.isExpandEntityReferences());
      
      dOMParser0.setExpandEntityReferences(false);
      boolean boolean0 = dOMParser0.isExpandEntityReferences();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DOMParser dOMParser0 = new DOMParser();
      assertFalse(dOMParser0.isCoalescing());
      
      dOMParser0.setCoalescing(true);
      boolean boolean0 = dOMParser0.isCoalescing();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("\"wk39RY@!X", "");
      URL uRL0 = mockFile0.toURL();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "LfyC+)w4[c:6s;J{W");
      boolean boolean0 = documentContainer0.isCoalescing();
      assertFalse(documentContainer0.isValidating());
      assertFalse(documentContainer0.isIgnoringComments());
      assertFalse(boolean0);
      assertTrue(documentContainer0.isExpandEntityReferences());
      assertTrue(documentContainer0.isNamespaceAware());
      assertFalse(documentContainer0.isIgnoringElementContentWhitespace());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Ud-![|++}<T");
      URL uRL0 = mockFile0.toURL();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "Ud-![|++}<T");
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        documentContainer0.parseXML(sequenceInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported XML model: Ud-![|++}<T
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDOMParser jDOMParser0 = new JDOMParser();
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      // Undeclared exception!
      try { 
        jDOMParser0.parseXML(pipedInputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/jdom/input/SAXBuilder
         //
         verifyException("org.apache.commons.jxpath.xml.JDOMParser", e);
      }
  }
}
