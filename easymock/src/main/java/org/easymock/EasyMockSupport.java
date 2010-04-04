/**
 * Copyright 2001-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.easymock;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.easymock.internal.MockBuilder;

/**
 * Helper class to be used to keep tracks of mocks easily. See EasyMock
 * documentation and SupportTest sample
 * 
 * @author Henri Tremblay
 */
public class EasyMockSupport {

    /** List of all controls created */
    protected final List<IMocksControl> controls = new ArrayList<IMocksControl>(
            5);

    /**
     * @deprecated Use {@link #createMockBuilder(Class)} instead
     */
    @Deprecated
    public <T> T createStrictMock(Class<T> toMock, Method... mockedMethods) {
        return createStrictControl().createMock(toMock, mockedMethods);
    }

    /**
     * @deprecated Use {@link #createMockBuilder(Class)} instead
     */
    @Deprecated
    public <T> T createStrictMock(String name, Class<T> toMock,
            Method... mockedMethods) {
        return createStrictControl().createMock(name, toMock, mockedMethods);
    }

    /**
     * @deprecated Use {@link #createMockBuilder(Class)} instead
     */
    @Deprecated
    public <T> T createStrictMock(Class<T> toMock,
            ConstructorArgs constructorArgs, Method... mockedMethods) {
        return createStrictControl().createMock(toMock, constructorArgs,
                mockedMethods);
    }

    /**
     * @deprecated Use {@link #createMockBuilder(Class)} instead
     */
    @Deprecated
    public <T> T createStrictMock(String name, Class<T> toMock,
            ConstructorArgs constructorArgs, Method... mockedMethods) {
        return createStrictControl().createMock(name, toMock, constructorArgs,
                mockedMethods);
    }

    /**
     * @deprecated Use {@link #createMockBuilder(Class)} instead
     */
    @Deprecated
    public <T> T createMock(Class<T> toMock, Method... mockedMethods) {
        return createControl().createMock(toMock, mockedMethods);
    }

    /**
     * @deprecated Use {@link #createMockBuilder(Class)} instead
     */
    @Deprecated
    public <T> T createMock(String name, Class<T> toMock,
            Method... mockedMethods) {
        return createControl().createMock(name, toMock, mockedMethods);
    }

    /**
     * @deprecated Use {@link #createMockBuilder(Class)} instead
     */
    @Deprecated
    public <T> T createMock(Class<T> toMock, ConstructorArgs constructorArgs,
            Method... mockedMethods) {
        return createControl().createMock(toMock, constructorArgs,
                mockedMethods);
    }

    /**
     * @deprecated Use {@link #createMockBuilder(Class)} instead
     */
    @Deprecated
    public <T> T createMock(String name, Class<T> toMock,
            ConstructorArgs constructorArgs, Method... mockedMethods) {
        return createControl().createMock(name, toMock, constructorArgs,
                mockedMethods);
    }

    /**
     * @deprecated Use {@link #createMockBuilder(Class)} instead
     */
    @Deprecated
    public <T> T createNiceMock(Class<T> toMock, Method... mockedMethods) {
        return createNiceControl().createMock(toMock, mockedMethods);
    }

    /**
     * @deprecated Use {@link #createMockBuilder(Class)} instead
     */
    @Deprecated
    public <T> T createNiceMock(String name, Class<T> toMock,
            Method... mockedMethods) {
        return createNiceControl().createMock(name, toMock, mockedMethods);
    }

    /**
     * @deprecated Use {@link #createMockBuilder(Class)} instead
     */
    @Deprecated
    public <T> T createNiceMock(Class<T> toMock,
            ConstructorArgs constructorArgs, Method... mockedMethods) {
        return createNiceControl().createMock(toMock, constructorArgs,
                mockedMethods);
    }

    /**
     * @deprecated Use {@link #createMockBuilder(Class)} instead
     */
    @Deprecated
    public <T> T createNiceMock(String name, Class<T> toMock,
            ConstructorArgs constructorArgs, Method... mockedMethods) {
        return createNiceControl().createMock(name, toMock, constructorArgs,
                mockedMethods);
    }

    /**
     * Creates a mock object that implements the given interface, order checking
     * is enabled by default.
     * 
     * @param <T>
     *            the interface that the mock object should implement.
     * @param toMock
     *            the class of the interface that the mock object should
     *            implement.
     * @return the mock object.
     */
    public <T> T createStrictMock(Class<T> toMock) {
        return createStrictControl().createMock(toMock);
    }

    /**
     * Creates a mock object that implements the given interface, order checking
     * is enabled by default.
     * 
     * @param name
     *            the name of the mock object.
     * @param toMock
     *            the class of the interface that the mock object should
     *            implement.
     * @param <T>
     *            the interface that the mock object should implement.
     * @return the mock object.
     * @throws IllegalArgumentException
     *             if the name is not a valid Java identifier.
     */
    public <T> T createStrictMock(String name, Class<T> toMock) {
        return createStrictControl().createMock(name, toMock);
    }

