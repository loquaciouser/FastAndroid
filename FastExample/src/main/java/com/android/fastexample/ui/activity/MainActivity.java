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

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.android.fastexample.R;
import com.android.fastlibrary.ui.activity.BaseActivity;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Do one thing at a time, and do well!
 *
 * @Prject: FastAndroid
 * @Location: com.android.fastexample.ui.activity.MainActivity
 * @Description: TODO
 * @author: 席强    xiqiang@fugao.com
 * @date: 2014/9/3 11:57
 * @version: V1.0
 */

public class MainActivity extends BaseActivity {
    private static final String TAG = "Fugao-MainActivity";
    @InjectView(R.id.viewPager)
    ViewPager mViewPager;

    @Override
    protected void setRootView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.inject(this);
    }
}
