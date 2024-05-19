
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


package org.apache.commons.jxpath.ri.model.container;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.util.Locale;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.transform.dom.DOMSource;
import org.apache.commons.jxpath.XMLDocumentContainer;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ContainerPointerFactory_ESTest extends ContainerPointerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContainerPointerFactory containerPointerFactory0 = new ContainerPointerFactory();
      QName qName0 = new QName((String) null, "V8na)n\")Yio&R}}U");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, pushbackInputStream0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      containerPointerFactory0.createNodePointer(nodePointer0, qName0, (Object) xMLDocumentContainer0);
      assertEquals(200, containerPointerFactory0.getOrder());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContainerPointerFactory containerPointerFactory0 = new ContainerPointerFactory();
      QName qName0 = new QName("6Pk5g=@=(:Q.>'{ZW", "B");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      NodePointer nodePointer0 = containerPointerFactory0.createNodePointer((NodePointer) null, qName0, (Object) xMLDocumentContainer0);
      assertNull(nodePointer0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ContainerPointerFactory containerPointerFactory0 = new ContainerPointerFactory();
      QName qName0 = new QName("6Pk5g=@=(:Q.>'{ZW", "B");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.ITALY;
      NodePointer nodePointer0 = containerPointerFactory0.createNodePointer(qName0, (Object) xMLDocumentContainer0, locale0);
      NodePointer nodePointer1 = containerPointerFactory0.createNodePointer(nodePointer0, qName0, (Object) locale0);
      assertNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ContainerPointerFactory containerPointerFactory0 = new ContainerPointerFactory();
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = containerPointerFactory0.createNodePointer(qName0, (Object) "", locale0);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ContainerPointerFactory containerPointerFactory0 = new ContainerPointerFactory();
      int int0 = containerPointerFactory0.getOrder();
      assertEquals(200, int0);
  }
}
