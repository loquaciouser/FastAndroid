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

package com.android.fastlibrary.ui.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;

/**
 * Do one thing at a time, and do well!
 *
 * @Prject: FastAndroid
 * @Location: com.android.fastlibrary.ui.fragment.CoreFragment
 * @Description: TODO Fragment基本核心模板....不建议读者更改
 * @author: loQua.Xee    loquaciouser@gmail.com
 * @date: 2014/8/16 15:54
 * @Modify-date: 2014-9-18 13:08:22
 * @Modify-description: TODO 实现Fragment状态保存,切换Fragment时避免重复加载UI
 * @Modify-author: loQua.Xee
 * @version: V2.0
 */

public abstract class CoreFragment extends Fragment {
  /**
   * 当前activity
   */
  public Activity fatherActivity;
  /**
   * 当前视图并启到缓存Fragment的作用
   */
  public View currentView;

  @Override
  public void onAttach(final Activity activity) {
    super.onAttach(activity);
    this.fatherActivity = getActivity();
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    if (currentView == null) {
      currentView = setRootView(inflater, container, savedInstanceState);
      ButterKnife.inject(currentView);
      initWidget(currentView);
      new Thread(new Runnable() {
        @Override
        public void run() {
          initAsyncData();
        }
      }).start();
      initData();
    }
    /**
     * 缓存的rootView需要判断是否已经被加过parent，如果有parent需要从parent删除此view，
     * 要不然会发生这个rootview已经有parent的错误。
     */
    ViewGroup parent = (ViewGroup) currentView.getParent();
    if (parent != null) {
      parent.removeView(currentView);
    }
    return currentView;
  }

  protected abstract View setRootView(LayoutInflater inflater, ViewGroup container,
      Bundle bundle);

  /**
   * 初始化布局控件
   */
  protected void initWidget(final View view) {
  }

  /**
   * 异步初始化数据,不能直接更改主线程中控件
   */
  protected void initAsyncData() {
  }

  /**
   * 同步初始化数据
   */
  protected void initData() {
  }
}