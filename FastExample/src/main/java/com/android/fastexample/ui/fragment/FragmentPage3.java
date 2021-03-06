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

package com.android.fastexample.ui.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.fastexample.R;
import com.android.fastlibrary.ui.fragment.BaseFragment;

public class FragmentPage3 extends BaseFragment {

  @Override
  public void onAttach(Activity activity) {
    super.onAttach(activity);
    System.out.println("CCCCCCCCCC____onAttach");
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    System.out.println("CCCCCCCCCC____onCreate");
  }

  //@Override
  //public View onCreateView(LayoutInflater inflater, ViewGroup container,
  //                         Bundle savedInstanceState) {
  //    System.out.println("CCCCCCCCCC____onCreateView");
  //    return inflater.inflate(R.layout.fragment_3, container, false);
  //}

  @Override protected View setRootView(LayoutInflater inflater, ViewGroup container,
      Bundle bundle) {
    return inflater.inflate(R.layout.fragment_3, container, false);
  }

  @Override
  public void onActivityCreated(Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    System.out.println("CCCCCCCCCC____onActivityCreated");
  }

  @Override
  public void onStart() {
    super.onStart();
    System.out.println("CCCCCCCCCC____onStart");
  }

  @Override
  public void onResume() {
    super.onResume();
    System.out.println("CCCCCCCCCC____onResume");
  }

  @Override
  public void onPause() {
    super.onPause();
    System.out.println("CCCCCCCCCC____onPause");
  }

  @Override
  public void onStop() {
    super.onStop();
    System.out.println("CCCCCCCCCC____onStop");
  }

  @Override
  public void onDestroyView() {
    super.onDestroyView();
    System.out.println("CCCCCCCCCC____onDestroyView");
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
    System.out.println("CCCCCCCCCC____onDestroy");
  }

  @Override
  public void onDetach() {
    super.onDetach();
    System.out.println("CCCCCCCCCC____onDetach");
  }
}