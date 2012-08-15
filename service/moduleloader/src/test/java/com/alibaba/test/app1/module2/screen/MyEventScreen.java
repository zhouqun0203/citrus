/*
 * Copyright (c) 2002-2012 Alibaba Group Holding Limited.
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.test.app1.module2.screen;

import com.alibaba.citrus.service.requestcontext.rundata.RunData;

public class MyEventScreen {
    private RunData rundata;

    public RunData getRunData() {
        return rundata;
    }

    public void setRunData(RunData rundata) {
        this.rundata = rundata;
    }

    public void doSomethingInteresting() throws Exception {
        rundata.setAttribute("handler", "doSomethingInteresting");
    }

    // inner class不被包含
    public static class InnerClass {
    }
}
