/*
 * Copyright (C) 2014 loQua.Xee <loquaciouser@gmail.com>
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

package com.android.fastexample.ui.activity;

import com.android.fastlibrary.ui.activity.FastLoadingActivity;

/**
 * Do one thing at a time, and do well!
 *
 * @Prject: FastAndroid
 * @Location: com.android.fastexample.ui.activity.loadingActicity
 * @Description: TODO
 * @author: 席强    xiqiang@fugao.com
 * @date: 2014/9/3 10:43
 * @version: V1.0
 */

public class loadingActicity extends FastLoadingActivity {
    private static final String TAG = "Fugao-loadingActicity";


    @Override
    protected int getRootBackground() {
        return super.getRootBackground();
    }

    @Override
    protected void onLoadingFinish() {
        openActivity(MainActivity.class);
        closeActivity();
    }
}