    /**
     * Creates a mock object that implements the given interface, order checking
     * is disabled by default.
     * 
     * @param <T>
     *            the interface that the mock object should implement.
     * @param toMock
     *            the class of the interface that the mock object should
     *            implement.
     * @return the mock object.
     */
    public <T> T createMock(Class<T> toMock) {
        return createControl().createMock(toMock);
    }

    /**
     * Creates a mock object that implements the given interface, order checking
     * is disabled by default.
     * 
     * @param name
     *            the name of the mock object.
     * @param toMock
     *            the class of the interface that the mock object should
     *            implement.
     * 
     * @param <T>
     *            the interface that the mock object should implement.
     * @return the mock object.
     * @throws IllegalArgumentException
     *             if the name is not a valid Java identifier.
     */
    public <T> T createMock(String name, Class<T> toMock) {
        return createControl().createMock(name, toMock);
    }

    /**
     * Creates a mock object that implements the given interface, order checking
     * is disabled by default, and the mock object will return <code>0</code>,
     * <code>null</code> or <code>false</code> for unexpected invocations.
     * 
     * @param <T>
     *            the interface that the mock object should implement.
     * @param toMock
     *            the class of the interface that the mock object should
     *            implement.
     * @return the mock object.
     */
    public <T> T createNiceMock(Class<T> toMock) {
        return createNiceControl().createMock(toMock);
    }

    /**
     * Creates a mock object that implements the given interface, order checking
     * is disabled by default, and the mock object will return <code>0</code>,
     * <code>null</code> or <code>false</code> for unexpected invocations.
     * 
     * @param name
     *            the name of the mock object.
     * @param toMock
     *            the class of the interface that the mock object should
     *            implement.
     * 
     * @param <T>
     *            the interface that the mock object should implement.
     * @return the mock object.
     * @throws IllegalArgumentException
     *             if the name is not a valid Java identifier.
     */
    public <T> T createNiceMock(String name, Class<T> toMock) {
        return createNiceControl().createMock(name, toMock);
    }

    /**
     * Creates a control, order checking is enabled by default.
     * 
     * @return the control.
     */
    public IMocksControl createStrictControl() {
        IMocksControl ctrl = EasyMock.createStrictControl();
        controls.add(ctrl);
        return ctrl;
    }

    /**
     * Create a mock builder allowing to create a partial mock for the given
     * class or interface.
     * 
     * @param <T>
     *            the interface that the mock object should implement.
     * @param toMock
     *            the class of the interface that the mock object should
     *            implement.
     * @return a mock builder to create a partial mock
     */
    public <T> IMockBuilder<T> createMockBuilder(Class<T> toMock) {
        return new MockBuilder<T>(toMock, this);
    }

    /**
     * Creates a control, order checking is disabled by default.
     * 
     * @return the control.
     */
    public IMocksControl createControl() {
        IMocksControl ctrl = EasyMock.createControl();
        controls.add(ctrl);
        return ctrl;
    }

    /**
     * Creates a control, order checking is disabled by default, and the mock
     * objects created by this control will return <code>0</code>,
     * <code>null</code> or <code>false</code> for unexpected invocations.
     * 
     * @return the control.
     */
    public IMocksControl createNiceControl() {
        IMocksControl ctrl = EasyMock.createNiceControl();
        controls.add(ctrl);
        return ctrl;
    }

    /**
     * Switches all registered mock objects (more exactly: the controls of the
     * mock objects) to replay mode. For details, see the EasyMock
     * documentation.
     */
    public void replayAll() {
        for (IMocksControl c : controls) {
            c.replay();
        }
    }

    /**
     * Resets all registered mock objects (more exactly: the controls of the
     * mock objects). For details, see the EasyMock documentation.
     */
    public void resetAll() {
        for (IMocksControl c : controls) {
            c.reset();
        }
    }

    /**
     * Verifies all registered mock objects (more exactly: the controls of the
     * mock objects).
     */
    public void verifyAll() {
        for (IMocksControl c : controls) {
            c.verify();
        }
    }

    /**
     * Resets all registered mock objects (more exactly: the controls of the
     * mock objects) and turn them to a mock with nice behavior. For details,
     * see the EasyMock documentation.
     */
    public void resetAllToNice() {
        for (IMocksControl c : controls) {
            c.resetToNice();
        }
    }

    /**
     * Resets all registered mock objects (more exactly: the controls of the
     * mock objects) and turn them to a mock with default behavior. For details,
     * see the EasyMock documentation.
     */
    public void resetAllToDefault() {
        for (IMocksControl c : controls) {
            c.resetToDefault();
        }
    }

    /**
     * Resets all registered mock objects (more exactly: the controls of the
     * mock objects) and turn them to a mock with strict behavior. For details,
     * see the EasyMock documentation.
     */
    public void resetAllToStrict() {
        for (IMocksControl c : controls) {
            c.resetToStrict();
        }
    }

}
