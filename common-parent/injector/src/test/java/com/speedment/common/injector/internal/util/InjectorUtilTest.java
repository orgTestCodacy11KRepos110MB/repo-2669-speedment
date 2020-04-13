/*
 *
 * Copyright (c) 2006-2020, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.common.injector.internal.util;

import com.speedment.common.injector.Injector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

final class InjectorUtilTest {

    private Injector injector;
    private Foo foo;
    private Bar bar;
    private List<Object> instances;

    public static final class Foo {}
    public static final class Bar {}

    @BeforeEach
    void setup() throws InstantiationException {
        foo = new Foo();
        bar = new Bar();
        instances = Arrays.asList(foo, bar);
        injector = Injector.builder().withComponent(Foo.class, () -> foo).withComponent(Bar.class, () -> bar).build();
    }

    @Test
    void findInNotRequired() {
        final Foo expected = InjectorUtil.findIn(Foo.class, injector, instances, false);
        assertEquals(foo, expected);
        assertNull(InjectorUtil.findIn(Integer.class, injector, instances, false));
    }

    @Test
    void findInRequired() {
        assertNotNull(InjectorUtil.findIn(Foo.class, injector, instances, true));
        assertThrows(IllegalArgumentException.class, () -> InjectorUtil.findIn(Integer.class, injector, instances, true));
    }

    @Test
    void findInInjector() {
        assertSame(injector, InjectorUtil.findIn(Injector.class, injector, instances, true));
    }

}